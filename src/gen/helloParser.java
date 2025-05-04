// Generated from /home/erfan/Source/ObfusC/src/hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class helloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, FloatingPointLiteral=2, StringLiteral=3, BooleanLiteral=4, 
		SEMI=5, WS=6, BLOCK_COMMENT=7, LINE_COMMENT=8, IF_KEYWORD=9, ELSE_KEYWORD=10, 
		WHILE_KEYWORD=11, BREAK_KEYWORD=12, CONTINUE_KEYWORD=13, EXIT_KEYWORD=14, 
		READ_INT_KEYWORD=15, READ_DOUBLE_KEYWORD=16, READ_LINE_KEYWORD=17, TO_STRING_KEYWORD=18, 
		PRINT_KEYWORD=19, PRINTLN_KEYWORD=20, INT_TYPE=21, DOUBLE_TYPE=22, STRING_TYPE=23, 
		BOOL_TYPE=24, MUL=25, DIV=26, PLUS=27, MINUS=28, MOD=29, LT=30, GT=31, 
		LTEQ=32, GTEQ=33, ASSIGN=34, EQ=35, NOTEQ=36, NOT=37, AND=38, OR=39, LPAR=40, 
		RPAR=41, LBRACE=42, RBRACE=43, Identifier=44;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_expression = 3, 
		RULE_parExpression = 4, RULE_assignment = 5, RULE_declaration = 6, RULE_assignmentOp = 7, 
		RULE_type = 8, RULE_literal = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "expression", "parExpression", "assignment", 
			"declaration", "assignmentOp", "type", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", null, null, null, "'if'", "'else'", 
			"'while'", "'break'", "'continue'", "'exit'", "'readInt'", "'readDouble'", 
			"'readLine'", "'toString'", "'print'", "'println'", "'int'", "'double'", 
			"'string'", "'bool'", "'*'", "'/'", "'+'", "'-'", "'%'", "'<'", "'>'", 
			"'<='", "'>='", "'='", "'=='", "'!='", "'!'", "'&&'", "'||'", "'('", 
			"')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "FloatingPointLiteral", "StringLiteral", "BooleanLiteral", 
			"SEMI", "WS", "BLOCK_COMMENT", "LINE_COMMENT", "IF_KEYWORD", "ELSE_KEYWORD", 
			"WHILE_KEYWORD", "BREAK_KEYWORD", "CONTINUE_KEYWORD", "EXIT_KEYWORD", 
			"READ_INT_KEYWORD", "READ_DOUBLE_KEYWORD", "READ_LINE_KEYWORD", "TO_STRING_KEYWORD", 
			"PRINT_KEYWORD", "PRINTLN_KEYWORD", "INT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", 
			"BOOL_TYPE", "MUL", "DIV", "PLUS", "MINUS", "MOD", "LT", "GT", "LTEQ", 
			"GTEQ", "ASSIGN", "EQ", "NOTEQ", "NOT", "AND", "OR", "LPAR", "RPAR", 
			"LBRACE", "RBRACE", "Identifier"
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
	public String getGrammarFileName() { return "hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public helloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(helloParser.EOF, 0); }
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
			if ( listener instanceof helloListener ) ((helloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21990265608736L) != 0)) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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
		public TerminalNode WHILE_KEYWORD() { return getToken(helloParser.WHILE_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(helloParser.SEMI, 0); }
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT_KEYWORD() { return getToken(helloParser.PRINT_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(helloParser.SEMI, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitPrintStatement(this);
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
			if ( listener instanceof helloListener ) ((helloListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExitStatementContext extends StatementContext {
		public TerminalNode EXIT_KEYWORD() { return getToken(helloParser.EXIT_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(helloParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(helloParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(helloParser.SEMI, 0); }
		public ExitStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterExitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitExitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitExitStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatementContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public VariableDeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode BREAK_KEYWORD() { return getToken(helloParser.BREAK_KEYWORD, 0); }
		public TerminalNode SEMI() { return getToken(helloParser.SEMI, 0); }
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public StatementContext ifBody;
		public StatementContext elseBody;
		public TerminalNode IF_KEYWORD() { return getToken(helloParser.IF_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE_KEYWORD() { return getToken(helloParser.ELSE_KEYWORD, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintlnStatementContext extends StatementContext {
		public TerminalNode PRINTLN_KEYWORD() { return getToken(helloParser.PRINTLN_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(helloParser.SEMI, 0); }
		public PrintlnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterPrintlnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitPrintlnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitPrintlnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				block();
				}
				break;
			case SEMI:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(SEMI);
				}
				break;
			case Identifier:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				assignment();
				}
				break;
			case INT_TYPE:
			case DOUBLE_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
				_localctx = new VariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				declaration();
				}
				break;
			case IF_KEYWORD:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				match(IF_KEYWORD);
				setState(33);
				parExpression();
				setState(34);
				((IfStatementContext)_localctx).ifBody = statement();
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(35);
					match(ELSE_KEYWORD);
					setState(36);
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
				setState(39);
				match(WHILE_KEYWORD);
				setState(40);
				parExpression();
				setState(41);
				statement();
				}
				break;
			case BREAK_KEYWORD:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				match(BREAK_KEYWORD);
				setState(44);
				match(SEMI);
				}
				break;
			case EXIT_KEYWORD:
				_localctx = new ExitStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				match(EXIT_KEYWORD);
				setState(46);
				match(LPAR);
				setState(47);
				match(RPAR);
				setState(48);
				match(SEMI);
				}
				break;
			case PRINT_KEYWORD:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(49);
				match(PRINT_KEYWORD);
				setState(50);
				parExpression();
				setState(51);
				match(SEMI);
				}
				break;
			case PRINTLN_KEYWORD:
				_localctx = new PrintlnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(53);
				match(PRINTLN_KEYWORD);
				setState(54);
				parExpression();
				setState(55);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(helloParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(helloParser.RBRACE, 0); }
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
			if ( listener instanceof helloListener ) ((helloListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LBRACE);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21990265608736L) != 0)) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
			if ( listener instanceof helloListener ) ((helloListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitParenthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadDoubleContext extends ExpressionContext {
		public TerminalNode READ_DOUBLE_KEYWORD() { return getToken(helloParser.READ_DOUBLE_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(helloParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(helloParser.RPAR, 0); }
		public ReadDoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterReadDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitReadDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitReadDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableReferenceContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(helloParser.Identifier, 0); }
		public VariableReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToStringContext extends ExpressionContext {
		public TerminalNode TO_STRING_KEYWORD() { return getToken(helloParser.TO_STRING_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ToStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterToString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitToString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitToString(this);
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
		public TerminalNode MUL() { return getToken(helloParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(helloParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(helloParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(helloParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(helloParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(helloParser.LT, 0); }
		public TerminalNode GT() { return getToken(helloParser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(helloParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(helloParser.GTEQ, 0); }
		public TerminalNode EQ() { return getToken(helloParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(helloParser.NOTEQ, 0); }
		public TerminalNode AND() { return getToken(helloParser.AND, 0); }
		public TerminalNode OR() { return getToken(helloParser.OR, 0); }
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitBinaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitBinaryOperation(this);
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
			if ( listener instanceof helloListener ) ((helloListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperationContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(helloParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(helloParser.MINUS, 0); }
		public UnaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadIntContext extends ExpressionContext {
		public TerminalNode READ_INT_KEYWORD() { return getToken(helloParser.READ_INT_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(helloParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(helloParser.RPAR, 0); }
		public ReadIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterReadInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitReadInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitReadInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadLineContext extends ExpressionContext {
		public TerminalNode READ_LINE_KEYWORD() { return getToken(helloParser.READ_LINE_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(helloParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(helloParser.RPAR, 0); }
		public ReadLineContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterReadLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitReadLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitReadLine(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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

				setState(69);
				literal();
				}
				break;
			case Identifier:
				{
				_localctx = new VariableReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(Identifier);
				}
				break;
			case MINUS:
			case NOT:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
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
				setState(72);
				expression(12);
				}
				break;
			case LPAR:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				parExpression();
				}
				break;
			case READ_INT_KEYWORD:
				{
				_localctx = new ReadIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(READ_INT_KEYWORD);
				setState(75);
				match(LPAR);
				setState(76);
				match(RPAR);
				}
				break;
			case READ_DOUBLE_KEYWORD:
				{
				_localctx = new ReadDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(READ_DOUBLE_KEYWORD);
				setState(78);
				match(LPAR);
				setState(79);
				match(RPAR);
				}
				break;
			case READ_LINE_KEYWORD:
				{
				_localctx = new ReadLineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(READ_LINE_KEYWORD);
				setState(81);
				match(LPAR);
				setState(82);
				match(RPAR);
				}
				break;
			case TO_STRING_KEYWORD:
				{
				_localctx = new ToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(TO_STRING_KEYWORD);
				setState(84);
				parExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(88);
						((BinaryOperationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 637534208L) != 0)) ) {
							((BinaryOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						((BinaryOperationContext)_localctx).right = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(91);
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
						setState(92);
						((BinaryOperationContext)_localctx).right = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(94);
						((BinaryOperationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
							((BinaryOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						((BinaryOperationContext)_localctx).right = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(97);
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
						setState(98);
						((BinaryOperationContext)_localctx).right = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(100);
						((BinaryOperationContext)_localctx).op = match(AND);
						setState(101);
						((BinaryOperationContext)_localctx).right = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(103);
						((BinaryOperationContext)_localctx).op = match(OR);
						setState(104);
						((BinaryOperationContext)_localctx).right = expression(7);
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(helloParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(helloParser.RPAR, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LPAR);
			setState(111);
			expression(0);
			setState(112);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(helloParser.Identifier, 0); }
		public AssignmentOpContext assignmentOp() {
			return getRuleContext(AssignmentOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(helloParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Identifier);
			setState(115);
			assignmentOp();
			setState(116);
			expression(0);
			setState(117);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(helloParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(helloParser.SEMI, 0); }
		public AssignmentOpContext assignmentOp() {
			return getRuleContext(AssignmentOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			type();
			setState(120);
			match(Identifier);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(121);
				assignmentOp();
				setState(122);
				expression(0);
				}
			}

			setState(126);
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
		public TerminalNode ASSIGN() { return getToken(helloParser.ASSIGN, 0); }
		public AssignmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterAssignmentOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitAssignmentOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitAssignmentOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOpContext assignmentOp() throws RecognitionException {
		AssignmentOpContext _localctx = new AssignmentOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		public TerminalNode DOUBLE_TYPE() { return getToken(helloParser.DOUBLE_TYPE, 0); }
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends TypeContext {
		public TerminalNode BOOL_TYPE() { return getToken(helloParser.BOOL_TYPE, 0); }
		public BooleanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT_TYPE() { return getToken(helloParser.INT_TYPE, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTypeContext extends TypeContext {
		public TerminalNode STRING_TYPE() { return getToken(helloParser.STRING_TYPE, 0); }
		public StringTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(INT_TYPE);
				}
				break;
			case DOUBLE_TYPE:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(DOUBLE_TYPE);
				}
				break;
			case BOOL_TYPE:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(BOOL_TYPE);
				}
				break;
			case STRING_TYPE:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
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
		public TerminalNode BooleanLiteral() { return getToken(helloParser.BooleanLiteral, 0); }
		public BooleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(helloParser.StringLiteral, 0); }
		public StringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends LiteralContext {
		public TerminalNode FloatingPointLiteral() { return getToken(helloParser.FloatingPointLiteral, 0); }
		public FloatContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends LiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(helloParser.IntegerLiteral, 0); }
		public IntContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof helloVisitor ) return ((helloVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(FloatingPointLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
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
		case 3:
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
		"\u0004\u0001,\u008f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001:\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0005\u0002>\b\u0002\n\u0002\f\u0002A\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003V\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003j\b\u0003\n\u0003\f\u0003m\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006}\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0087"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008d\b\t\u0001\t\u0000\u0001"+
		"\u0006\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0005\u0002"+
		"\u0000\u001c\u001c%%\u0002\u0000\u0019\u001a\u001d\u001d\u0001\u0000\u001b"+
		"\u001c\u0001\u0000\u001e!\u0001\u0000#$\u00a4\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000"+
		"\u0006U\u0001\u0000\u0000\u0000\bn\u0001\u0000\u0000\u0000\nr\u0001\u0000"+
		"\u0000\u0000\fw\u0001\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000"+
		"\u0000\u0010\u0086\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000"+
		"\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0000\u0000"+
		"\u0001\u001b\u0001\u0001\u0000\u0000\u0000\u001c:\u0003\u0004\u0002\u0000"+
		"\u001d:\u0005\u0005\u0000\u0000\u001e:\u0003\n\u0005\u0000\u001f:\u0003"+
		"\f\u0006\u0000 !\u0005\t\u0000\u0000!\"\u0003\b\u0004\u0000\"%\u0003\u0002"+
		"\u0001\u0000#$\u0005\n\u0000\u0000$&\u0003\u0002\u0001\u0000%#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&:\u0001\u0000\u0000\u0000\'(\u0005"+
		"\u000b\u0000\u0000()\u0003\b\u0004\u0000)*\u0003\u0002\u0001\u0000*:\u0001"+
		"\u0000\u0000\u0000+,\u0005\f\u0000\u0000,:\u0005\u0005\u0000\u0000-.\u0005"+
		"\u000e\u0000\u0000./\u0005(\u0000\u0000/0\u0005)\u0000\u00000:\u0005\u0005"+
		"\u0000\u000012\u0005\u0013\u0000\u000023\u0003\b\u0004\u000034\u0005\u0005"+
		"\u0000\u00004:\u0001\u0000\u0000\u000056\u0005\u0014\u0000\u000067\u0003"+
		"\b\u0004\u000078\u0005\u0005\u0000\u00008:\u0001\u0000\u0000\u00009\u001c"+
		"\u0001\u0000\u0000\u00009\u001d\u0001\u0000\u0000\u00009\u001e\u0001\u0000"+
		"\u0000\u00009\u001f\u0001\u0000\u0000\u00009 \u0001\u0000\u0000\u0000"+
		"9\'\u0001\u0000\u0000\u00009+\u0001\u0000\u0000\u00009-\u0001\u0000\u0000"+
		"\u000091\u0001\u0000\u0000\u000095\u0001\u0000\u0000\u0000:\u0003\u0001"+
		"\u0000\u0000\u0000;?\u0005*\u0000\u0000<>\u0003\u0002\u0001\u0000=<\u0001"+
		"\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000BC\u0005+\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0006\u0003"+
		"\uffff\uffff\u0000EV\u0003\u0012\t\u0000FV\u0005,\u0000\u0000GH\u0007"+
		"\u0000\u0000\u0000HV\u0003\u0006\u0003\fIV\u0003\b\u0004\u0000JK\u0005"+
		"\u000f\u0000\u0000KL\u0005(\u0000\u0000LV\u0005)\u0000\u0000MN\u0005\u0010"+
		"\u0000\u0000NO\u0005(\u0000\u0000OV\u0005)\u0000\u0000PQ\u0005\u0011\u0000"+
		"\u0000QR\u0005(\u0000\u0000RV\u0005)\u0000\u0000ST\u0005\u0012\u0000\u0000"+
		"TV\u0003\b\u0004\u0000UD\u0001\u0000\u0000\u0000UF\u0001\u0000\u0000\u0000"+
		"UG\u0001\u0000\u0000\u0000UI\u0001\u0000\u0000\u0000UJ\u0001\u0000\u0000"+
		"\u0000UM\u0001\u0000\u0000\u0000UP\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000Vk\u0001\u0000\u0000\u0000WX\n\u000b\u0000\u0000XY\u0007\u0001"+
		"\u0000\u0000Yj\u0003\u0006\u0003\fZ[\n\n\u0000\u0000[\\\u0007\u0002\u0000"+
		"\u0000\\j\u0003\u0006\u0003\u000b]^\n\t\u0000\u0000^_\u0007\u0003\u0000"+
		"\u0000_j\u0003\u0006\u0003\n`a\n\b\u0000\u0000ab\u0007\u0004\u0000\u0000"+
		"bj\u0003\u0006\u0003\tcd\n\u0007\u0000\u0000de\u0005&\u0000\u0000ej\u0003"+
		"\u0006\u0003\bfg\n\u0006\u0000\u0000gh\u0005\'\u0000\u0000hj\u0003\u0006"+
		"\u0003\u0007iW\u0001\u0000\u0000\u0000iZ\u0001\u0000\u0000\u0000i]\u0001"+
		"\u0000\u0000\u0000i`\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000\u0000"+
		"if\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000l\u0007\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000no\u0005(\u0000\u0000op\u0003\u0006\u0003\u0000pq\u0005"+
		")\u0000\u0000q\t\u0001\u0000\u0000\u0000rs\u0005,\u0000\u0000st\u0003"+
		"\u000e\u0007\u0000tu\u0003\u0006\u0003\u0000uv\u0005\u0005\u0000\u0000"+
		"v\u000b\u0001\u0000\u0000\u0000wx\u0003\u0010\b\u0000x|\u0005,\u0000\u0000"+
		"yz\u0003\u000e\u0007\u0000z{\u0003\u0006\u0003\u0000{}\u0001\u0000\u0000"+
		"\u0000|y\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u0005\u0000\u0000\u007f\r\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\"\u0000\u0000\u0081\u000f\u0001\u0000\u0000\u0000"+
		"\u0082\u0087\u0005\u0015\u0000\u0000\u0083\u0087\u0005\u0016\u0000\u0000"+
		"\u0084\u0087\u0005\u0018\u0000\u0000\u0085\u0087\u0005\u0017\u0000\u0000"+
		"\u0086\u0082\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0011\u0001\u0000\u0000\u0000\u0088\u008d\u0005\u0001\u0000\u0000"+
		"\u0089\u008d\u0005\u0002\u0000\u0000\u008a\u008d\u0005\u0003\u0000\u0000"+
		"\u008b\u008d\u0005\u0004\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000"+
		"\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0013\u0001\u0000\u0000\u0000"+
		"\n\u0017%9?Uik|\u0086\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}