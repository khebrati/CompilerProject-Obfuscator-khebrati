// Generated from /home/erfan/Source/Obfusc2/src/main/java/com/github/Minic.g4 by ANTLR 4.13.2
package com.github.gen;
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
	 * Visit a parse tree produced by the {@code assignmentOrFunCall}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOrFunCall(MinicParser.AssignmentOrFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decOrFunDefinition}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx);
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
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MinicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MinicParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#assignBodyOrArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignBodyOrArgsList(MinicParser.AssignBodyOrArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#assignBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignBody(MinicParser.AssignBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#assignmentOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOp(MinicParser.AssignmentOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#callArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgsList(MinicParser.CallArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(MinicParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#decOrFunBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecOrFunBody(MinicParser.DecOrFunBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#paramListBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamListBlock(MinicParser.ParamListBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(MinicParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#declarationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationBody(MinicParser.DeclarationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MinicParser.ParamContext ctx);
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
	 * Visit a parse tree produced by the {@code variableOrFunctionCall}
	 * labeled alternative in {@link MinicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrFunctionCall(MinicParser.VariableOrFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#argsListOrNothing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsListOrNothing(MinicParser.ArgsListOrNothingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinicParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(MinicParser.ParExpressionContext ctx);
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