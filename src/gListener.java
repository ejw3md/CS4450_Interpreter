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
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(gParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(gParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentExpr}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentExpr(gParser.CommentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentExpr}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentExpr(gParser.CommentExprContext ctx);
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
	 * Enter a parse tree produced by the {@code unaryOpExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOpExpr(gParser.UnaryOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOpExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOpExpr(gParser.UnaryOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(gParser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(gParser.OpExprContext ctx);
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
}