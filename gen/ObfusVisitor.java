// Generated from /home/erfan/Source/ObfusC/src/Obfus.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ObfusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ObfusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ObfusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ObfusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ObfusParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(ObfusParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(ObfusParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationOrFunction}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationOrFunction(ObfusParser.DeclarationOrFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ObfusParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ObfusParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(ObfusParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exitStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStatement(ObfusParser.ExitStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(ObfusParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printlnStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnStatement(ObfusParser.PrintlnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObfusParser#declarationOrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationOrFun(ObfusParser.DeclarationOrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObfusParser#decOrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecOrFun(ObfusParser.DecOrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObfusParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ObfusParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObfusParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ObfusParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObfusParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(ObfusParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObfusParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ObfusParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(ObfusParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readDouble}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadDouble(ObfusParser.ReadDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(ObfusParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toString}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToString(ObfusParser.ToStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(ObfusParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(ObfusParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperation(ObfusParser.UnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInt(ObfusParser.ReadIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readLine}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadLine(ObfusParser.ReadLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObfusParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(ObfusParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObfusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ObfusParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObfusParser#assignmentOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOp(ObfusParser.AssignmentOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(ObfusParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(ObfusParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(ObfusParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(ObfusParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ObfusParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(ObfusParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ObfusParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(ObfusParser.BooleanContext ctx);
}