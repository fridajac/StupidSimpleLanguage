// Generated from /Users/fridajacobsson/Documents/Systemutvecklare/Systemprogramvara/StupidSimpleLanguage/src/grammar/StupidSimple.g4 by ANTLR 4.9.1
package grammar;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, ID=9, WS=10, 
		OPEN_PAREN=11, CLOSE_PAREN=12, SUB=13, ADD_ASSIGNMENT=14, LE=15, EQUAL=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "INT", "ID", 
			"WS", "OPEN_PAREN", "CLOSE_PAREN", "SUB", "ADD_ASSIGNMENT", "LE", "EQUAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'this is'", "'has'", "'print'", "'plus'", "'loop while'", 
			"'end while'", null, null, null, "'('", "')'", "'minus'", "'increase with'", 
			"'is less than'", "'equals'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "INT", "ID", "WS", "OPEN_PAREN", 
			"CLOSE_PAREN", "SUB", "ADD_ASSIGNMENT", "LE", "EQUAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\tS\n\t\r\t\16\tT\3\n\6\n"+
		"X\n\n\r\n\16\nY\3\13\6\13]\n\13\r\13\16\13^\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22\3\2\3\5\2\13\f\17\17\"\"\2\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7-\3\2\2\2\t\61"+
		"\3\2\2\2\13\67\3\2\2\2\r<\3\2\2\2\17G\3\2\2\2\21R\3\2\2\2\23W\3\2\2\2"+
		"\25\\\3\2\2\2\27b\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2\35l\3\2\2\2\37z\3\2"+
		"\2\2!\u0087\3\2\2\2#$\7=\2\2$\4\3\2\2\2%&\7v\2\2&\'\7j\2\2\'(\7k\2\2("+
		")\7u\2\2)*\7\"\2\2*+\7k\2\2+,\7u\2\2,\6\3\2\2\2-.\7j\2\2./\7c\2\2/\60"+
		"\7u\2\2\60\b\3\2\2\2\61\62\7r\2\2\62\63\7t\2\2\63\64\7k\2\2\64\65\7p\2"+
		"\2\65\66\7v\2\2\66\n\3\2\2\2\678\7r\2\289\7n\2\29:\7w\2\2:;\7u\2\2;\f"+
		"\3\2\2\2<=\7n\2\2=>\7q\2\2>?\7q\2\2?@\7r\2\2@A\7\"\2\2AB\7y\2\2BC\7j\2"+
		"\2CD\7k\2\2DE\7n\2\2EF\7g\2\2F\16\3\2\2\2GH\7g\2\2HI\7p\2\2IJ\7f\2\2J"+
		"K\7\"\2\2KL\7y\2\2LM\7j\2\2MN\7k\2\2NO\7n\2\2OP\7g\2\2P\20\3\2\2\2QS\4"+
		"\62;\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\22\3\2\2\2VX\4c|\2WV\3"+
		"\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\24\3\2\2\2[]\t\2\2\2\\[\3\2\2\2"+
		"]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\13\2\2a\26\3\2\2\2bc\7*"+
		"\2\2c\30\3\2\2\2de\7+\2\2e\32\3\2\2\2fg\7o\2\2gh\7k\2\2hi\7p\2\2ij\7w"+
		"\2\2jk\7u\2\2k\34\3\2\2\2lm\7k\2\2mn\7p\2\2no\7e\2\2op\7t\2\2pq\7g\2\2"+
		"qr\7c\2\2rs\7u\2\2st\7g\2\2tu\7\"\2\2uv\7y\2\2vw\7k\2\2wx\7v\2\2xy\7j"+
		"\2\2y\36\3\2\2\2z{\7k\2\2{|\7u\2\2|}\7\"\2\2}~\7n\2\2~\177\7g\2\2\177"+
		"\u0080\7u\2\2\u0080\u0081\7u\2\2\u0081\u0082\7\"\2\2\u0082\u0083\7v\2"+
		"\2\u0083\u0084\7j\2\2\u0084\u0085\7c\2\2\u0085\u0086\7p\2\2\u0086 \3\2"+
		"\2\2\u0087\u0088\7g\2\2\u0088\u0089\7s\2\2\u0089\u008a\7w\2\2\u008a\u008b"+
		"\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\"\3\2\2\2\6\2TY^\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}