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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT=9, 
		FLOAT=10, STRING=11, COMMENT=12, VARIABLE=13, WS=14, EOL=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "INT", 
			"FLOAT", "STRING", "COMMENT", "VARIABLE", "WS", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'print('", "')'", "'('", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6"+
		"\n8\n\n\r\n\16\n9\3\13\7\13=\n\13\f\13\16\13@\13\13\3\13\5\13C\n\13\3"+
		"\13\6\13F\n\13\r\13\16\13G\3\f\3\f\3\f\3\f\7\fN\n\f\f\f\16\fQ\13\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\fX\n\f\f\f\16\f[\13\f\3\f\5\f^\n\f\3\r\3\r\7\rb\n\r"+
		"\f\r\16\re\13\r\3\16\3\16\7\16i\n\16\f\16\16\16l\13\16\3\17\6\17o\n\17"+
		"\r\17\16\17p\3\17\3\17\3\20\3\20\3\20\3\20\5\20y\n\20\2\2\21\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2"+
		"\n\3\2\62;\3\2\60\60\5\2\f\f\17\17$$\5\2\f\f\17\17))\4\2\f\f\17\17\4\2"+
		"C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13."+
		"\3\2\2\2\r\60\3\2\2\2\17\62\3\2\2\2\21\64\3\2\2\2\23\67\3\2\2\2\25B\3"+
		"\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33f\3\2\2\2\35n\3\2\2\2\37x\3\2\2\2!\""+
		"\7?\2\2\"\4\3\2\2\2#$\7r\2\2$%\7t\2\2%&\7k\2\2&\'\7p\2\2\'(\7v\2\2()\7"+
		"*\2\2)\6\3\2\2\2*+\7+\2\2+\b\3\2\2\2,-\7*\2\2-\n\3\2\2\2./\7,\2\2/\f\3"+
		"\2\2\2\60\61\7\61\2\2\61\16\3\2\2\2\62\63\7-\2\2\63\20\3\2\2\2\64\65\7"+
		"/\2\2\65\22\3\2\2\2\668\t\2\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:"+
		"\3\2\2\2:\24\3\2\2\2;=\t\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?A\3\2\2\2@>\3\2\2\2AC\t\3\2\2B>\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\t\2\2\2"+
		"ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\26\3\2\2\2IO\7$\2\2JN\n\4\2"+
		"\2KL\7$\2\2LN\7$\2\2MJ\3\2\2\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"PR\3\2\2\2QO\3\2\2\2R^\7$\2\2SY\7)\2\2TX\n\5\2\2UV\7$\2\2VX\7$\2\2WT\3"+
		"\2\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\"+
		"^\7)\2\2]I\3\2\2\2]S\3\2\2\2^\30\3\2\2\2_c\7%\2\2`b\n\6\2\2a`\3\2\2\2"+
		"be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\32\3\2\2\2ec\3\2\2\2fj\t\7\2\2gi\t\b\2"+
		"\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\34\3\2\2\2lj\3\2\2\2mo\t\t"+
		"\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\17\2\2s\36"+
		"\3\2\2\2ty\7\f\2\2uv\7\17\2\2vy\7\f\2\2wy\7\17\2\2xt\3\2\2\2xu\3\2\2\2"+
		"xw\3\2\2\2y \3\2\2\2\20\29>BGMOWY]cjpx\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}