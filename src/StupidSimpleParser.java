// Generated from /Users/fridajacobsson/Documents/Systemutvecklare/Systemprogramvara/StupidSimpleLanguage/src/grammar/StupidSimple.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StupidSimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INTEGER=15, ID=16, WS=17;
	public static final int
		RULE_file = 0, RULE_code = 1, RULE_statement = 2, RULE_declare = 3, RULE_print = 4, 
		RULE_assign = 5, RULE_expression = 6, RULE_addExpression = 7, RULE_unaryExpression = 8, 
		RULE_open_paren = 9, RULE_close_paren = 10, RULE_rcurl = 11, RULE_add = 12, 
		RULE_sub = 13, RULE_add_assignment = 14, RULE_le = 15, RULE_equal = 16, 
		RULE_loop = 17, RULE_startloop = 18, RULE_loopbody = 19, RULE_endloop = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "code", "statement", "declare", "print", "assign", "expression", 
			"addExpression", "unaryExpression", "open_paren", "close_paren", "rcurl", 
			"add", "sub", "add_assignment", "le", "equal", "loop", "startloop", "loopbody", 
			"endloop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'this is '", "'print '", "'has '", "'plus'", "'('", "')'", 
			"'curlyb'", "'minus'", "'increase with'", "'is less than'", "'equals'", 
			"'loop while'", "'end while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INTEGER", "ID", "WS"
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
	public String getGrammarFileName() { return "StupidSimple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StupidSimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			code();
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

	public static class CodeContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			statement();
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				match(T__0);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class StatementContext extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				declare();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				print();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				assign();
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

	public static class DeclareContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StupidSimpleParser.ID, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__1);
			setState(56);
			match(ID);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__2);
			setState(59);
			expression();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StupidSimpleParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
			setState(62);
			match(T__3);
			setState(63);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				addExpression();
				}
				break;
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

	public static class AddExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_addExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			unaryExpression();
			setState(70);
			match(T__4);
			setState(71);
			unaryExpression();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(StupidSimpleParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(StupidSimpleParser.ID, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Open_parenContext extends ParserRuleContext {
		public Open_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterOpen_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitOpen_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitOpen_paren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_parenContext open_paren() throws RecognitionException {
		Open_parenContext _localctx = new Open_parenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_open_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__5);
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

	public static class Close_parenContext extends ParserRuleContext {
		public Close_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterClose_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitClose_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitClose_paren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_parenContext close_paren() throws RecognitionException {
		Close_parenContext _localctx = new Close_parenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_close_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__6);
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

	public static class RcurlContext extends ParserRuleContext {
		public RcurlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rcurl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterRcurl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitRcurl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitRcurl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RcurlContext rcurl() throws RecognitionException {
		RcurlContext _localctx = new RcurlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rcurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__7);
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__4);
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

	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__8);
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

	public static class Add_assignmentContext extends ParserRuleContext {
		public Add_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterAdd_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitAdd_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitAdd_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_assignmentContext add_assignment() throws RecognitionException {
		Add_assignmentContext _localctx = new Add_assignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_add_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__9);
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

	public static class LeContext extends ParserRuleContext {
		public LeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_le; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitLe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeContext le() throws RecognitionException {
		LeContext _localctx = new LeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__10);
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

	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__11);
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

	public static class LoopContext extends ParserRuleContext {
		public StartloopContext startloop() {
			return getRuleContext(StartloopContext.class,0);
		}
		public LoopbodyContext loopbody() {
			return getRuleContext(LoopbodyContext.class,0);
		}
		public EndloopContext endloop() {
			return getRuleContext(EndloopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			startloop();
			setState(92);
			loopbody();
			setState(93);
			endloop();
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

	public static class StartloopContext extends ParserRuleContext {
		public StartloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterStartloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitStartloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitStartloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartloopContext startloop() throws RecognitionException {
		StartloopContext _localctx = new StartloopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_startloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__12);
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

	public static class LoopbodyContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public LoopbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterLoopbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitLoopbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitLoopbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopbodyContext loopbody() throws RecognitionException {
		LoopbodyContext _localctx = new LoopbodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loopbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			code();
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

	public static class EndloopContext extends ParserRuleContext {
		public EndloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).enterEndloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StupidSimpleListener ) ((StupidSimpleListener)listener).exitEndloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidSimpleVisitor ) return ((StupidSimpleVisitor<? extends T>)visitor).visitEndloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndloopContext endloop() throws RecognitionException {
		EndloopContext _localctx = new EndloopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_endloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__13);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\6\3\61\n\3\r\3\16"+
		"\3\62\3\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\5\bF\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\3\3\2\21\22\2V\2,\3\2\2\2\4.\3\2\2\2\6\67\3\2\2\2\b9\3\2"+
		"\2\2\n<\3\2\2\2\f?\3\2\2\2\16E\3\2\2\2\20G\3\2\2\2\22K\3\2\2\2\24M\3\2"+
		"\2\2\26O\3\2\2\2\30Q\3\2\2\2\32S\3\2\2\2\34U\3\2\2\2\36W\3\2\2\2 Y\3\2"+
		"\2\2\"[\3\2\2\2$]\3\2\2\2&a\3\2\2\2(c\3\2\2\2*e\3\2\2\2,-\5\4\3\2-\3\3"+
		"\2\2\2.\60\5\6\4\2/\61\7\3\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2"+
		"\62\63\3\2\2\2\63\5\3\2\2\2\648\5\b\5\2\658\5\n\6\2\668\5\f\7\2\67\64"+
		"\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29:\7\4\2\2:;\7\22\2\2;"+
		"\t\3\2\2\2<=\7\5\2\2=>\5\16\b\2>\13\3\2\2\2?@\7\22\2\2@A\7\6\2\2AB\5\16"+
		"\b\2B\r\3\2\2\2CF\5\22\n\2DF\5\20\t\2EC\3\2\2\2ED\3\2\2\2F\17\3\2\2\2"+
		"GH\5\22\n\2HI\7\7\2\2IJ\5\22\n\2J\21\3\2\2\2KL\t\2\2\2L\23\3\2\2\2MN\7"+
		"\b\2\2N\25\3\2\2\2OP\7\t\2\2P\27\3\2\2\2QR\7\n\2\2R\31\3\2\2\2ST\7\7\2"+
		"\2T\33\3\2\2\2UV\7\13\2\2V\35\3\2\2\2WX\7\f\2\2X\37\3\2\2\2YZ\7\r\2\2"+
		"Z!\3\2\2\2[\\\7\16\2\2\\#\3\2\2\2]^\5&\24\2^_\5(\25\2_`\5*\26\2`%\3\2"+
		"\2\2ab\7\17\2\2b\'\3\2\2\2cd\5\4\3\2d)\3\2\2\2ef\7\20\2\2f+\3\2\2\2\5"+
		"\62\67E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}