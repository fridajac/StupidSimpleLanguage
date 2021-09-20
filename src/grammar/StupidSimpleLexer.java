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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INTEGER=7, ID=8, WS=9, 
		OPEN_PAREN=10, CLOSE_PAREN=11, ADD=12, SUB=13, ADD_ASSIGNMENT=14, LE=15, 
		EQUAL=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INTEGER", "ID", "WS", 
			"OPEN_PAREN", "CLOSE_PAREN", "ADD", "SUB", "ADD_ASSIGNMENT", "LE", "EQUAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'this is '", "'print'", "'has '", "'loop while'", "'end while'", 
			null, null, null, "'('", "')'", "'plus'", "'minus'", "'increase with'", 
			"'is less than'", "'equals'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INTEGER", "ID", "WS", "OPEN_PAREN", 
			"CLOSE_PAREN", "ADD", "SUB", "ADD_ASSIGNMENT", "LE", "EQUAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\bP\n\b\r\b\16\bQ\3\t\3\t\6\tV\n\t\r\t"+
		"\16\tW\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\6\3\2"+
		"\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u008d\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2"+
		"\2\7.\3\2\2\2\t\64\3\2\2\2\139\3\2\2\2\rD\3\2\2\2\17O\3\2\2\2\21S\3\2"+
		"\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33d\3\2\2\2\35j\3"+
		"\2\2\2\37x\3\2\2\2!\u0085\3\2\2\2#$\7=\2\2$\4\3\2\2\2%&\7v\2\2&\'\7j\2"+
		"\2\'(\7k\2\2()\7u\2\2)*\7\"\2\2*+\7k\2\2+,\7u\2\2,-\7\"\2\2-\6\3\2\2\2"+
		"./\7r\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7v\2\2\63\b\3\2\2"+
		"\2\64\65\7j\2\2\65\66\7c\2\2\66\67\7u\2\2\678\7\"\2\28\n\3\2\2\29:\7n"+
		"\2\2:;\7q\2\2;<\7q\2\2<=\7r\2\2=>\7\"\2\2>?\7y\2\2?@\7j\2\2@A\7k\2\2A"+
		"B\7n\2\2BC\7g\2\2C\f\3\2\2\2DE\7g\2\2EF\7p\2\2FG\7f\2\2GH\7\"\2\2HI\7"+
		"y\2\2IJ\7j\2\2JK\7k\2\2KL\7n\2\2LM\7g\2\2M\16\3\2\2\2NP\t\2\2\2ON\3\2"+
		"\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\20\3\2\2\2SU\t\3\2\2TV\t\4\2\2UT\3"+
		"\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\22\3\2\2\2YZ\t\5\2\2Z\24\3\2\2\2"+
		"[\\\7*\2\2\\\26\3\2\2\2]^\7+\2\2^\30\3\2\2\2_`\7r\2\2`a\7n\2\2ab\7w\2"+
		"\2bc\7u\2\2c\32\3\2\2\2de\7o\2\2ef\7k\2\2fg\7p\2\2gh\7w\2\2hi\7u\2\2i"+
		"\34\3\2\2\2jk\7k\2\2kl\7p\2\2lm\7e\2\2mn\7t\2\2no\7g\2\2op\7c\2\2pq\7"+
		"u\2\2qr\7g\2\2rs\7\"\2\2st\7y\2\2tu\7k\2\2uv\7v\2\2vw\7j\2\2w\36\3\2\2"+
		"\2xy\7k\2\2yz\7u\2\2z{\7\"\2\2{|\7n\2\2|}\7g\2\2}~\7u\2\2~\177\7u\2\2"+
		"\177\u0080\7\"\2\2\u0080\u0081\7v\2\2\u0081\u0082\7j\2\2\u0082\u0083\7"+
		"c\2\2\u0083\u0084\7p\2\2\u0084 \3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7s\2\2\u0087\u0088\7w\2\2\u0088\u0089\7c\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7u\2\2\u008b\"\3\2\2\2\5\2QW\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}