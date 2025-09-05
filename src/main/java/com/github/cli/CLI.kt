package com.github.cli

import com.github.file.FileHandling
import com.github.techniques.deObfuscate.DeObfusTechnique
import com.github.techniques.deObfuscate.DeObfuscateRunner
import com.github.techniques.obfuscate.ObfuscateRunner
import com.github.techniques.obfuscate.ObfusTechnique
import com.varabyte.kotter.foundation.anim.text
import com.varabyte.kotter.foundation.anim.textAnimOf
import com.varabyte.kotter.foundation.input.input
import com.varabyte.kotter.foundation.input.onInputEntered
import com.varabyte.kotter.foundation.runUntilSignal
import com.varabyte.kotter.foundation.session
import com.varabyte.kotter.foundation.text.blue
import com.varabyte.kotter.foundation.text.green
import com.varabyte.kotter.foundation.text.red
import com.varabyte.kotter.foundation.text.rgb
import com.varabyte.kotter.foundation.text.text
import com.varabyte.kotter.foundation.text.textLine
import com.varabyte.kotter.runtime.Session
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.math.sin
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun runCli() {
    session {
        var repeatSession = true
        while (repeatSession) {
            repeatSession = mainSession()
        }
    }
}

fun Session.mainSession(): Boolean {
    var repeatSession = false
    headerSection()
    val (name, code) = fileSelection()
    val obfus = obfusSelection()
    if(obfus){
        val tech = obfusTechniqueSelection() ?: return false
        obfuscation(code, name + "-obfus", tech)
    }else{
        val tech = deObfusTechniqueSelection() ?: return false
        DeObfuscation(code, name + "-deObfus", tech)
    }
    repeatSession = lastOptions()
    return repeatSession
}

fun Session.lastOptions(): Boolean {
    var repeatSession = false
    section {
        textLine()
        textLine("What next?")
        textLine("1. Choose another file")
        textLine("2. Exit")
        input()
    }.runUntilSignal {
        onInputEntered {
            val option = input.toInt()
            when (option) {
                1 -> repeatSession = true
                2 -> {
                    println("Thanks for using our tool!")
                }

                else -> {
                    println("Invalid option")
                }
            }
            signal()
        }
    }
    return repeatSession
}

fun Session.obfuscation(code: String, name: String, tech: ObfusTechnique): String {
    var finished = false
    val spinnerAnim = textAnimOf(listOf("\\", "|", "/", "-"), 125.milliseconds)
    val thinkingAnim = textAnimOf(listOf("", ".", "..", "..."), 500.milliseconds)
    var obfuscated = ""
    section {
        if (!finished) {
            text(spinnerAnim)
        } else {
            text("✓")
        }
        textLine()
        text(" Doing heavy obfuscation work")
        if (!finished) {
            text(thinkingAnim)
        } else {
            text("... Done!")
        }
    }.run {
        obfuscated = ObfuscateRunner.runTechnique(tech, code)
        FileHandling.writeFile(name, obfuscated)
        runBlocking {
            delay(3.seconds)
        }
        finished = true
    }
    section {
        textLine()
        textLine("Your obfuscated code is ready! Check your test folder. ")
    }.run()
    return obfuscated
}

fun Session.DeObfuscation(code: String, name: String, tech: DeObfusTechnique): String {
    var finished = false
    val spinnerAnim = textAnimOf(listOf("\\", "|", "/", "-"), 125.milliseconds)
    val thinkingAnim = textAnimOf(listOf("", ".", "..", "..."), 500.milliseconds)
    var obfuscated = ""
    section {
        if (!finished) {
            text(spinnerAnim)
        } else {
            text("✓")
        }
        textLine()
        text(" Doing heavy De-Obfuscation work")
        if (!finished) {
            text(thinkingAnim)
        } else {
            text("... Done!")
        }
    }.run {
        obfuscated = DeObfuscateRunner.runTechnique(tech, code)
        FileHandling.writeFile(name, obfuscated)
        runBlocking {
            delay(3.seconds)
        }
        finished = true
    }
    section {
        textLine()
        textLine("Your simplified code is ready! Check your test folder. ")
    }.run()
    return obfuscated
}

fun Session.obfusSelection(): Boolean {
    var result: Boolean = false
    section {
        green {
            textLine()
            textLine("Do you want to obfuscate or de-obfuscate?")
            textLine("1. Obfuscate")
            textLine("2. De-obfuscate")
            text("Input the number: ")
            input()
        }
    }.runUntilSignal {
        onInputEntered {
            val method = input.toInt()
            result = when (method) {
                1 -> true
                2 -> false
                else -> {
                    println("Invalid option")
                    return@onInputEntered
                }
            }
            signal()
        }
    }
    return result
}

fun Session.obfusTechniqueSelection(): ObfusTechnique? {
    var tech: ObfusTechnique? = null
    section {
        blue {
            textLine()
            textLine("What obfuscation method do you want to use?")
            textLine("1. Dead code")
            textLine("2. Variable renaming")
            textLine("3. Expression rewriting")
            textLine("4. All!")
            text("Input the number: ")
            input()
        }
    }.runUntilSignal {
        onInputEntered {
            val method = input.toInt()
            tech = when (method) {
                1 -> ObfusTechnique.DEAD_CODE
                2 -> ObfusTechnique.NAME_CHANGER
                3 -> ObfusTechnique.EXPRESSION
                4 -> ObfusTechnique.ALL
                else -> {
                    println("Invalid option")
                    return@onInputEntered
                }
            }
            signal()
        }
    }
    return tech
}
fun Session.deObfusTechniqueSelection(): DeObfusTechnique? {
    var tech: DeObfusTechnique? = null
    section {
        blue {
            textLine()
            textLine("What obfuscation method do you want to use?")
            textLine("1. Expression simplification")
            textLine("2. Variable renaming")
            textLine("4. All!")
            text("Input the number: ")
            input()
        }
    }.runUntilSignal {
        onInputEntered {
            val method = input.toInt()
            tech = when (method) {
                1 -> DeObfusTechnique.SIMPLIFY_EXPRESSION
                2 -> DeObfusTechnique.RENAMER
                else -> {
                    println("Invalid option")
                    return@onInputEntered
                }
            }
            signal()
        }
    }
    return tech
}

fun Session.fileSelection(): Pair<String, String> {
    var name = ""
    section {
        red {
            text("Now tell me, what is the name of your mini-c code?: ")
            input()
        }
    }.runUntilSignal {
        onInputEntered {
            name = input
            signal()
        }
    }
    var code = FileHandling.readFile(name)
    return Pair(name, code)
}

fun Session.headerSection() = section {
    green {
        textLine(
            """


            _____ _      __           _____ 
            |  _  | |    / _|         /  __ \
            | | | | |__ | |_ _   _ ___| /  \/
            | | | | '_ \|  _| | | / __| |    
            \ \_/ / |_) | | | |_| \__ \ \__/\
            \___/|_.__/|_|  \__,_|___/\____/
                                 

                """
        )
    }
    rgb(0xFF00FF) {
        textLine("This is a simple CLI for obfuscating your mini-c code, so no one else can read it (except you of course!).")
        textLine()
    }

}.run()