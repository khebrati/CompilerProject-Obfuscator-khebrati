package gen;// Generated from /home/erfan/Source/MinicC/src/Minic.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MinicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MinicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MinicParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MinicParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(MinicParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(MinicParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(MinicParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationOrFunction}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationOrFunction(MinicParser.DeclarationOrFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MinicParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MinicParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(MinicParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exitStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStatement(MinicParser.ExitStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(MinicParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printlnStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnStatement(MinicParser.PrintlnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#declarationOrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationOrFun(MinicParser.DeclarationOrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#decOrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecOrFun(MinicParser.DecOrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MinicParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MinicParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(MinicParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MinicParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(MinicParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readDouble}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadDouble(MinicParser.ReadDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(MinicParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toString}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToString(MinicParser.ToStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(MinicParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(MinicParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperation(MinicParser.UnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInt(MinicParser.ReadIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readLine}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadLine(MinicParser.ReadLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(MinicParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MinicParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#assignmentOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOp(MinicParser.AssignmentOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(MinicParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(MinicParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(MinicParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(MinicParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(MinicParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(MinicParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MinicParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(MinicParser.BooleanContext ctx);
}