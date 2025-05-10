// Generated from /home/erfan/Source/ObfusC/src/Obfus.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObfusParser}.
 */
public interface ObfusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ObfusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ObfusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObfusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ObfusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ObfusParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ObfusParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(ObfusParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(ObfusParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(ObfusParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(ObfusParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationOrFunction}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationOrFunction(ObfusParser.DeclarationOrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationOrFunction}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationOrFunction(ObfusParser.DeclarationOrFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ObfusParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ObfusParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ObfusParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ObfusParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ObfusParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ObfusParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exitStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExitStatement(ObfusParser.ExitStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exitStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExitStatement(ObfusParser.ExitStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(ObfusParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(ObfusParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnStatement(ObfusParser.PrintlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnStatement}
	 * labeled alternative in {@link ObfusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnStatement(ObfusParser.PrintlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObfusParser#declarationOrFun}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationOrFun(ObfusParser.DeclarationOrFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObfusParser#declarationOrFun}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationOrFun(ObfusParser.DeclarationOrFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObfusParser#decOrFun}.
	 * @param ctx the parse tree
	 */
	void enterDecOrFun(ObfusParser.DecOrFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObfusParser#decOrFun}.
	 * @param ctx the parse tree
	 */
	void exitDecOrFun(ObfusParser.DecOrFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObfusParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ObfusParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObfusParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ObfusParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObfusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ObfusParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObfusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ObfusParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObfusParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(ObfusParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObfusParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(ObfusParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObfusParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ObfusParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObfusParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ObfusParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(ObfusParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(ObfusParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readDouble}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadDouble(ObfusParser.ReadDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readDouble}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadDouble(ObfusParser.ReadDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(ObfusParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(ObfusParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toString}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterToString(ObfusParser.ToStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toString}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitToString(ObfusParser.ToStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(ObfusParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(ObfusParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(ObfusParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(ObfusParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(ObfusParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(ObfusParser.UnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadInt(ObfusParser.ReadIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadInt(ObfusParser.ReadIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readLine}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadLine(ObfusParser.ReadLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readLine}
	 * labeled alternative in {@link ObfusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadLine(ObfusParser.ReadLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObfusParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(ObfusParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObfusParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(ObfusParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObfusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ObfusParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObfusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ObfusParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObfusParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOp(ObfusParser.AssignmentOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObfusParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOp(ObfusParser.AssignmentOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(ObfusParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(ObfusParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(ObfusParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(ObfusParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(ObfusParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(ObfusParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStringType(ObfusParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link ObfusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStringType(ObfusParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterInt(ObfusParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitInt(ObfusParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat(ObfusParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat(ObfusParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterString(ObfusParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitString(ObfusParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(ObfusParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ObfusParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(ObfusParser.BooleanContext ctx);
}