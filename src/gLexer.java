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
		FLOAT=10, STRING=11, VARIABLE=12, WS=13, EOL=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "INT", 
			"FLOAT", "STRING", "VARIABLE", "WS", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'='", "'print('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "INT", "FLOAT", 
			"STRING", "VARIABLE", "WS", "EOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\6\n\66\n\n"+
		"\r\n\16\n\67\3\13\7\13;\n\13\f\13\16\13>\13\13\3\13\5\13A\n\13\3\13\6"+
		"\13D\n\13\r\13\16\13E\3\f\3\f\3\f\3\f\7\fL\n\f\f\f\16\fO\13\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\fV\n\f\f\f\16\fY\13\f\3\f\5\f\\\n\f\3\r\3\r\7\r`\n\r\f"+
		"\r\16\rc\13\r\3\16\6\16f\n\16\r\16\16\16g\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17p\n\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\3\2\t\3\2\62;\3\2\60\60\5\2\f\f\17\17$$\5\2\f\f\17"+
		"\17))\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2}\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2"+
		"\2\r)\3\2\2\2\17+\3\2\2\2\21-\3\2\2\2\23\65\3\2\2\2\25@\3\2\2\2\27[\3"+
		"\2\2\2\31]\3\2\2\2\33e\3\2\2\2\35o\3\2\2\2\37 \7*\2\2 \4\3\2\2\2!\"\7"+
		"+\2\2\"\6\3\2\2\2#$\7,\2\2$\b\3\2\2\2%&\7\61\2\2&\n\3\2\2\2\'(\7-\2\2"+
		"(\f\3\2\2\2)*\7/\2\2*\16\3\2\2\2+,\7?\2\2,\20\3\2\2\2-.\7r\2\2./\7t\2"+
		"\2/\60\7k\2\2\60\61\7p\2\2\61\62\7v\2\2\62\63\7*\2\2\63\22\3\2\2\2\64"+
		"\66\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\24"+
		"\3\2\2\29;\t\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2>"+
		"<\3\2\2\2?A\t\3\2\2@<\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\t\2\2\2CB\3\2\2\2"+
		"DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\26\3\2\2\2GM\7$\2\2HL\n\4\2\2IJ\7$\2\2"+
		"JL\7$\2\2KH\3\2\2\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2"+
		"OM\3\2\2\2P\\\7$\2\2QW\7)\2\2RV\n\5\2\2ST\7$\2\2TV\7$\2\2UR\3\2\2\2US"+
		"\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z\\\7)\2\2["+
		"G\3\2\2\2[Q\3\2\2\2\\\30\3\2\2\2]a\t\6\2\2^`\t\7\2\2_^\3\2\2\2`c\3\2\2"+
		"\2a_\3\2\2\2ab\3\2\2\2b\32\3\2\2\2ca\3\2\2\2df\t\b\2\2ed\3\2\2\2fg\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\16\2\2j\34\3\2\2\2kp\7\f\2\2lm"+
		"\7\17\2\2mp\7\f\2\2np\7\17\2\2ok\3\2\2\2ol\3\2\2\2on\3\2\2\2p\36\3\2\2"+
		"\2\17\2\67<@EKMUW[ago\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}