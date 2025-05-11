// Generated from /home/erfan/Source/Obfusc2/src/main/java/com/github/Minic.g4 by ANTLR 4.13.2
package com.github.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MinicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, FloatingPointLiteral=2, StringLiteral=3, BooleanLiteral=4, 
		SEMI=5, WS=6, BLOCK_COMMENT=7, LINE_COMMENT=8, IF_KEYWORD=9, ELSE_KEYWORD=10, 
		WHILE_KEYWORD=11, BREAK_KEYWORD=12, CONTINUE_KEYWORD=13, RETURN_KEYWORD=14, 
		EXIT_KEYWORD=15, READ_INT_KEYWORD=16, READ_DOUBLE_KEYWORD=17, READ_LINE_KEYWORD=18, 
		TO_STRING_KEYWORD=19, PRINT_KEYWORD=20, PRINTLN_KEYWORD=21, INT_TYPE=22, 
		DOUBLE_TYPE=23, STRING_TYPE=24, BOOL_TYPE=25, MUL=26, DIV=27, PLUS=28, 
		MINUS=29, MOD=30, LT=31, GT=32, LTEQ=33, GTEQ=34, ASSIGN=35, EQ=36, NOTEQ=37, 
		NOT=38, AND=39, OR=40, LPAR=41, RPAR=42, LBRACE=43, RBRACE=44, COMMA=45, 
		Identifier=46;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignBodyOrArgsList = 2, RULE_assignBody = 3, 
		RULE_assignmentOp = 4, RULE_callArgsList = 5, RULE_arg = 6, RULE_decOrFunBody = 7, 
		RULE_paramListBlock = 8, RULE_paramList = 9, RULE_declarationBody = 10, 
		RULE_param = 11, RULE_block = 12, RULE_expression = 13, RULE_argsListOrNothing = 14, 
		RULE_parExpression = 15, RULE_type = 16, RULE_literal = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignBodyOrArgsList", "assignBody", "assignmentOp", 
			"callArgsList", "arg", "decOrFunBody", "paramListBlock", "paramList", 
			"declarationBody", "param", "block", "expression", "argsListOrNothing", 
			"parExpression", "type", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", null, null, null, "'if'", "'else'", 
			"'while'", "'break'", "'continue'", "'return'", "'exit'", "'readInt'", 
			"'readDouble'", "'readLine'", "'toString'", "'print'", "'println'", "'int'", 
			"'double'", "'string'", "'bool'", "'*'", "'/'", "'+'", "'-'", "'%'", 
			"'<'", "'>'", "'<='", "'>='", "'='", "'=='", "'!='", "'!'", "'&&'", "'||'", 
			"'('", "')'", "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "FloatingPointLiteral", "StringLiteral", "BooleanLiteral", 
			"SEMI", "WS", "BLOCK_COMMENT", "LINE_COMMENT", "IF_KEYWORD", "ELSE_KEYWORD", 
			"WHILE_KEYWORD", "BREAK_KEYWORD", "CONTINUE_KEYWORD", "RETURN_KEYWORD", 
			"EXIT_KEYWORD", "READ_INT_KEYWORD", "READ_DOUBLE_KEYWORD", "READ_LINE_KEYWORD", 
			"TO_STRING_KEYWORD", "PRINT_KEYWORD", "PRINTLN_KEYWORD", "INT_TYPE", 
			"DOUBLE_TYPE", "STRING_TYPE", "BOOL_TYPE", "MUL", "DIV", "PLUS", "MINUS", 
			"MOD", "LT", "GT", "LTEQ", "GTEQ", "ASSIGN", "EQ", "NOTEQ", "NOT", "AND", 
			"OR", "LPAR", "RPAR", "LBRACE", "RBRACE", "COMMA", "Identifier"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Minic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MinicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MinicParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 79164903316000L) != 0)) {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode WHILE_KEYWORD() { return getToken(MinicParser.WHILE_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(MinicParser.SEMI, 0); }
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT_KEYWORD() { return getToken(MinicParser.PRINT_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MinicParser.SEMI, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOrFunCallContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(MinicParser.Identifier, 0); }
		public AssignBodyOrArgsListContext assignBodyOrArgsList() {
			return getRuleContext(AssignBodyOrArgsListContext.class,0);
		}
		public AssignmentOrFunCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterAssignmentOrFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitAssignmentOrFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitAssignmentOrFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExitStatementContext extends StatementContext {
		public TerminalNode EXIT_KEYWORD() { return getToken(MinicParser.EXIT_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(MinicParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MinicParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(MinicParser.SEMI, 0); }
		public ExitStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterExitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitExitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitExitStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode BREAK_KEYWORD() { return getToken(MinicParser.BREAK_KEYWORD, 0); }
		public TerminalNode SEMI() { return getToken(MinicParser.SEMI, 0); }
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecOrFunDefinitionContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MinicParser.Identifier, 0); }
		public DecOrFunBodyContext decOrFunBody() {
			return getRuleContext(DecOrFunBodyContext.class,0);
		}
		public DecOrFunDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterDecOrFunDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitDecOrFunDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitDecOrFunDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public StatementContext ifBody;
		public StatementContext elseBody;
		public TerminalNode IF_KEYWORD() { return getToken(MinicParser.IF_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE_KEYWORD() { return getToken(MinicParser.ELSE_KEYWORD, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode RETURN_KEYWORD() { return getToken(MinicParser.RETURN_KEYWORD, 0); }
		public TerminalNode SEMI() { return getToken(MinicParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintlnStatementContext extends StatementContext {
		public TerminalNode PRINTLN_KEYWORD() { return getToken(MinicParser.PRINTLN_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MinicParser.SEMI, 0); }
		public PrintlnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterPrintlnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitPrintlnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitPrintlnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				block();
				}
				break;
			case SEMI:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(SEMI);
				}
				break;
			case Identifier:
				_localctx = new AssignmentOrFunCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(Identifier);
				setState(47);
				assignBodyOrArgsList();
				}
				break;
			case INT_TYPE:
			case DOUBLE_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
				_localctx = new DecOrFunDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				type();
				setState(49);
				match(Identifier);
				setState(50);
				decOrFunBody();
				}
				break;
			case IF_KEYWORD:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(IF_KEYWORD);
				setState(53);
				parExpression();
				setState(54);
				((IfStatementContext)_localctx).ifBody = statement();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(55);
					match(ELSE_KEYWORD);
					setState(56);
					((IfStatementContext)_localctx).elseBody = statement();
					}
					break;
				}
				}
				break;
			case WHILE_KEYWORD:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				match(WHILE_KEYWORD);
				setState(60);
				parExpression();
				setState(61);
				statement();
				}
				break;
			case BREAK_KEYWORD:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				match(BREAK_KEYWORD);
				setState(64);
				match(SEMI);
				}
				break;
			case EXIT_KEYWORD:
				_localctx = new ExitStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				match(EXIT_KEYWORD);
				setState(66);
				match(LPAR);
				setState(67);
				match(RPAR);
				setState(68);
				match(SEMI);
				}
				break;
			case PRINT_KEYWORD:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				match(PRINT_KEYWORD);
				setState(70);
				parExpression();
				setState(71);
				match(SEMI);
				}
				break;
			case PRINTLN_KEYWORD:
				_localctx = new PrintlnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(73);
				match(PRINTLN_KEYWORD);
				setState(74);
				parExpression();
				setState(75);
				match(SEMI);
				}
				break;
			case RETURN_KEYWORD:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(77);
				match(RETURN_KEYWORD);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72843183194142L) != 0)) {
					{
					setState(78);
					expression(0);
					}
				}

				setState(81);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignBodyOrArgsListContext extends ParserRuleContext {
		public AssignBodyContext assignBody() {
			return getRuleContext(AssignBodyContext.class,0);
		}
		public CallArgsListContext callArgsList() {
			return getRuleContext(CallArgsListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MinicParser.SEMI, 0); }
		public AssignBodyOrArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignBodyOrArgsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterAssignBodyOrArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitAssignBodyOrArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitAssignBodyOrArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignBodyOrArgsListContext assignBodyOrArgsList() throws RecognitionException {
		AssignBodyOrArgsListContext _localctx = new AssignBodyOrArgsListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignBodyOrArgsList);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				assignBody();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				callArgsList();
				setState(86);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignBodyContext extends ParserRuleContext {
		public AssignmentOpContext assignmentOp() {
			return getRuleContext(AssignmentOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MinicParser.SEMI, 0); }
		public AssignBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterAssignBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitAssignBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitAssignBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignBodyContext assignBody() throws RecognitionException {
		AssignBodyContext _localctx = new AssignBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			assignmentOp();
			setState(91);
			expression(0);
			setState(92);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOpContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MinicParser.ASSIGN, 0); }
		public AssignmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterAssignmentOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitAssignmentOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitAssignmentOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOpContext assignmentOp() throws RecognitionException {
		AssignmentOpContext _localctx = new AssignmentOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallArgsListContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(MinicParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MinicParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MinicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MinicParser.COMMA, i);
		}
		public CallArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterCallArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitCallArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitCallArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgsListContext callArgsList() throws RecognitionException {
		CallArgsListContext _localctx = new CallArgsListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_callArgsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LPAR);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72843183194142L) != 0)) {
				{
				setState(97);
				expression(0);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(98);
					match(COMMA);
					setState(99);
					expression(0);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(107);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MinicParser.Identifier, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecOrFunBodyContext extends ParserRuleContext {
		public DeclarationBodyContext declarationBody() {
			return getRuleContext(DeclarationBodyContext.class,0);
		}
		public ParamListBlockContext paramListBlock() {
			return getRuleContext(ParamListBlockContext.class,0);
		}
		public DecOrFunBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decOrFunBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterDecOrFunBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitDecOrFunBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitDecOrFunBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecOrFunBodyContext decOrFunBody() throws RecognitionException {
		DecOrFunBodyContext _localctx = new DecOrFunBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decOrFunBody);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				declarationBody();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				paramListBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListBlockContext extends ParserRuleContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramListBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterParamListBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitParamListBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitParamListBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListBlockContext paramListBlock() throws RecognitionException {
		ParamListBlockContext _localctx = new ParamListBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paramListBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			paramList();
			setState(116);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(MinicParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MinicParser.RPAR, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MinicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MinicParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LPAR);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) {
				{
				setState(119);
				param();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					param();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(129);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationBodyContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(MinicParser.SEMI, 0); }
		public AssignmentOpContext assignmentOp() {
			return getRuleContext(AssignmentOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterDeclarationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitDeclarationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitDeclarationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationBodyContext declarationBody() throws RecognitionException {
		DeclarationBodyContext _localctx = new DeclarationBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(131);
				assignmentOp();
				setState(132);
				expression(0);
				}
			}

			setState(136);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MinicParser.Identifier, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			type();
			setState(139);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MinicParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MinicParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(LBRACE);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 79164903316000L) != 0)) {
				{
				{
				setState(142);
				statement();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesExpressionContext extends ExpressionContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ParenthesesExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitParenthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadDoubleContext extends ExpressionContext {
		public TerminalNode READ_DOUBLE_KEYWORD() { return getToken(MinicParser.READ_DOUBLE_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(MinicParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MinicParser.RPAR, 0); }
		public ReadDoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterReadDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitReadDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitReadDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToStringContext extends ExpressionContext {
		public TerminalNode TO_STRING_KEYWORD() { return getToken(MinicParser.TO_STRING_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ToStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterToString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitToString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitToString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MinicParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MinicParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MinicParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(MinicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MinicParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(MinicParser.LT, 0); }
		public TerminalNode GT() { return getToken(MinicParser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(MinicParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(MinicParser.GTEQ, 0); }
		public TerminalNode EQ() { return getToken(MinicParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(MinicParser.NOTEQ, 0); }
		public TerminalNode AND() { return getToken(MinicParser.AND, 0); }
		public TerminalNode OR() { return getToken(MinicParser.OR, 0); }
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitBinaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitBinaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperationContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MinicParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(MinicParser.MINUS, 0); }
		public UnaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadIntContext extends ExpressionContext {
		public TerminalNode READ_INT_KEYWORD() { return getToken(MinicParser.READ_INT_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(MinicParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MinicParser.RPAR, 0); }
		public ReadIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterReadInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitReadInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitReadInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadLineContext extends ExpressionContext {
		public TerminalNode READ_LINE_KEYWORD() { return getToken(MinicParser.READ_LINE_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(MinicParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MinicParser.RPAR, 0); }
		public ReadLineContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterReadLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitReadLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitReadLine(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableOrFunctionCallContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MinicParser.Identifier, 0); }
		public ArgsListOrNothingContext argsListOrNothing() {
			return getRuleContext(ArgsListOrNothingContext.class,0);
		}
		public VariableOrFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterVariableOrFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitVariableOrFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitVariableOrFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case StringLiteral:
			case BooleanLiteral:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(151);
				literal();
				}
				break;
			case Identifier:
				{
				_localctx = new VariableOrFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(Identifier);
				setState(153);
				argsListOrNothing();
				}
				break;
			case MINUS:
			case NOT:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				((UnaryOperationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
					((UnaryOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				expression(12);
				}
				break;
			case LPAR:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				parExpression();
				}
				break;
			case READ_INT_KEYWORD:
				{
				_localctx = new ReadIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(READ_INT_KEYWORD);
				setState(158);
				match(LPAR);
				setState(159);
				match(RPAR);
				}
				break;
			case READ_DOUBLE_KEYWORD:
				{
				_localctx = new ReadDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(READ_DOUBLE_KEYWORD);
				setState(161);
				match(LPAR);
				setState(162);
				match(RPAR);
				}
				break;
			case READ_LINE_KEYWORD:
				{
				_localctx = new ReadLineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(READ_LINE_KEYWORD);
				setState(164);
				match(LPAR);
				setState(165);
				match(RPAR);
				}
				break;
			case TO_STRING_KEYWORD:
				{
				_localctx = new ToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(TO_STRING_KEYWORD);
				setState(167);
				parExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(171);
						((BinaryOperationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1275068416L) != 0)) ) {
							((BinaryOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						((BinaryOperationContext)_localctx).right = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(174);
						((BinaryOperationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						((BinaryOperationContext)_localctx).right = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(177);
						((BinaryOperationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
							((BinaryOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						((BinaryOperationContext)_localctx).right = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(180);
						((BinaryOperationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NOTEQ) ) {
							((BinaryOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						((BinaryOperationContext)_localctx).right = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(183);
						((BinaryOperationContext)_localctx).op = match(AND);
						setState(184);
						((BinaryOperationContext)_localctx).right = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(186);
						((BinaryOperationContext)_localctx).op = match(OR);
						setState(187);
						((BinaryOperationContext)_localctx).right = expression(7);
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsListOrNothingContext extends ParserRuleContext {
		public CallArgsListContext callArgsList() {
			return getRuleContext(CallArgsListContext.class,0);
		}
		public ArgsListOrNothingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsListOrNothing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterArgsListOrNothing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitArgsListOrNothing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitArgsListOrNothing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsListOrNothingContext argsListOrNothing() throws RecognitionException {
		ArgsListOrNothingContext _localctx = new ArgsListOrNothingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argsListOrNothing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(193);
				callArgsList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(MinicParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MinicParser.RPAR, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(LPAR);
			setState(197);
			expression(0);
			setState(198);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleTypeContext extends TypeContext {
		public TerminalNode DOUBLE_TYPE() { return getToken(MinicParser.DOUBLE_TYPE, 0); }
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends TypeContext {
		public TerminalNode BOOL_TYPE() { return getToken(MinicParser.BOOL_TYPE, 0); }
		public BooleanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT_TYPE() { return getToken(MinicParser.INT_TYPE, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTypeContext extends TypeContext {
		public TerminalNode STRING_TYPE() { return getToken(MinicParser.STRING_TYPE, 0); }
		public StringTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(INT_TYPE);
				}
				break;
			case DOUBLE_TYPE:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(DOUBLE_TYPE);
				}
				break;
			case BOOL_TYPE:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(BOOL_TYPE);
				}
				break;
			case STRING_TYPE:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(STRING_TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends LiteralContext {
		public TerminalNode BooleanLiteral() { return getToken(MinicParser.BooleanLiteral, 0); }
		public BooleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(MinicParser.StringLiteral, 0); }
		public StringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends LiteralContext {
		public TerminalNode FloatingPointLiteral() { return getToken(MinicParser.FloatingPointLiteral, 0); }
		public FloatContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends LiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(MinicParser.IntegerLiteral, 0); }
		public IntContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinicListener ) ((MinicListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinicVisitor ) return ((MinicVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(FloatingPointLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(BooleanLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001:\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001P\b\u0001"+
		"\u0001\u0001\u0003\u0001S\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002Y\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005e\b\u0005\n\u0005\f\u0005h\t\u0005\u0003\u0005"+
		"j\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007r\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t{\b\t\n\t\f\t~\t\t\u0003\t\u0080\b\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u0087\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f\u0090\b\f\n\f\f"+
		"\f\u0093\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a9\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00bd\b\r\n\r\f\r\u00c0"+
		"\t\r\u0001\u000e\u0003\u000e\u00c3\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00cd\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00d3\b\u0011\u0001\u0011\u0000\u0001\u001a\u0012\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"\u0000\u0005\u0002\u0000\u001d\u001d&&\u0002\u0000\u001a\u001b\u001e\u001e"+
		"\u0001\u0000\u001c\u001d\u0001\u0000\u001f\"\u0001\u0000$%\u00eb\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004X\u0001"+
		"\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000\u0000\b^\u0001\u0000\u0000"+
		"\u0000\n`\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000eq\u0001"+
		"\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000"+
		"\u0000\u0014\u0086\u0001\u0000\u0000\u0000\u0016\u008a\u0001\u0000\u0000"+
		"\u0000\u0018\u008d\u0001\u0000\u0000\u0000\u001a\u00a8\u0001\u0000\u0000"+
		"\u0000\u001c\u00c2\u0001\u0000\u0000\u0000\u001e\u00c4\u0001\u0000\u0000"+
		"\u0000 \u00cc\u0001\u0000\u0000\u0000\"\u00d2\u0001\u0000\u0000\u0000"+
		"$&\u0003\u0002\u0001\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0000\u0000\u0001+\u0001"+
		"\u0001\u0000\u0000\u0000,S\u0003\u0018\f\u0000-S\u0005\u0005\u0000\u0000"+
		"./\u0005.\u0000\u0000/S\u0003\u0004\u0002\u000001\u0003 \u0010\u00001"+
		"2\u0005.\u0000\u000023\u0003\u000e\u0007\u00003S\u0001\u0000\u0000\u0000"+
		"45\u0005\t\u0000\u000056\u0003\u001e\u000f\u000069\u0003\u0002\u0001\u0000"+
		"78\u0005\n\u0000\u00008:\u0003\u0002\u0001\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:S\u0001\u0000\u0000\u0000;<\u0005\u000b\u0000"+
		"\u0000<=\u0003\u001e\u000f\u0000=>\u0003\u0002\u0001\u0000>S\u0001\u0000"+
		"\u0000\u0000?@\u0005\f\u0000\u0000@S\u0005\u0005\u0000\u0000AB\u0005\u000f"+
		"\u0000\u0000BC\u0005)\u0000\u0000CD\u0005*\u0000\u0000DS\u0005\u0005\u0000"+
		"\u0000EF\u0005\u0014\u0000\u0000FG\u0003\u001e\u000f\u0000GH\u0005\u0005"+
		"\u0000\u0000HS\u0001\u0000\u0000\u0000IJ\u0005\u0015\u0000\u0000JK\u0003"+
		"\u001e\u000f\u0000KL\u0005\u0005\u0000\u0000LS\u0001\u0000\u0000\u0000"+
		"MO\u0005\u000e\u0000\u0000NP\u0003\u001a\r\u0000ON\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0005\u0005\u0000"+
		"\u0000R,\u0001\u0000\u0000\u0000R-\u0001\u0000\u0000\u0000R.\u0001\u0000"+
		"\u0000\u0000R0\u0001\u0000\u0000\u0000R4\u0001\u0000\u0000\u0000R;\u0001"+
		"\u0000\u0000\u0000R?\u0001\u0000\u0000\u0000RA\u0001\u0000\u0000\u0000"+
		"RE\u0001\u0000\u0000\u0000RI\u0001\u0000\u0000\u0000RM\u0001\u0000\u0000"+
		"\u0000S\u0003\u0001\u0000\u0000\u0000TY\u0003\u0006\u0003\u0000UV\u0003"+
		"\n\u0005\u0000VW\u0005\u0005\u0000\u0000WY\u0001\u0000\u0000\u0000XT\u0001"+
		"\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000Y\u0005\u0001\u0000\u0000"+
		"\u0000Z[\u0003\b\u0004\u0000[\\\u0003\u001a\r\u0000\\]\u0005\u0005\u0000"+
		"\u0000]\u0007\u0001\u0000\u0000\u0000^_\u0005#\u0000\u0000_\t\u0001\u0000"+
		"\u0000\u0000`i\u0005)\u0000\u0000af\u0003\u001a\r\u0000bc\u0005-\u0000"+
		"\u0000ce\u0003\u001a\r\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gj\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ia\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005*\u0000\u0000l\u000b"+
		"\u0001\u0000\u0000\u0000mn\u0005.\u0000\u0000n\r\u0001\u0000\u0000\u0000"+
		"or\u0003\u0014\n\u0000pr\u0003\u0010\b\u0000qo\u0001\u0000\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000r\u000f\u0001\u0000\u0000\u0000st\u0003\u0012"+
		"\t\u0000tu\u0003\u0018\f\u0000u\u0011\u0001\u0000\u0000\u0000v\u007f\u0005"+
		")\u0000\u0000w|\u0003\u0016\u000b\u0000xy\u0005-\u0000\u0000y{\u0003\u0016"+
		"\u000b\u0000zx\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007fw\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005*\u0000\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0003\b\u0004\u0000\u0084\u0085\u0003\u001a\r\u0000\u0085\u0087\u0001"+
		"\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"\u0005\u0000\u0000\u0089\u0015\u0001\u0000\u0000\u0000\u008a\u008b\u0003"+
		" \u0010\u0000\u008b\u008c\u0005.\u0000\u0000\u008c\u0017\u0001\u0000\u0000"+
		"\u0000\u008d\u0091\u0005+\u0000\u0000\u008e\u0090\u0003\u0002\u0001\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005,\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0006\r\uffff\uffff\u0000\u0097\u00a9\u0003\"\u0011\u0000\u0098"+
		"\u0099\u0005.\u0000\u0000\u0099\u00a9\u0003\u001c\u000e\u0000\u009a\u009b"+
		"\u0007\u0000\u0000\u0000\u009b\u00a9\u0003\u001a\r\f\u009c\u00a9\u0003"+
		"\u001e\u000f\u0000\u009d\u009e\u0005\u0010\u0000\u0000\u009e\u009f\u0005"+
		")\u0000\u0000\u009f\u00a9\u0005*\u0000\u0000\u00a0\u00a1\u0005\u0011\u0000"+
		"\u0000\u00a1\u00a2\u0005)\u0000\u0000\u00a2\u00a9\u0005*\u0000\u0000\u00a3"+
		"\u00a4\u0005\u0012\u0000\u0000\u00a4\u00a5\u0005)\u0000\u0000\u00a5\u00a9"+
		"\u0005*\u0000\u0000\u00a6\u00a7\u0005\u0013\u0000\u0000\u00a7\u00a9\u0003"+
		"\u001e\u000f\u0000\u00a8\u0096\u0001\u0000\u0000\u0000\u00a8\u0098\u0001"+
		"\u0000\u0000\u0000\u00a8\u009a\u0001\u0000\u0000\u0000\u00a8\u009c\u0001"+
		"\u0000\u0000\u0000\u00a8\u009d\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00be\u0001\u0000\u0000\u0000\u00aa\u00ab\n\u000b"+
		"\u0000\u0000\u00ab\u00ac\u0007\u0001\u0000\u0000\u00ac\u00bd\u0003\u001a"+
		"\r\f\u00ad\u00ae\n\n\u0000\u0000\u00ae\u00af\u0007\u0002\u0000\u0000\u00af"+
		"\u00bd\u0003\u001a\r\u000b\u00b0\u00b1\n\t\u0000\u0000\u00b1\u00b2\u0007"+
		"\u0003\u0000\u0000\u00b2\u00bd\u0003\u001a\r\n\u00b3\u00b4\n\b\u0000\u0000"+
		"\u00b4\u00b5\u0007\u0004\u0000\u0000\u00b5\u00bd\u0003\u001a\r\t\u00b6"+
		"\u00b7\n\u0007\u0000\u0000\u00b7\u00b8\u0005\'\u0000\u0000\u00b8\u00bd"+
		"\u0003\u001a\r\b\u00b9\u00ba\n\u0006\u0000\u0000\u00ba\u00bb\u0005(\u0000"+
		"\u0000\u00bb\u00bd\u0003\u001a\r\u0007\u00bc\u00aa\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ad\u0001\u0000\u0000\u0000\u00bc\u00b0\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b3\u0001\u0000\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u001b\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0003\n\u0005\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u001d\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005)\u0000\u0000\u00c5\u00c6\u0003\u001a\r\u0000\u00c6\u00c7"+
		"\u0005*\u0000\u0000\u00c7\u001f\u0001\u0000\u0000\u0000\u00c8\u00cd\u0005"+
		"\u0016\u0000\u0000\u00c9\u00cd\u0005\u0017\u0000\u0000\u00ca\u00cd\u0005"+
		"\u0019\u0000\u0000\u00cb\u00cd\u0005\u0018\u0000\u0000\u00cc\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd!\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d3\u0005\u0001\u0000\u0000\u00cf\u00d3\u0005\u0002"+
		"\u0000\u0000\u00d0\u00d3\u0005\u0003\u0000\u0000\u00d1\u00d3\u0005\u0004"+
		"\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3#\u0001\u0000\u0000\u0000\u0012\'9ORXfiq|\u007f\u0086"+
		"\u0091\u00a8\u00bc\u00be\u00c2\u00cc\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}