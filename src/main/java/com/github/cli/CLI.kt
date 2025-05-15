package com.github.cli

import com.varabyte.kotter.foundation.input.input
import com.varabyte.kotter.foundation.input.onInputChanged
import com.varabyte.kotter.foundation.input.onInputEntered
import com.varabyte.kotter.foundation.runUntilSignal
import com.varabyte.kotter.foundation.session
import com.varabyte.kotter.foundation.text.blue
import com.varabyte.kotter.foundation.text.green
import com.varabyte.kotter.foundation.text.red
import com.varabyte.kotter.foundation.text.rgb
import com.varabyte.kotter.foundation.text.text
import com.varabyte.kotter.foundation.text.textLine

fun runCli() {
    session {
        section {
            green{
                textLine("""


            _____ _      __           _____ 
            |  _  | |    / _|         /  __ \
            | | | | |__ | |_ _   _ ___| /  \/
            | | | | '_ \|  _| | | / __| |    
            \ \_/ / |_) | | | |_| \__ \ \__/\
            \___/|_.__/|_|  \__,_|___/\____/
                                 

                """)
            }
            rgb(0xFF00FF){
                textLine("This is a simple CLI for obfuscating your mini-c code, so no one else can read it (except you of course!).")
                textLine()
            }

        }.run()
        var name = ""
        section {
            red{
                text("Now tell me, where is the name of your mini-c code?: ")
                input()
                textLine()
            }
        }.runUntilSignal {
            onInputEntered {
                name = input
                signal()
            }
        }
        section {
            blue{
                textLine("What obfuscation method do you want to use?")
            }
        }.run()


    }
}
