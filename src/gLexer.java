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
		ARTH=10, CNDL=11, INT=12, FLOAT=13, STRING=14, COMMENT=15, VARIABLE=16, 
		TABS=17, COLON=18, EOL=19, WS=20, ASSIGNMENT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ARTH", "CNDL", "INT", "FLOAT", "STRING", "COMMENT", "VARIABLE", "TABS", 
			"COLON", "EOL", "WS", "ASSIGNMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print('", "')'", "'while'", "'for'", "' in range('", "','", "'='", 
			"'break'", "'('", null, null, null, null, null, null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ARTH", "CNDL", 
			"INT", "FLOAT", "STRING", "COMMENT", "VARIABLE", "TABS", "COLON", "EOL", 
			"WS", "ASSIGNMENT"
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


	    private final java.util.Queue<Token> pendingTokens = new java.util.LinkedList<>();
	    private Token prev = null;
	    private int cur_tabs = 0;
	    @Override
	    public Token nextToken() {
	        if(!pendingTokens.isEmpty()) {
	            prev = pendingTokens.poll();
	            return prev;
	        }

	        Token token = super.nextToken();
	        pendingTokens.add(token);

	        if(token.getType() != gParser.EOL || prev == null) {
	            prev = token;
	            return pendingTokens.poll();
	        }

	        if(prev.getType() == COLON) {
	            cur_tabs++;
	            pendingTokens.add(new CommonToken(gParser.INDENT));
	        }

	        String expected_tabs = "";
	        for(int i=0; i<cur_tabs; i++)
	            expected_tabs += "    ";

	        Token next = super.nextToken();

	        if(next.getType() != TABS) {
	            for(int i=0; i<cur_tabs; i++) {
	                pendingTokens.add(new CommonToken(gParser.DEDENT));
	            }
	            cur_tabs = 0;
	            pendingTokens.add(next);
	            return pendingTokens.poll();
	        }
	        if(next.getText().length() != expected_tabs.length()) {
	            int loop = (expected_tabs.length() - next.getText().length()) / 4;
	            for(int i=0; i<loop; i++) {
	                cur_tabs--;
	                pendingTokens.add(new CommonToken(gParser.DEDENT));
	            }
	        }

	        return pendingTokens.poll();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fd\n\f\3\r\5"+
		"\rg\n\r\3\r\6\rj\n\r\r\r\16\rk\3\16\5\16o\n\16\3\16\7\16r\n\16\f\16\16"+
		"\16u\13\16\3\16\5\16x\n\16\3\16\6\16{\n\16\r\16\16\16|\3\17\3\17\3\17"+
		"\3\17\7\17\u0083\n\17\f\17\16\17\u0086\13\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u008d\n\17\f\17\16\17\u0090\13\17\3\17\5\17\u0093\n\17\3\20\3\20"+
		"\7\20\u0097\n\20\f\20\16\20\u009a\13\20\3\21\3\21\7\21\u009e\n\21\f\21"+
		"\16\21\u00a1\13\21\3\22\3\22\3\22\3\22\6\22\u00a7\n\22\r\22\16\22\u00a8"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00b1\n\24\3\25\6\25\u00b4\n\25\r"+
		"\25\16\25\u00b5\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00c6\n\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3"+
		"\2\13\7\2\'\',-//\61\61``\3\2\62;\3\2\60\60\5\2\f\f\17\17$$\5\2\f\f\17"+
		"\17))\4\2\f\f\17\17\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2\u00e1\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\64\3\2\2\2\7"+
		"\66\3\2\2\2\t<\3\2\2\2\13@\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2"+
		"\23U\3\2\2\2\25W\3\2\2\2\27c\3\2\2\2\31f\3\2\2\2\33n\3\2\2\2\35\u0092"+
		"\3\2\2\2\37\u0094\3\2\2\2!\u009b\3\2\2\2#\u00a6\3\2\2\2%\u00aa\3\2\2\2"+
		"\'\u00b0\3\2\2\2)\u00b3\3\2\2\2+\u00c5\3\2\2\2-.\7r\2\2./\7t\2\2/\60\7"+
		"k\2\2\60\61\7p\2\2\61\62\7v\2\2\62\63\7*\2\2\63\4\3\2\2\2\64\65\7+\2\2"+
		"\65\6\3\2\2\2\66\67\7y\2\2\678\7j\2\289\7k\2\29:\7n\2\2:;\7g\2\2;\b\3"+
		"\2\2\2<=\7h\2\2=>\7q\2\2>?\7t\2\2?\n\3\2\2\2@A\7\"\2\2AB\7k\2\2BC\7p\2"+
		"\2CD\7\"\2\2DE\7t\2\2EF\7c\2\2FG\7p\2\2GH\7i\2\2HI\7g\2\2IJ\7*\2\2J\f"+
		"\3\2\2\2KL\7.\2\2L\16\3\2\2\2MN\7?\2\2N\20\3\2\2\2OP\7d\2\2PQ\7t\2\2Q"+
		"R\7g\2\2RS\7c\2\2ST\7m\2\2T\22\3\2\2\2UV\7*\2\2V\24\3\2\2\2WX\t\2\2\2"+
		"X\26\3\2\2\2YZ\7?\2\2Zd\7?\2\2[\\\7#\2\2\\d\7?\2\2]d\7>\2\2^_\7>\2\2_"+
		"d\7?\2\2`d\7@\2\2ab\7@\2\2bd\7?\2\2cY\3\2\2\2c[\3\2\2\2c]\3\2\2\2c^\3"+
		"\2\2\2c`\3\2\2\2ca\3\2\2\2d\30\3\2\2\2eg\7/\2\2fe\3\2\2\2fg\3\2\2\2gi"+
		"\3\2\2\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\32\3\2\2\2"+
		"mo\7/\2\2nm\3\2\2\2no\3\2\2\2ow\3\2\2\2pr\t\3\2\2qp\3\2\2\2ru\3\2\2\2"+
		"sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vx\t\4\2\2ws\3\2\2\2wx\3\2\2\2"+
		"xz\3\2\2\2y{\t\3\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\34\3\2\2"+
		"\2~\u0084\7$\2\2\177\u0083\n\5\2\2\u0080\u0081\7$\2\2\u0081\u0083\7$\2"+
		"\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0093\7$\2\2\u0088\u008e\7)\2\2\u0089\u008d\n\6\2\2\u008a\u008b\7$\2"+
		"\2\u008b\u008d\7$\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0093\7)\2\2\u0092~\3\2\2\2\u0092\u0088\3\2\2\2\u0093"+
		"\36\3\2\2\2\u0094\u0098\7%\2\2\u0095\u0097\n\7\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099 \3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009b\u009f\t\b\2\2\u009c\u009e\t\t\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4"+
		"\7\"\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a7\7\"\2\2\u00a6\u00a2\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9$\3\2\2\2"+
		"\u00aa\u00ab\7<\2\2\u00ab&\3\2\2\2\u00ac\u00b1\7\f\2\2\u00ad\u00ae\7\17"+
		"\2\2\u00ae\u00b1\7\f\2\2\u00af\u00b1\7\17\2\2\u00b0\u00ac\3\2\2\2\u00b0"+
		"\u00ad\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1(\3\2\2\2\u00b2\u00b4\t\n\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\25\2\2\u00b8*\3\2\2\2\u00b9"+
		"\u00ba\7-\2\2\u00ba\u00c6\7?\2\2\u00bb\u00bc\7/\2\2\u00bc\u00c6\7?\2\2"+
		"\u00bd\u00be\7,\2\2\u00be\u00c6\7?\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c6"+
		"\7?\2\2\u00c1\u00c2\7`\2\2\u00c2\u00c6\7?\2\2\u00c3\u00c4\7\'\2\2\u00c4"+
		"\u00c6\7?\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00bd\3\2"+
		"\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		",\3\2\2\2\25\2cfknsw|\u0082\u0084\u008c\u008e\u0092\u0098\u009f\u00a8"+
		"\u00b0\u00b5\u00c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}