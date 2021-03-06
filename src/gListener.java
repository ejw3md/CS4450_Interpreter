// Generated from C:/Users/ewood/school/PoPL/CS4450_Interpreter\g.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(gParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(gParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(gParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(gParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(gParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(gParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(gParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(gParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(gParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(gParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentStatement(gParser.CommentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentStatement(gParser.CommentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatements}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatements(gParser.AssignmentStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatements}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatements(gParser.AssignmentStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(gParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(gParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(gParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(gParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomStringExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomStringExpr(gParser.AtomStringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomStringExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomStringExpr(gParser.AtomStringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toInt}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterToInt(gParser.ToIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toInt}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitToInt(gParser.ToIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomFloatExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomFloatExpr(gParser.AtomFloatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomFloatExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomFloatExpr(gParser.AtomFloatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parnExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParnExpr(gParser.ParnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parnExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParnExpr(gParser.ParnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomIntExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomIntExpr(gParser.AtomIntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomIntExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomIntExpr(gParser.AtomIntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toString}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterToString(gParser.ToStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toString}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitToString(gParser.ToStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomVarExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomVarExpr(gParser.AtomVarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomVarExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomVarExpr(gParser.AtomVarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(gParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(gParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBreakExpr(gParser.BreakExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBreakExpr(gParser.BreakExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(gParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(gParser.ConditionalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(gParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(gParser.AndExprContext ctx);
}