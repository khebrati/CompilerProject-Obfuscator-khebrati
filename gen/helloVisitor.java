// Generated from /home/erfan/Source/ObfusC/src/hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link helloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface helloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link helloParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(helloParser.StartContext ctx);
}