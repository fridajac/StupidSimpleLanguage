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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, ID=8, WS=9, OPEN_PAREN=10, 
		CLOSE_PAREN=11, SUB=12, LE=13, EQUAL=14, SEMICOLON=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT", "ID", "WS", "OPEN_PAREN", 
			"CLOSE_PAREN", "SUB", "LE", "EQUAL", "SEMICOLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'this is'", "'has'", "'print'", "'plus'", "'loop while '", "'end while'", 
			null, null, null, "'('", "')'", "'minus'", "'is less than'", "'equals'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INT", "ID", "WS", "OPEN_PAREN", 
			"CLOSE_PAREN", "SUB", "LE", "EQUAL", "SEMICOLON"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\6\bP\n\b\r\b\16\bQ\3\t\6\tU\n\t\r\t\16\tV\3"+
		"\n\6\nZ\n\n\r\n\16\n[\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\3\5\2\13"+
		"\f\17\17\"\"\2\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\3!\3\2\2\2\5)\3\2\2\2\7-\3\2\2\2\t\63\3\2\2\2\138\3\2\2\2\rD\3\2\2"+
		"\2\17O\3\2\2\2\21T\3\2\2\2\23Y\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31c\3\2"+
		"\2\2\33i\3\2\2\2\35v\3\2\2\2\37}\3\2\2\2!\"\7v\2\2\"#\7j\2\2#$\7k\2\2"+
		"$%\7u\2\2%&\7\"\2\2&\'\7k\2\2\'(\7u\2\2(\4\3\2\2\2)*\7j\2\2*+\7c\2\2+"+
		",\7u\2\2,\6\3\2\2\2-.\7r\2\2./\7t\2\2/\60\7k\2\2\60\61\7p\2\2\61\62\7"+
		"v\2\2\62\b\3\2\2\2\63\64\7r\2\2\64\65\7n\2\2\65\66\7w\2\2\66\67\7u\2\2"+
		"\67\n\3\2\2\289\7n\2\29:\7q\2\2:;\7q\2\2;<\7r\2\2<=\7\"\2\2=>\7y\2\2>"+
		"?\7j\2\2?@\7k\2\2@A\7n\2\2AB\7g\2\2BC\7\"\2\2C\f\3\2\2\2DE\7g\2\2EF\7"+
		"p\2\2FG\7f\2\2GH\7\"\2\2HI\7y\2\2IJ\7j\2\2JK\7k\2\2KL\7n\2\2LM\7g\2\2"+
		"M\16\3\2\2\2NP\4\62;\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\20\3\2"+
		"\2\2SU\4c|\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\22\3\2\2\2XZ\t\2"+
		"\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\n\2\2^\24"+
		"\3\2\2\2_`\7*\2\2`\26\3\2\2\2ab\7+\2\2b\30\3\2\2\2cd\7o\2\2de\7k\2\2e"+
		"f\7p\2\2fg\7w\2\2gh\7u\2\2h\32\3\2\2\2ij\7k\2\2jk\7u\2\2kl\7\"\2\2lm\7"+
		"n\2\2mn\7g\2\2no\7u\2\2op\7u\2\2pq\7\"\2\2qr\7v\2\2rs\7j\2\2st\7c\2\2"+
		"tu\7p\2\2u\34\3\2\2\2vw\7g\2\2wx\7s\2\2xy\7w\2\2yz\7c\2\2z{\7n\2\2{|\7"+
		"u\2\2|\36\3\2\2\2}~\7=\2\2~ \3\2\2\2\6\2QV[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}