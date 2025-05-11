package gen;// Generated from /home/erfan/Source/ObfusC/src/Minic.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinicParser}.
 */
public interface MinicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinicParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MinicParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinicParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MinicParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MinicParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MinicParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(MinicParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(MinicParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(MinicParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(MinicParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationOrFunction}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationOrFunction(MinicParser.DeclarationOrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationOrFunction}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationOrFunction(MinicParser.DeclarationOrFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MinicParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MinicParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MinicParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MinicParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MinicParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MinicParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exitStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExitStatement(MinicParser.ExitStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exitStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExitStatement(MinicParser.ExitStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MinicParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MinicParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnStatement(MinicParser.PrintlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnStatement(MinicParser.PrintlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinicParser#declarationOrFun}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationOrFun(MinicParser.DeclarationOrFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinicParser#declarationOrFun}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationOrFun(MinicParser.DeclarationOrFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinicParser#decOrFun}.
	 * @param ctx the parse tree
	 */
	void enterDecOrFun(MinicParser.DecOrFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinicParser#decOrFun}.
	 * @param ctx the parse tree
	 */
	void exitDecOrFun(MinicParser.DecOrFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinicParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MinicParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinicParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MinicParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinicParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MinicParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinicParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MinicParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinicParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(MinicParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinicParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(MinicParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinicParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MinicParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinicParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MinicParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(MinicParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(MinicParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readDouble}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadDouble(MinicParser.ReadDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readDouble}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadDouble(MinicParser.ReadDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(MinicParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(MinicParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toString}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterToString(MinicParser.ToStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toString}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitToString(MinicParser.ToStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(MinicParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(MinicParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(MinicParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(MinicParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(MinicParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(MinicParser.UnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadInt(MinicParser.ReadIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadInt(MinicParser.ReadIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readLine}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadLine(MinicParser.ReadLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readLine}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadLine(MinicParser.ReadLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinicParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(MinicParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinicParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(MinicParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinicParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MinicParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinicParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MinicParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinicParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOp(MinicParser.AssignmentOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinicParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOp(MinicParser.AssignmentOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MinicParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MinicParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(MinicParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(MinicParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(MinicParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(MinicParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStringType(MinicParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link MinicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStringType(MinicParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterInt(MinicParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitInt(MinicParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat(MinicParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat(MinicParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterString(MinicParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitString(MinicParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(MinicParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link MinicParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(MinicParser.BooleanContext ctx);
}