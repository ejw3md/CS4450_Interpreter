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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ARTH=15, CNDL=16, INT=17, 
		FLOAT=18, STRING=19, COMMENT=20, VARIABLE=21, TABS=22, COLON=23, EOL=24, 
		WS=25, ASSIGNMENT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "ARTH", "CNDL", "INT", "FLOAT", 
			"STRING", "COMMENT", "VARIABLE", "TABS", "COLON", "EOL", "WS", "ASSIGNMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print('", "')'", "'while'", "'for'", "' in range('", "','", "'if '", 
			"'else:'", "'='", "'break'", "'('", "'and'", "'str('", "'int('", null, 
			null, null, null, null, null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ARTH", "CNDL", "INT", "FLOAT", "STRING", "COMMENT", 
			"VARIABLE", "TABS", "COLON", "EOL", "WS", "ASSIGNMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00e9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0086\n\21\3\22\5\22\u0089\n\22\3\22\6\22\u008c"+
		"\n\22\r\22\16\22\u008d\3\23\5\23\u0091\n\23\3\23\7\23\u0094\n\23\f\23"+
		"\16\23\u0097\13\23\3\23\5\23\u009a\n\23\3\23\6\23\u009d\n\23\r\23\16\23"+
		"\u009e\3\24\3\24\3\24\3\24\7\24\u00a5\n\24\f\24\16\24\u00a8\13\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u00af\n\24\f\24\16\24\u00b2\13\24\3\24\5\24"+
		"\u00b5\n\24\3\25\3\25\7\25\u00b9\n\25\f\25\16\25\u00bc\13\25\3\26\3\26"+
		"\7\26\u00c0\n\26\f\26\16\26\u00c3\13\26\3\27\3\27\3\27\3\27\6\27\u00c9"+
		"\n\27\r\27\16\27\u00ca\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00d3\n\31\3"+
		"\32\6\32\u00d6\n\32\r\32\16\32\u00d7\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00e8\n\33\2\2\34\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\13\7\2\'\',-//\61\61`"+
		"`\3\2\62;\3\2\60\60\5\2\f\f\17\17$$\5\2\f\f\17\17))\4\2\f\f\17\17\5\2"+
		"C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u0103\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\3\67\3\2\2\2\5>\3\2\2\2\7@\3\2\2\2\tF\3\2\2\2\13J\3\2"+
		"\2\2\rU\3\2\2\2\17W\3\2\2\2\21[\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27i\3"+
		"\2\2\2\31k\3\2\2\2\33o\3\2\2\2\35t\3\2\2\2\37y\3\2\2\2!\u0085\3\2\2\2"+
		"#\u0088\3\2\2\2%\u0090\3\2\2\2\'\u00b4\3\2\2\2)\u00b6\3\2\2\2+\u00bd\3"+
		"\2\2\2-\u00c8\3\2\2\2/\u00cc\3\2\2\2\61\u00d2\3\2\2\2\63\u00d5\3\2\2\2"+
		"\65\u00e7\3\2\2\2\678\7r\2\289\7t\2\29:\7k\2\2:;\7p\2\2;<\7v\2\2<=\7*"+
		"\2\2=\4\3\2\2\2>?\7+\2\2?\6\3\2\2\2@A\7y\2\2AB\7j\2\2BC\7k\2\2CD\7n\2"+
		"\2DE\7g\2\2E\b\3\2\2\2FG\7h\2\2GH\7q\2\2HI\7t\2\2I\n\3\2\2\2JK\7\"\2\2"+
		"KL\7k\2\2LM\7p\2\2MN\7\"\2\2NO\7t\2\2OP\7c\2\2PQ\7p\2\2QR\7i\2\2RS\7g"+
		"\2\2ST\7*\2\2T\f\3\2\2\2UV\7.\2\2V\16\3\2\2\2WX\7k\2\2XY\7h\2\2YZ\7\""+
		"\2\2Z\20\3\2\2\2[\\\7g\2\2\\]\7n\2\2]^\7u\2\2^_\7g\2\2_`\7<\2\2`\22\3"+
		"\2\2\2ab\7?\2\2b\24\3\2\2\2cd\7d\2\2de\7t\2\2ef\7g\2\2fg\7c\2\2gh\7m\2"+
		"\2h\26\3\2\2\2ij\7*\2\2j\30\3\2\2\2kl\7c\2\2lm\7p\2\2mn\7f\2\2n\32\3\2"+
		"\2\2op\7u\2\2pq\7v\2\2qr\7t\2\2rs\7*\2\2s\34\3\2\2\2tu\7k\2\2uv\7p\2\2"+
		"vw\7v\2\2wx\7*\2\2x\36\3\2\2\2yz\t\2\2\2z \3\2\2\2{|\7?\2\2|\u0086\7?"+
		"\2\2}~\7#\2\2~\u0086\7?\2\2\177\u0086\7>\2\2\u0080\u0081\7>\2\2\u0081"+
		"\u0086\7?\2\2\u0082\u0086\7@\2\2\u0083\u0084\7@\2\2\u0084\u0086\7?\2\2"+
		"\u0085{\3\2\2\2\u0085}\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0086\"\3\2\2\2\u0087\u0089\7/\2\2"+
		"\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u008c"+
		"\t\3\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e$\3\2\2\2\u008f\u0091\7/\2\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0099\3\2\2\2\u0092\u0094\t\3\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\t\4\2\2\u0099\u0095\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u009d\t\3\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f&\3\2\2\2\u00a0\u00a6\7$\2\2\u00a1\u00a5\n\5\2\2\u00a2\u00a3"+
		"\7$\2\2\u00a3\u00a5\7$\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00b5\7$\2\2\u00aa\u00b0\7)\2\2\u00ab\u00af"+
		"\n\6\2\2\u00ac\u00ad\7$\2\2\u00ad\u00af\7$\2\2\u00ae\u00ab\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\7)\2\2\u00b4"+
		"\u00a0\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b5(\3\2\2\2\u00b6\u00ba\7%\2\2\u00b7"+
		"\u00b9\n\7\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb*\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c1"+
		"\t\b\2\2\u00be\u00c0\t\t\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2,\3\2\2\2\u00c3\u00c1\3\2\2\2"+
		"\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7\7\"\2\2\u00c7\u00c9"+
		"\7\"\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7<\2\2\u00cd\60\3\2\2\2\u00ce"+
		"\u00d3\7\f\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d3\7\f\2\2\u00d1\u00d3\7"+
		"\17\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\62\3\2\2\2\u00d4\u00d6\t\n\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2"+
		"\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\b\32\2\2\u00da\64\3\2\2\2\u00db\u00dc\7-\2\2\u00dc\u00e8\7?\2\2\u00dd"+
		"\u00de\7/\2\2\u00de\u00e8\7?\2\2\u00df\u00e0\7,\2\2\u00e0\u00e8\7?\2\2"+
		"\u00e1\u00e2\7\61\2\2\u00e2\u00e8\7?\2\2\u00e3\u00e4\7`\2\2\u00e4\u00e8"+
		"\7?\2\2\u00e5\u00e6\7\'\2\2\u00e6\u00e8\7?\2\2\u00e7\u00db\3\2\2\2\u00e7"+
		"\u00dd\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e3\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\66\3\2\2\2\25\2\u0085\u0088\u008d\u0090"+
		"\u0095\u0099\u009e\u00a4\u00a6\u00ae\u00b0\u00b4\u00ba\u00c1\u00ca\u00d2"+
		"\u00d7\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}