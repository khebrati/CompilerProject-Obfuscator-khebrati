// Generated from /home/erfan/Source/ObfusC/src/hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helloParser}.
 */
public interface helloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(helloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(helloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(helloParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(helloParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(helloParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(helloParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(helloParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(helloParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(helloParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(helloParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(helloParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(helloParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(helloParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(helloParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(helloParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(helloParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exitStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExitStatement(helloParser.ExitStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exitStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExitStatement(helloParser.ExitStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(helloParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(helloParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnStatement(helloParser.PrintlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnStatement}
	 * labeled alternative in {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnStatement(helloParser.PrintlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(helloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(helloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(helloParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(helloParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readDouble}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadDouble(helloParser.ReadDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readDouble}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadDouble(helloParser.ReadDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(helloParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(helloParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toString}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterToString(helloParser.ToStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toString}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitToString(helloParser.ToStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(helloParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(helloParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(helloParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(helloParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(helloParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(helloParser.UnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadInt(helloParser.ReadIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadInt(helloParser.ReadIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readLine}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadLine(helloParser.ReadLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readLine}
	 * labeled alternative in {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadLine(helloParser.ReadLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(helloParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(helloParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(helloParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(helloParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(helloParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(helloParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOp(helloParser.AssignmentOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOp(helloParser.AssignmentOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(helloParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(helloParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(helloParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(helloParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(helloParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(helloParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStringType(helloParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link helloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStringType(helloParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterInt(helloParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitInt(helloParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat(helloParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat(helloParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterString(helloParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitString(helloParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(helloParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link helloParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(helloParser.BooleanContext ctx);
}