// Generated from /Users/mikeweiss/IdeaProjects/testForAntlrAgain/src/g.g4 by ANTLR 4.9
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
		T__9=10, ARTH=11, CNDL=12, INT=13, FLOAT=14, STRING=15, COMMENT=16, VARIABLE=17, 
		TABS=18, COLON=19, EOL=20, WS=21, ASSIGNMENT=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "ARTH", "CNDL", "INT", "FLOAT", "STRING", "COMMENT", "VARIABLE", 
			"TABS", "COLON", "EOL", "WS", "ASSIGNMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print('", "')'", "'while'", "'for'", "' in range('", "','", "'='", 
			"'break'", "'('", "'and'", null, null, null, null, null, null, null, 
			null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ARTH", 
			"CNDL", "INT", "FLOAT", "STRING", "COMMENT", "VARIABLE", "TABS", "COLON", 
			"EOL", "WS", "ASSIGNMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\rj\n\r\3\16\5\16m\n\16\3\16\6\16p\n\16\r\16\16\16q\3\17"+
		"\5\17u\n\17\3\17\7\17x\n\17\f\17\16\17{\13\17\3\17\5\17~\n\17\3\17\6\17"+
		"\u0081\n\17\r\17\16\17\u0082\3\20\3\20\3\20\3\20\7\20\u0089\n\20\f\20"+
		"\16\20\u008c\13\20\3\20\3\20\3\20\3\20\3\20\7\20\u0093\n\20\f\20\16\20"+
		"\u0096\13\20\3\20\5\20\u0099\n\20\3\21\3\21\7\21\u009d\n\21\f\21\16\21"+
		"\u00a0\13\21\3\22\3\22\7\22\u00a4\n\22\f\22\16\22\u00a7\13\22\3\23\3\23"+
		"\3\23\3\23\6\23\u00ad\n\23\r\23\16\23\u00ae\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\5\25\u00b7\n\25\3\26\6\26\u00ba\n\26\r\26\16\26\u00bb\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00cc"+
		"\n\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\13\7\2\'\',-//\61"+
		"\61``\3\2\62;\3\2\60\60\5\2\f\f\17\17$$\5\2\f\f\17\17))\4\2\f\f\17\17"+
		"\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\66\3\2\2\2\78\3\2\2\2"+
		"\t>\3\2\2\2\13B\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23W\3\2\2\2"+
		"\25Y\3\2\2\2\27]\3\2\2\2\31i\3\2\2\2\33l\3\2\2\2\35t\3\2\2\2\37\u0098"+
		"\3\2\2\2!\u009a\3\2\2\2#\u00a1\3\2\2\2%\u00ac\3\2\2\2\'\u00b0\3\2\2\2"+
		")\u00b6\3\2\2\2+\u00b9\3\2\2\2-\u00cb\3\2\2\2/\60\7r\2\2\60\61\7t\2\2"+
		"\61\62\7k\2\2\62\63\7p\2\2\63\64\7v\2\2\64\65\7*\2\2\65\4\3\2\2\2\66\67"+
		"\7+\2\2\67\6\3\2\2\289\7y\2\29:\7j\2\2:;\7k\2\2;<\7n\2\2<=\7g\2\2=\b\3"+
		"\2\2\2>?\7h\2\2?@\7q\2\2@A\7t\2\2A\n\3\2\2\2BC\7\"\2\2CD\7k\2\2DE\7p\2"+
		"\2EF\7\"\2\2FG\7t\2\2GH\7c\2\2HI\7p\2\2IJ\7i\2\2JK\7g\2\2KL\7*\2\2L\f"+
		"\3\2\2\2MN\7.\2\2N\16\3\2\2\2OP\7?\2\2P\20\3\2\2\2QR\7d\2\2RS\7t\2\2S"+
		"T\7g\2\2TU\7c\2\2UV\7m\2\2V\22\3\2\2\2WX\7*\2\2X\24\3\2\2\2YZ\7c\2\2Z"+
		"[\7p\2\2[\\\7f\2\2\\\26\3\2\2\2]^\t\2\2\2^\30\3\2\2\2_`\7?\2\2`j\7?\2"+
		"\2ab\7#\2\2bj\7?\2\2cj\7>\2\2de\7>\2\2ej\7?\2\2fj\7@\2\2gh\7@\2\2hj\7"+
		"?\2\2i_\3\2\2\2ia\3\2\2\2ic\3\2\2\2id\3\2\2\2if\3\2\2\2ig\3\2\2\2j\32"+
		"\3\2\2\2km\7/\2\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\t\3\2\2on\3\2\2\2pq"+
		"\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\34\3\2\2\2su\7/\2\2ts\3\2\2\2tu\3\2\2\2"+
		"u}\3\2\2\2vx\t\3\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2"+
		"{y\3\2\2\2|~\t\4\2\2}y\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081\t\3"+
		"\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\36\3\2\2\2\u0084\u008a\7$\2\2\u0085\u0089\n\5\2\2\u0086"+
		"\u0087\7$\2\2\u0087\u0089\7$\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2"+
		"\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0099\7$\2\2\u008e\u0094\7)\2\2\u008f"+
		"\u0093\n\6\2\2\u0090\u0091\7$\2\2\u0091\u0093\7$\2\2\u0092\u008f\3\2\2"+
		"\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\7)\2\2\u0098"+
		"\u0084\3\2\2\2\u0098\u008e\3\2\2\2\u0099 \3\2\2\2\u009a\u009e\7%\2\2\u009b"+
		"\u009d\n\7\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a5"+
		"\t\b\2\2\u00a2\u00a4\t\t\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6$\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a8\u00a9\7\"\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ad"+
		"\7\"\2\2\u00ac\u00a8\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af&\3\2\2\2\u00b0\u00b1\7<\2\2\u00b1(\3\2\2\2\u00b2"+
		"\u00b7\7\f\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b7\7\f\2\2\u00b5\u00b7\7"+
		"\17\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"*\3\2\2\2\u00b8\u00ba\t\n\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\b\26\2\2\u00be,\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0\u00cc\7?\2\2\u00c1\u00c2"+
		"\7/\2\2\u00c2\u00cc\7?\2\2\u00c3\u00c4\7,\2\2\u00c4\u00cc\7?\2\2\u00c5"+
		"\u00c6\7\61\2\2\u00c6\u00cc\7?\2\2\u00c7\u00c8\7`\2\2\u00c8\u00cc\7?\2"+
		"\2\u00c9\u00ca\7\'\2\2\u00ca\u00cc\7?\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c1"+
		"\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc.\3\2\2\2\25\2ilqty}\u0082\u0088\u008a\u0092\u0094"+
		"\u0098\u009e\u00a5\u00ae\u00b6\u00bb\u00cb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}