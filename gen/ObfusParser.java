// Generated from /home/erfan/Source/ObfusC/src/Obfus.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ObfusParser extends Parser {
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
		RPAR=41, LBRACE=42, RBRACE=43, COMMA=44, Identifier=45;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declarationOrFun = 2, RULE_decOrFun = 3, 
		RULE_function = 4, RULE_declaration = 5, RULE_arg = 6, RULE_block = 7, 
		RULE_expression = 8, RULE_parExpression = 9, RULE_assignment = 10, RULE_assignmentOp = 11, 
		RULE_type = 12, RULE_literal = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declarationOrFun", "decOrFun", "function", "declaration", 
			"arg", "block", "expression", "parExpression", "assignment", "assignmentOp", 
			"type", "literal"
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
			"')'", "'{'", "'}'", "','"
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
			"LBRACE", "RBRACE", "COMMA", "Identifier"
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
	public String getGrammarFileName() { return "Obfus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObfusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ObfusParser.EOF, 0); }
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
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 39582451653152L) != 0)) {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
		public TerminalNode WHILE_KEYWORD() { return getToken(ObfusParser.WHILE_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(ObfusParser.SEMI, 0); }
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT_KEYWORD() { return getToken(ObfusParser.PRINT_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObfusParser.SEMI, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitPrintStatement(this);
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
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExitStatementContext extends StatementContext {
		public TerminalNode EXIT_KEYWORD() { return getToken(ObfusParser.EXIT_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(ObfusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ObfusParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(ObfusParser.SEMI, 0); }
		public ExitStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterExitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitExitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitExitStatement(this);
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
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationOrFunctionContext extends StatementContext {
		public DeclarationOrFunContext declarationOrFun() {
			return getRuleContext(DeclarationOrFunContext.class,0);
		}
		public DeclarationOrFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterDeclarationOrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitDeclarationOrFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitDeclarationOrFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode BREAK_KEYWORD() { return getToken(ObfusParser.BREAK_KEYWORD, 0); }
		public TerminalNode SEMI() { return getToken(ObfusParser.SEMI, 0); }
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public StatementContext ifBody;
		public StatementContext elseBody;
		public TerminalNode IF_KEYWORD() { return getToken(ObfusParser.IF_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE_KEYWORD() { return getToken(ObfusParser.ELSE_KEYWORD, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintlnStatementContext extends StatementContext {
		public TerminalNode PRINTLN_KEYWORD() { return getToken(ObfusParser.PRINTLN_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObfusParser.SEMI, 0); }
		public PrintlnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterPrintlnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitPrintlnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitPrintlnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				block();
				}
				break;
			case SEMI:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(SEMI);
				}
				break;
			case Identifier:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				assignment();
				}
				break;
			case INT_TYPE:
			case DOUBLE_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
				_localctx = new DeclarationOrFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				declarationOrFun();
				}
				break;
			case IF_KEYWORD:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(IF_KEYWORD);
				setState(41);
				parExpression();
				setState(42);
				((IfStatementContext)_localctx).ifBody = statement();
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(43);
					match(ELSE_KEYWORD);
					setState(44);
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
				setState(47);
				match(WHILE_KEYWORD);
				setState(48);
				parExpression();
				setState(49);
				statement();
				}
				break;
			case BREAK_KEYWORD:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				match(BREAK_KEYWORD);
				setState(52);
				match(SEMI);
				}
				break;
			case EXIT_KEYWORD:
				_localctx = new ExitStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				match(EXIT_KEYWORD);
				setState(54);
				match(LPAR);
				setState(55);
				match(RPAR);
				setState(56);
				match(SEMI);
				}
				break;
			case PRINT_KEYWORD:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				match(PRINT_KEYWORD);
				setState(58);
				parExpression();
				setState(59);
				match(SEMI);
				}
				break;
			case PRINTLN_KEYWORD:
				_localctx = new PrintlnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(61);
				match(PRINTLN_KEYWORD);
				setState(62);
				parExpression();
				setState(63);
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
	public static class DeclarationOrFunContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ObfusParser.Identifier, 0); }
		public DecOrFunContext decOrFun() {
			return getRuleContext(DecOrFunContext.class,0);
		}
		public DeclarationOrFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationOrFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterDeclarationOrFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitDeclarationOrFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitDeclarationOrFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationOrFunContext declarationOrFun() throws RecognitionException {
		DeclarationOrFunContext _localctx = new DeclarationOrFunContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationOrFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			type();
			setState(68);
			match(Identifier);
			setState(69);
			decOrFun();
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
	public static class DecOrFunContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DecOrFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decOrFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterDecOrFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitDecOrFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitDecOrFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecOrFunContext decOrFun() throws RecognitionException {
		DecOrFunContext _localctx = new DecOrFunContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decOrFun);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				function();
				}
				break;
			case SEMI:
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				declaration();
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ObfusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ObfusParser.RPAR, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObfusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObfusParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LPAR);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) {
				{
				setState(76);
				arg();
				}
			}

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				arg();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ObfusParser.SEMI, 0); }
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
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(88);
				assignmentOp();
				setState(89);
				expression(0);
				}
			}

			setState(93);
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
	public static class ArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ObfusParser.Identifier, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			type();
			setState(96);
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
		public TerminalNode LBRACE() { return getToken(ObfusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObfusParser.RBRACE, 0); }
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
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LBRACE);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 39582451653152L) != 0)) {
				{
				{
				setState(99);
				statement();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitParenthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadDoubleContext extends ExpressionContext {
		public TerminalNode READ_DOUBLE_KEYWORD() { return getToken(ObfusParser.READ_DOUBLE_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(ObfusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ObfusParser.RPAR, 0); }
		public ReadDoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterReadDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitReadDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitReadDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableReferenceContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(ObfusParser.Identifier, 0); }
		public VariableReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToStringContext extends ExpressionContext {
		public TerminalNode TO_STRING_KEYWORD() { return getToken(ObfusParser.TO_STRING_KEYWORD, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ToStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterToString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitToString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitToString(this);
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
		public TerminalNode MUL() { return getToken(ObfusParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ObfusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ObfusParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(ObfusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ObfusParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(ObfusParser.LT, 0); }
		public TerminalNode GT() { return getToken(ObfusParser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(ObfusParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(ObfusParser.GTEQ, 0); }
		public TerminalNode EQ() { return getToken(ObfusParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(ObfusParser.NOTEQ, 0); }
		public TerminalNode AND() { return getToken(ObfusParser.AND, 0); }
		public TerminalNode OR() { return getToken(ObfusParser.OR, 0); }
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitBinaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitBinaryOperation(this);
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
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperationContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ObfusParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(ObfusParser.MINUS, 0); }
		public UnaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadIntContext extends ExpressionContext {
		public TerminalNode READ_INT_KEYWORD() { return getToken(ObfusParser.READ_INT_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(ObfusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ObfusParser.RPAR, 0); }
		public ReadIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterReadInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitReadInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitReadInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadLineContext extends ExpressionContext {
		public TerminalNode READ_LINE_KEYWORD() { return getToken(ObfusParser.READ_LINE_KEYWORD, 0); }
		public TerminalNode LPAR() { return getToken(ObfusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ObfusParser.RPAR, 0); }
		public ReadLineContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterReadLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitReadLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitReadLine(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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

				setState(108);
				literal();
				}
				break;
			case Identifier:
				{
				_localctx = new VariableReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(Identifier);
				}
				break;
			case MINUS:
			case NOT:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
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
				setState(111);
				expression(12);
				}
				break;
			case LPAR:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				parExpression();
				}
				break;
			case READ_INT_KEYWORD:
				{
				_localctx = new ReadIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(READ_INT_KEYWORD);
				setState(114);
				match(LPAR);
				setState(115);
				match(RPAR);
				}
				break;
			case READ_DOUBLE_KEYWORD:
				{
				_localctx = new ReadDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(READ_DOUBLE_KEYWORD);
				setState(117);
				match(LPAR);
				setState(118);
				match(RPAR);
				}
				break;
			case READ_LINE_KEYWORD:
				{
				_localctx = new ReadLineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(READ_LINE_KEYWORD);
				setState(120);
				match(LPAR);
				setState(121);
				match(RPAR);
				}
				break;
			case TO_STRING_KEYWORD:
				{
				_localctx = new ToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(TO_STRING_KEYWORD);
				setState(123);
				parExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(127);
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
						setState(128);
						((BinaryOperationContext)_localctx).right = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(130);
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
						setState(131);
						((BinaryOperationContext)_localctx).right = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(133);
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
						setState(134);
						((BinaryOperationContext)_localctx).right = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(136);
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
						setState(137);
						((BinaryOperationContext)_localctx).right = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(139);
						((BinaryOperationContext)_localctx).op = match(AND);
						setState(140);
						((BinaryOperationContext)_localctx).right = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(142);
						((BinaryOperationContext)_localctx).op = match(OR);
						setState(143);
						((BinaryOperationContext)_localctx).right = expression(7);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode LPAR() { return getToken(ObfusParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ObfusParser.RPAR, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LPAR);
			setState(150);
			expression(0);
			setState(151);
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
		public TerminalNode Identifier() { return getToken(ObfusParser.Identifier, 0); }
		public AssignmentOpContext assignmentOp() {
			return getRuleContext(AssignmentOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObfusParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(Identifier);
			setState(154);
			assignmentOp();
			setState(155);
			expression(0);
			setState(156);
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
		public TerminalNode ASSIGN() { return getToken(ObfusParser.ASSIGN, 0); }
		public AssignmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterAssignmentOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitAssignmentOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitAssignmentOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOpContext assignmentOp() throws RecognitionException {
		AssignmentOpContext _localctx = new AssignmentOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignmentOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		public TerminalNode DOUBLE_TYPE() { return getToken(ObfusParser.DOUBLE_TYPE, 0); }
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends TypeContext {
		public TerminalNode BOOL_TYPE() { return getToken(ObfusParser.BOOL_TYPE, 0); }
		public BooleanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT_TYPE() { return getToken(ObfusParser.INT_TYPE, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTypeContext extends TypeContext {
		public TerminalNode STRING_TYPE() { return getToken(ObfusParser.STRING_TYPE, 0); }
		public StringTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(INT_TYPE);
				}
				break;
			case DOUBLE_TYPE:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(DOUBLE_TYPE);
				}
				break;
			case BOOL_TYPE:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(BOOL_TYPE);
				}
				break;
			case STRING_TYPE:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
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
		public TerminalNode BooleanLiteral() { return getToken(ObfusParser.BooleanLiteral, 0); }
		public BooleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(ObfusParser.StringLiteral, 0); }
		public StringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends LiteralContext {
		public TerminalNode FloatingPointLiteral() { return getToken(ObfusParser.FloatingPointLiteral, 0); }
		public FloatContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends LiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(ObfusParser.IntegerLiteral, 0); }
		public IntContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfusListener ) ((ObfusListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObfusVisitor ) return ((ObfusVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(FloatingPointLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
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
		case 8:
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
		"\u0004\u0001-\u00ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003J\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004R\b\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007e\b\u0007\n\u0007\f\u0007h\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b}\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0091\b\b\n\b\f\b\u0094\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a5\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00ab\b\r\u0001\r\u0000\u0001\u0010\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0005\u0002\u0000\u001c\u001c%%\u0002\u0000\u0019\u001a\u001d\u001d\u0001"+
		"\u0000\u001b\u001c\u0001\u0000\u001e!\u0001\u0000#$\u00c1\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004C\u0001\u0000"+
		"\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000\u0000"+
		"\n[\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000eb\u0001\u0000"+
		"\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012\u0095\u0001\u0000\u0000"+
		"\u0000\u0014\u0099\u0001\u0000\u0000\u0000\u0016\u009e\u0001\u0000\u0000"+
		"\u0000\u0018\u00a4\u0001\u0000\u0000\u0000\u001a\u00aa\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u0000\u0000\u0001#\u0001\u0001\u0000\u0000"+
		"\u0000$B\u0003\u000e\u0007\u0000%B\u0005\u0005\u0000\u0000&B\u0003\u0014"+
		"\n\u0000\'B\u0003\u0004\u0002\u0000()\u0005\t\u0000\u0000)*\u0003\u0012"+
		"\t\u0000*-\u0003\u0002\u0001\u0000+,\u0005\n\u0000\u0000,.\u0003\u0002"+
		"\u0001\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.B\u0001"+
		"\u0000\u0000\u0000/0\u0005\u000b\u0000\u000001\u0003\u0012\t\u000012\u0003"+
		"\u0002\u0001\u00002B\u0001\u0000\u0000\u000034\u0005\f\u0000\u00004B\u0005"+
		"\u0005\u0000\u000056\u0005\u000e\u0000\u000067\u0005(\u0000\u000078\u0005"+
		")\u0000\u00008B\u0005\u0005\u0000\u00009:\u0005\u0013\u0000\u0000:;\u0003"+
		"\u0012\t\u0000;<\u0005\u0005\u0000\u0000<B\u0001\u0000\u0000\u0000=>\u0005"+
		"\u0014\u0000\u0000>?\u0003\u0012\t\u0000?@\u0005\u0005\u0000\u0000@B\u0001"+
		"\u0000\u0000\u0000A$\u0001\u0000\u0000\u0000A%\u0001\u0000\u0000\u0000"+
		"A&\u0001\u0000\u0000\u0000A\'\u0001\u0000\u0000\u0000A(\u0001\u0000\u0000"+
		"\u0000A/\u0001\u0000\u0000\u0000A3\u0001\u0000\u0000\u0000A5\u0001\u0000"+
		"\u0000\u0000A9\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000B\u0003"+
		"\u0001\u0000\u0000\u0000CD\u0003\u0018\f\u0000DE\u0005-\u0000\u0000EF"+
		"\u0003\u0006\u0003\u0000F\u0005\u0001\u0000\u0000\u0000GJ\u0003\b\u0004"+
		"\u0000HJ\u0003\n\u0005\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000J\u0007\u0001\u0000\u0000\u0000KM\u0005(\u0000\u0000LN\u0003\f\u0006"+
		"\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NS\u0001\u0000"+
		"\u0000\u0000OP\u0005,\u0000\u0000PR\u0003\f\u0006\u0000QO\u0001\u0000"+
		"\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VW\u0005)\u0000\u0000W\t\u0001\u0000\u0000\u0000XY\u0003\u0016\u000b\u0000"+
		"YZ\u0003\u0010\b\u0000Z\\\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u0005"+
		"\u0000\u0000^\u000b\u0001\u0000\u0000\u0000_`\u0003\u0018\f\u0000`a\u0005"+
		"-\u0000\u0000a\r\u0001\u0000\u0000\u0000bf\u0005*\u0000\u0000ce\u0003"+
		"\u0002\u0001\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000ij\u0005+\u0000\u0000j\u000f\u0001\u0000"+
		"\u0000\u0000kl\u0006\b\uffff\uffff\u0000l}\u0003\u001a\r\u0000m}\u0005"+
		"-\u0000\u0000no\u0007\u0000\u0000\u0000o}\u0003\u0010\b\fp}\u0003\u0012"+
		"\t\u0000qr\u0005\u000f\u0000\u0000rs\u0005(\u0000\u0000s}\u0005)\u0000"+
		"\u0000tu\u0005\u0010\u0000\u0000uv\u0005(\u0000\u0000v}\u0005)\u0000\u0000"+
		"wx\u0005\u0011\u0000\u0000xy\u0005(\u0000\u0000y}\u0005)\u0000\u0000z"+
		"{\u0005\u0012\u0000\u0000{}\u0003\u0012\t\u0000|k\u0001\u0000\u0000\u0000"+
		"|m\u0001\u0000\u0000\u0000|n\u0001\u0000\u0000\u0000|p\u0001\u0000\u0000"+
		"\u0000|q\u0001\u0000\u0000\u0000|t\u0001\u0000\u0000\u0000|w\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}\u0092\u0001\u0000\u0000\u0000"+
		"~\u007f\n\u000b\u0000\u0000\u007f\u0080\u0007\u0001\u0000\u0000\u0080"+
		"\u0091\u0003\u0010\b\f\u0081\u0082\n\n\u0000\u0000\u0082\u0083\u0007\u0002"+
		"\u0000\u0000\u0083\u0091\u0003\u0010\b\u000b\u0084\u0085\n\t\u0000\u0000"+
		"\u0085\u0086\u0007\u0003\u0000\u0000\u0086\u0091\u0003\u0010\b\n\u0087"+
		"\u0088\n\b\u0000\u0000\u0088\u0089\u0007\u0004\u0000\u0000\u0089\u0091"+
		"\u0003\u0010\b\t\u008a\u008b\n\u0007\u0000\u0000\u008b\u008c\u0005&\u0000"+
		"\u0000\u008c\u0091\u0003\u0010\b\b\u008d\u008e\n\u0006\u0000\u0000\u008e"+
		"\u008f\u0005\'\u0000\u0000\u008f\u0091\u0003\u0010\b\u0007\u0090~\u0001"+
		"\u0000\u0000\u0000\u0090\u0081\u0001\u0000\u0000\u0000\u0090\u0084\u0001"+
		"\u0000\u0000\u0000\u0090\u0087\u0001\u0000\u0000\u0000\u0090\u008a\u0001"+
		"\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0011\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005(\u0000\u0000\u0096\u0097\u0003\u0010"+
		"\b\u0000\u0097\u0098\u0005)\u0000\u0000\u0098\u0013\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005-\u0000\u0000\u009a\u009b\u0003\u0016\u000b\u0000"+
		"\u009b\u009c\u0003\u0010\b\u0000\u009c\u009d\u0005\u0005\u0000\u0000\u009d"+
		"\u0015\u0001\u0000\u0000\u0000\u009e\u009f\u0005\"\u0000\u0000\u009f\u0017"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a5\u0005\u0015\u0000\u0000\u00a1\u00a5"+
		"\u0005\u0016\u0000\u0000\u00a2\u00a5\u0005\u0018\u0000\u0000\u00a3\u00a5"+
		"\u0005\u0017\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00ab"+
		"\u0005\u0001\u0000\u0000\u00a7\u00ab\u0005\u0002\u0000\u0000\u00a8\u00ab"+
		"\u0005\u0003\u0000\u0000\u00a9\u00ab\u0005\u0004\u0000\u0000\u00aa\u00a6"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u001b"+
		"\u0001\u0000\u0000\u0000\r\u001f-AIMS[f|\u0090\u0092\u00a4\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}