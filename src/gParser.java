// Generated from C:/Users/ewood/school/PoPL/CS4450_Interpreter\g.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT=9, 
		FLOAT=10, STRING=11, COMMENT=12, VARIABLE=13, WS=14, EOL=15;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "expr"
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

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(gParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(gParser.EOL, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << COMMENT) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(6);
				statement();
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(7);
					match(EOL);
					}
					}
					setState(12);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		public Token var;
		public ExprContext exp;
		public TerminalNode VARIABLE() { return getToken(gParser.VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StatementContext {
		public ExprContext exp;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentExprContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(gParser.COMMENT, 0); }
		public CommentExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCommentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCommentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCommentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends StatementContext {
		public ExprContext exp;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				((AssignmentStatementContext)_localctx).var = match(VARIABLE);
				setState(19);
				match(T__0);
				setState(20);
				((AssignmentStatementContext)_localctx).exp = expr(0);
				}
				break;
			case 2:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				((ExprStatementContext)_localctx).exp = expr(0);
				}
				break;
			case 3:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(T__1);
				setState(23);
				((PrintExprContext)_localctx).exp = expr(0);
				setState(24);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new CommentExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(COMMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomStringExprContext extends ExprContext {
		public Token atom;
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public AtomStringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAtomStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAtomStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAtomStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOpExprContext extends ExprContext {
		public Token op;
		public ExprContext exp;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUnaryOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUnaryOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUnaryOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomFloatExprContext extends ExprContext {
		public Token atom;
		public TerminalNode FLOAT() { return getToken(gParser.FLOAT, 0); }
		public AtomFloatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAtomFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAtomFloatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAtomFloatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParnExprContext extends ExprContext {
		public ExprContext exp;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParnExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterParnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitParnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomIntExprContext extends ExprContext {
		public Token atom;
		public TerminalNode INT() { return getToken(gParser.INT, 0); }
		public AtomIntExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAtomIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAtomIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAtomIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomVarExprContext extends ExprContext {
		public Token var;
		public TerminalNode VARIABLE() { return getToken(gParser.VARIABLE, 0); }
		public AtomVarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAtomVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAtomVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAtomVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new AtomIntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(30);
				((AtomIntExprContext)_localctx).atom = match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new AtomFloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				((AtomFloatExprContext)_localctx).atom = match(FLOAT);
				}
				break;
			case STRING:
				{
				_localctx = new AtomStringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				((AtomStringExprContext)_localctx).atom = match(STRING);
				}
				break;
			case VARIABLE:
				{
				_localctx = new AtomVarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				((AtomVarExprContext)_localctx).var = match(VARIABLE);
				}
				break;
			case T__3:
				{
				_localctx = new ParnExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(T__3);
				setState(35);
				((ParnExprContext)_localctx).exp = expr(0);
				setState(36);
				match(T__2);
				}
				break;
			case T__6:
			case T__7:
				{
				_localctx = new UnaryOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				((UnaryOpExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
					((UnaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(39);
				((UnaryOpExprContext)_localctx).exp = expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(48);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(42);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(43);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(44);
						((OpExprContext)_localctx).right = expr(4);
						}
						break;
					case 2:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(45);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(46);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(47);
						((OpExprContext)_localctx).right = expr(3);
						}
						break;
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\218\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\7\2\20\n\2\f\2\16\2\23"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4+\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4"+
		"\f\4\16\4\66\13\4\3\4\2\3\6\5\2\4\6\2\4\3\2\t\n\3\2\7\b\2@\2\21\3\2\2"+
		"\2\4\35\3\2\2\2\6*\3\2\2\2\b\f\5\4\3\2\t\13\7\21\2\2\n\t\3\2\2\2\13\16"+
		"\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\17\b\3\2\2"+
		"\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\21\3\2\2"+
		"\2\24\25\7\17\2\2\25\26\7\3\2\2\26\36\5\6\4\2\27\36\5\6\4\2\30\31\7\4"+
		"\2\2\31\32\5\6\4\2\32\33\7\5\2\2\33\36\3\2\2\2\34\36\7\16\2\2\35\24\3"+
		"\2\2\2\35\27\3\2\2\2\35\30\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37 \b\4"+
		"\1\2 +\7\13\2\2!+\7\f\2\2\"+\7\r\2\2#+\7\17\2\2$%\7\6\2\2%&\5\6\4\2&\'"+
		"\7\5\2\2\'+\3\2\2\2()\t\2\2\2)+\5\6\4\3*\37\3\2\2\2*!\3\2\2\2*\"\3\2\2"+
		"\2*#\3\2\2\2*$\3\2\2\2*(\3\2\2\2+\64\3\2\2\2,-\f\5\2\2-.\t\3\2\2.\63\5"+
		"\6\4\6/\60\f\4\2\2\60\61\t\2\2\2\61\63\5\6\4\5\62,\3\2\2\2\62/\3\2\2\2"+
		"\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\66\64\3\2\2\2"+
		"\b\f\21\35*\62\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}