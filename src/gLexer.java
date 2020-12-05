// Generated from C:/Users/ewood/school/PoPL/CS4450_Interpreter\g.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, INT=21, FLOAT=22, STRING=23, COMMENT=24, 
		VARIABLE=25, WS=26, EOL=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "INT", "FLOAT", "STRING", "COMMENT", "VARIABLE", 
			"WS", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'print('", "')'", "'while '", "':'", "'for '", "' in range('", 
			"','", "'\t\t\t'", "'            '", "'\t\t'", "'        '", "'\t'", 
			"'    '", "'break'", "'('", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INT", "FLOAT", 
			"STRING", "COMMENT", "VARIABLE", "WS", "EOL"
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


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\6\26\u0095\n\26\r\26\16\26\u0096\3\27\7\27\u009a\n"+
		"\27\f\27\16\27\u009d\13\27\3\27\5\27\u00a0\n\27\3\27\6\27\u00a3\n\27\r"+
		"\27\16\27\u00a4\3\30\3\30\3\30\3\30\7\30\u00ab\n\30\f\30\16\30\u00ae\13"+
		"\30\3\30\3\30\3\30\3\30\3\30\7\30\u00b5\n\30\f\30\16\30\u00b8\13\30\3"+
		"\30\5\30\u00bb\n\30\3\31\3\31\7\31\u00bf\n\31\f\31\16\31\u00c2\13\31\3"+
		"\32\3\32\7\32\u00c6\n\32\f\32\16\32\u00c9\13\32\3\33\6\33\u00cc\n\33\r"+
		"\33\16\33\u00cd\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u00d6\n\34\2\2\35\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\n\3\2"+
		"\62;\3\2\60\60\5\2\f\f\17\17$$\5\2\f\f\17\17))\4\2\f\f\17\17\4\2C\\c|"+
		"\5\2\62;C\\c|\4\2\13\13\"\"\2\u00e4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7B\3\2\2\2\tD\3\2\2\2\13K\3"+
		"\2\2\2\rM\3\2\2\2\17R\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25c\3\2\2\2\27p"+
		"\3\2\2\2\31s\3\2\2\2\33|\3\2\2\2\35~\3\2\2\2\37\u0083\3\2\2\2!\u0089\3"+
		"\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0091\3\2\2\2+\u0094"+
		"\3\2\2\2-\u009f\3\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2\63\u00c3\3\2\2"+
		"\2\65\u00cb\3\2\2\2\67\u00d5\3\2\2\29:\7?\2\2:\4\3\2\2\2;<\7r\2\2<=\7"+
		"t\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2@A\7*\2\2A\6\3\2\2\2BC\7+\2\2C\b\3\2\2"+
		"\2DE\7y\2\2EF\7j\2\2FG\7k\2\2GH\7n\2\2HI\7g\2\2IJ\7\"\2\2J\n\3\2\2\2K"+
		"L\7<\2\2L\f\3\2\2\2MN\7h\2\2NO\7q\2\2OP\7t\2\2PQ\7\"\2\2Q\16\3\2\2\2R"+
		"S\7\"\2\2ST\7k\2\2TU\7p\2\2UV\7\"\2\2VW\7t\2\2WX\7c\2\2XY\7p\2\2YZ\7i"+
		"\2\2Z[\7g\2\2[\\\7*\2\2\\\20\3\2\2\2]^\7.\2\2^\22\3\2\2\2_`\7\13\2\2`"+
		"a\7\13\2\2ab\7\13\2\2b\24\3\2\2\2cd\7\"\2\2de\7\"\2\2ef\7\"\2\2fg\7\""+
		"\2\2gh\7\"\2\2hi\7\"\2\2ij\7\"\2\2jk\7\"\2\2kl\7\"\2\2lm\7\"\2\2mn\7\""+
		"\2\2no\7\"\2\2o\26\3\2\2\2pq\7\13\2\2qr\7\13\2\2r\30\3\2\2\2st\7\"\2\2"+
		"tu\7\"\2\2uv\7\"\2\2vw\7\"\2\2wx\7\"\2\2xy\7\"\2\2yz\7\"\2\2z{\7\"\2\2"+
		"{\32\3\2\2\2|}\7\13\2\2}\34\3\2\2\2~\177\7\"\2\2\177\u0080\7\"\2\2\u0080"+
		"\u0081\7\"\2\2\u0081\u0082\7\"\2\2\u0082\36\3\2\2\2\u0083\u0084\7d\2\2"+
		"\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7c\2\2\u0087\u0088"+
		"\7m\2\2\u0088 \3\2\2\2\u0089\u008a\7*\2\2\u008a\"\3\2\2\2\u008b\u008c"+
		"\7,\2\2\u008c$\3\2\2\2\u008d\u008e\7\61\2\2\u008e&\3\2\2\2\u008f\u0090"+
		"\7-\2\2\u0090(\3\2\2\2\u0091\u0092\7/\2\2\u0092*\3\2\2\2\u0093\u0095\t"+
		"\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097,\3\2\2\2\u0098\u009a\t\2\2\2\u0099\u0098\3\2\2\2"+
		"\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\t\3\2\2\u009f\u009b\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		".\3\2\2\2\u00a6\u00ac\7$\2\2\u00a7\u00ab\n\4\2\2\u00a8\u00a9\7$\2\2\u00a9"+
		"\u00ab\7$\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00bb\7$\2\2\u00b0\u00b6\7)\2\2\u00b1\u00b5\n\5\2"+
		"\2\u00b2\u00b3\7$\2\2\u00b3\u00b5\7$\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7)\2\2\u00ba\u00a6\3\2"+
		"\2\2\u00ba\u00b0\3\2\2\2\u00bb\60\3\2\2\2\u00bc\u00c0\7%\2\2\u00bd\u00bf"+
		"\n\6\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\62\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c7\t\7\2"+
		"\2\u00c4\u00c6\t\b\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\64\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cc\t\t\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\33\2\2\u00d0"+
		"\66\3\2\2\2\u00d1\u00d6\7\f\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d6\7\f\2"+
		"\2\u00d4\u00d6\7\17\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d68\3\2\2\2\20\2\u0096\u009b\u009f\u00a4\u00aa\u00ac"+
		"\u00b4\u00b6\u00ba\u00c0\u00c7\u00cd\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}