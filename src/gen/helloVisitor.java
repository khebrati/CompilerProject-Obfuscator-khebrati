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
	 * Visit a parse tree produced by {@link helloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(helloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(helloParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(helloParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(helloParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclarationStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(helloParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(helloParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(helloParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(helloParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exitStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStatement(helloParser.ExitStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(helloParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printlnStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnStatement(helloParser.PrintlnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(helloParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(helloParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readDouble}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadDouble(helloParser.ReadDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(helloParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toString}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToString(helloParser.ToStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(helloParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(helloParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperation(helloParser.UnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInt(helloParser.ReadIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readLine}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadLine(helloParser.ReadLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(helloParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(helloParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(helloParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#assignmentOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOp(helloParser.AssignmentOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(helloParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(helloParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(helloParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(helloParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(helloParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(helloParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(helloParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(helloParser.BooleanContext ctx);
}