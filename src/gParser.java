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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ARTH=15, CNDL=16, INT=17, 
		FLOAT=18, STRING=19, COMMENT=20, VARIABLE=21, TABS=22, COLON=23, EOL=24, 
		WS=25, ASSIGNMENT=26, INDENT=27, DEDENT=28;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_statement_block = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "statement_block", "expr"
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
			"VARIABLE", "TABS", "COLON", "EOL", "WS", "ASSIGNMENT", "INDENT", "DEDENT"
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
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << COMMENT) | (1L << VARIABLE) | (1L << EOL))) != 0)) {
				{
				setState(10);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
				case T__3:
				case T__6:
				case T__9:
				case T__10:
				case T__12:
				case T__13:
				case INT:
				case FLOAT:
				case STRING:
				case COMMENT:
				case VARIABLE:
					{
					setState(8);
					statement();
					}
					break;
				case EOL:
					{
					setState(9);
					match(EOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(14);
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
	public static class WhileStatementContext extends StatementContext {
		public ExprContext exp;
		public Statement_blockContext block;
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public TerminalNode EOL() { return getToken(gParser.EOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentStatementContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(gParser.COMMENT, 0); }
		public CommentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCommentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCommentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCommentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public ExprContext exp;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
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
	public static class ForStatementContext extends StatementContext {
		public Token var;
		public ExprContext begin;
		public ExprContext end;
		public Statement_blockContext block;
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public TerminalNode EOL() { return getToken(gParser.EOL, 0); }
		public TerminalNode VARIABLE() { return getToken(gParser.VARIABLE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public ExprContext exp;
		public Statement_blockContext block;
		public Statement_blockContext block2;
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public List<TerminalNode> EOL() { return getTokens(gParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(gParser.EOL, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentStatementsContext extends StatementContext {
		public Token var;
		public Token asgn;
		public ExprContext exp;
		public TerminalNode VARIABLE() { return getToken(gParser.VARIABLE, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(gParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignmentStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignmentStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignmentStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				((ExprStatementContext)_localctx).exp = expr(0);
				}
				break;
			case 2:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(T__0);
				setState(17);
				((PrintStatementContext)_localctx).exp = expr(0);
				setState(18);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(T__2);
				setState(21);
				((WhileStatementContext)_localctx).exp = expr(0);
				setState(22);
				match(COLON);
				setState(23);
				match(EOL);
				setState(24);
				((WhileStatementContext)_localctx).block = statement_block();
				}
				break;
			case 4:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(T__3);
				setState(27);
				((ForStatementContext)_localctx).var = match(VARIABLE);
				setState(28);
				match(T__4);
				setState(29);
				((ForStatementContext)_localctx).begin = expr(0);
				setState(30);
				match(T__5);
				setState(31);
				((ForStatementContext)_localctx).end = expr(0);
				setState(32);
				match(T__1);
				setState(33);
				match(COLON);
				setState(34);
				match(EOL);
				setState(35);
				((ForStatementContext)_localctx).block = statement_block();
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				match(T__6);
				setState(38);
				((IfStatementContext)_localctx).exp = expr(0);
				setState(39);
				match(COLON);
				setState(40);
				match(EOL);
				setState(41);
				((IfStatementContext)_localctx).block = statement_block();
				setState(42);
				match(T__7);
				setState(43);
				match(EOL);
				setState(44);
				((IfStatementContext)_localctx).block2 = statement_block();
				}
				break;
			case 6:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				match(COMMENT);
				}
				break;
			case 7:
				_localctx = new AssignmentStatementsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				((AssignmentStatementsContext)_localctx).var = match(VARIABLE);
				setState(48);
				((AssignmentStatementsContext)_localctx).asgn = match(ASSIGNMENT);
				setState(49);
				((AssignmentStatementsContext)_localctx).exp = expr(0);
				}
				break;
			case 8:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(50);
				((AssignmentStatementContext)_localctx).var = match(VARIABLE);
				setState(51);
				match(T__8);
				setState(52);
				((AssignmentStatementContext)_localctx).exp = expr(0);
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

	public static class Statement_blockContext extends ParserRuleContext {
		public StatementContext stat;
		public TerminalNode INDENT() { return getToken(gParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(gParser.DEDENT, 0); }
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
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(INDENT);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				((Statement_blockContext)_localctx).stat = statement();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(57);
					match(EOL);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << COMMENT) | (1L << VARIABLE))) != 0) );
			setState(67);
			match(DEDENT);
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
	public static class ToIntContext extends ExprContext {
		public ExprContext exp;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ToIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterToInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitToInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitToInt(this);
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
	public static class ToStringContext extends ExprContext {
		public ExprContext exp;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ToStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterToString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitToString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitToString(this);
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
	public static class ArithmeticExprContext extends ExprContext {
		public ExprContext l;
		public Token arth;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ARTH() { return getToken(gParser.ARTH, 0); }
		public ArithmeticExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArithmeticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArithmeticExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArithmeticExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakExprContext extends ExprContext {
		public BreakExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBreakExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBreakExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBreakExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExprContext extends ExprContext {
		public ExprContext left;
		public Token cndl;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CNDL() { return getToken(gParser.CNDL, 0); }
		public ConditionalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterConditionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitConditionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitConditionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAndExpr(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new AtomIntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70);
				((AtomIntExprContext)_localctx).atom = match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new AtomFloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				((AtomFloatExprContext)_localctx).atom = match(FLOAT);
				}
				break;
			case STRING:
				{
				_localctx = new AtomStringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				((AtomStringExprContext)_localctx).atom = match(STRING);
				}
				break;
			case VARIABLE:
				{
				_localctx = new AtomVarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				((AtomVarExprContext)_localctx).var = match(VARIABLE);
				}
				break;
			case T__9:
				{
				_localctx = new BreakExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new ParnExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(T__10);
				setState(76);
				((ParnExprContext)_localctx).exp = expr(0);
				setState(77);
				match(T__1);
				}
				break;
			case T__12:
				{
				_localctx = new ToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(T__12);
				setState(80);
				((ToStringContext)_localctx).exp = expr(0);
				setState(81);
				match(T__1);
				}
				break;
			case T__13:
				{
				_localctx = new ToIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(T__13);
				setState(84);
				((ToIntContext)_localctx).exp = expr(0);
				setState(85);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalExprContext(new ExprContext(_parentctx, _parentState));
						((ConditionalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						((ConditionalExprContext)_localctx).cndl = match(CNDL);
						setState(91);
						((ConditionalExprContext)_localctx).right = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExprContext(new ExprContext(_parentctx, _parentState));
						((ArithmeticExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						((ArithmeticExprContext)_localctx).arth = match(ARTH);
						setState(94);
						((ArithmeticExprContext)_localctx).r = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						match(T__11);
						setState(97);
						((AndExprContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"8\n\3\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\6\4B\n\4\r\4\16\4C\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5Z\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5"+
		"\3\5\2\3\b\6\2\4\6\b\2\2\2z\2\16\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\bY\3"+
		"\2\2\2\n\r\5\4\3\2\13\r\7\32\2\2\f\n\3\2\2\2\f\13\3\2\2\2\r\20\3\2\2\2"+
		"\16\f\3\2\2\2\16\17\3\2\2\2\17\3\3\2\2\2\20\16\3\2\2\2\218\5\b\5\2\22"+
		"\23\7\3\2\2\23\24\5\b\5\2\24\25\7\4\2\2\258\3\2\2\2\26\27\7\5\2\2\27\30"+
		"\5\b\5\2\30\31\7\31\2\2\31\32\7\32\2\2\32\33\5\6\4\2\338\3\2\2\2\34\35"+
		"\7\6\2\2\35\36\7\27\2\2\36\37\7\7\2\2\37 \5\b\5\2 !\7\b\2\2!\"\5\b\5\2"+
		"\"#\7\4\2\2#$\7\31\2\2$%\7\32\2\2%&\5\6\4\2&8\3\2\2\2\'(\7\t\2\2()\5\b"+
		"\5\2)*\7\31\2\2*+\7\32\2\2+,\5\6\4\2,-\7\n\2\2-.\7\32\2\2./\5\6\4\2/8"+
		"\3\2\2\2\608\7\26\2\2\61\62\7\27\2\2\62\63\7\34\2\2\638\5\b\5\2\64\65"+
		"\7\27\2\2\65\66\7\13\2\2\668\5\b\5\2\67\21\3\2\2\2\67\22\3\2\2\2\67\26"+
		"\3\2\2\2\67\34\3\2\2\2\67\'\3\2\2\2\67\60\3\2\2\2\67\61\3\2\2\2\67\64"+
		"\3\2\2\28\5\3\2\2\29A\7\35\2\2:>\5\4\3\2;=\7\32\2\2<;\3\2\2\2=@\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A:\3\2\2\2BC\3\2\2\2CA\3\2\2"+
		"\2CD\3\2\2\2DE\3\2\2\2EF\7\36\2\2F\7\3\2\2\2GH\b\5\1\2HZ\7\23\2\2IZ\7"+
		"\24\2\2JZ\7\25\2\2KZ\7\27\2\2LZ\7\f\2\2MN\7\r\2\2NO\5\b\5\2OP\7\4\2\2"+
		"PZ\3\2\2\2QR\7\17\2\2RS\5\b\5\2ST\7\4\2\2TZ\3\2\2\2UV\7\20\2\2VW\5\b\5"+
		"\2WX\7\4\2\2XZ\3\2\2\2YG\3\2\2\2YI\3\2\2\2YJ\3\2\2\2YK\3\2\2\2YL\3\2\2"+
		"\2YM\3\2\2\2YQ\3\2\2\2YU\3\2\2\2Zf\3\2\2\2[\\\f\7\2\2\\]\7\22\2\2]e\5"+
		"\b\5\b^_\f\6\2\2_`\7\21\2\2`e\5\b\5\7ab\f\5\2\2bc\7\16\2\2ce\5\b\5\6d"+
		"[\3\2\2\2d^\3\2\2\2da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\t\3\2\2\2"+
		"hf\3\2\2\2\n\f\16\67>CYdf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}