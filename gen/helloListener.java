// Generated from /home/erfan/Source/ObfusC/src/hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helloParser}.
 */
public interface helloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helloParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(helloParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(helloParser.StartContext ctx);
}