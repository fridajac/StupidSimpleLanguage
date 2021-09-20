// Generated from /Users/fridajacobsson/Documents/Systemutvecklare/Systemprogramvara/StupidSimpleLanguage/src/grammar/StupidSimple.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StupidSimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INTEGER=15, ID=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "INTEGER", "ID", "WS"
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


	public StupidSimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StupidSimple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\6\20\u008b\n\20\r\20\16\20\u008c\3\21\3\21\6"+
		"\21\u0091\n\21\r\21\16\21\u0092\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\6\3"+
		"\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0097\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2"+
		"\2\2\5\'\3\2\2\2\7\60\3\2\2\2\t\67\3\2\2\2\13<\3\2\2\2\rA\3\2\2\2\17C"+
		"\3\2\2\2\21E\3\2\2\2\23L\3\2\2\2\25R\3\2\2\2\27`\3\2\2\2\31m\3\2\2\2\33"+
		"t\3\2\2\2\35\177\3\2\2\2\37\u008a\3\2\2\2!\u008e\3\2\2\2#\u0094\3\2\2"+
		"\2%&\7=\2\2&\4\3\2\2\2\'(\7v\2\2()\7j\2\2)*\7k\2\2*+\7u\2\2+,\7\"\2\2"+
		",-\7k\2\2-.\7u\2\2./\7\"\2\2/\6\3\2\2\2\60\61\7r\2\2\61\62\7t\2\2\62\63"+
		"\7k\2\2\63\64\7p\2\2\64\65\7v\2\2\65\66\7\"\2\2\66\b\3\2\2\2\678\7j\2"+
		"\289\7c\2\29:\7u\2\2:;\7\"\2\2;\n\3\2\2\2<=\7r\2\2=>\7n\2\2>?\7w\2\2?"+
		"@\7u\2\2@\f\3\2\2\2AB\7*\2\2B\16\3\2\2\2CD\7+\2\2D\20\3\2\2\2EF\7e\2\2"+
		"FG\7w\2\2GH\7t\2\2HI\7n\2\2IJ\7{\2\2JK\7d\2\2K\22\3\2\2\2LM\7o\2\2MN\7"+
		"k\2\2NO\7p\2\2OP\7w\2\2PQ\7u\2\2Q\24\3\2\2\2RS\7k\2\2ST\7p\2\2TU\7e\2"+
		"\2UV\7t\2\2VW\7g\2\2WX\7c\2\2XY\7u\2\2YZ\7g\2\2Z[\7\"\2\2[\\\7y\2\2\\"+
		"]\7k\2\2]^\7v\2\2^_\7j\2\2_\26\3\2\2\2`a\7k\2\2ab\7u\2\2bc\7\"\2\2cd\7"+
		"n\2\2de\7g\2\2ef\7u\2\2fg\7u\2\2gh\7\"\2\2hi\7v\2\2ij\7j\2\2jk\7c\2\2"+
		"kl\7p\2\2l\30\3\2\2\2mn\7g\2\2no\7s\2\2op\7w\2\2pq\7c\2\2qr\7n\2\2rs\7"+
		"u\2\2s\32\3\2\2\2tu\7n\2\2uv\7q\2\2vw\7q\2\2wx\7r\2\2xy\7\"\2\2yz\7y\2"+
		"\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~\7g\2\2~\34\3\2\2\2\177\u0080\7g\2\2\u0080"+
		"\u0081\7p\2\2\u0081\u0082\7f\2\2\u0082\u0083\7\"\2\2\u0083\u0084\7y\2"+
		"\2\u0084\u0085\7j\2\2\u0085\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7g\2\2\u0088\36\3\2\2\2\u0089\u008b\t\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d \3\2\2\2"+
		"\u008e\u0090\t\3\2\2\u008f\u0091\t\4\2\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\"\3\2\2\2\u0094"+
		"\u0095\t\5\2\2\u0095$\3\2\2\2\5\2\u008c\u0092\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}