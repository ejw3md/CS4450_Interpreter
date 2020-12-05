// Generated from C:/Users/ewood/school/PoPL/CS4450_Interpreter\g.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(gParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(gParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(gParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(gParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentExpr}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentExpr(gParser.CommentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomStringExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomStringExpr(gParser.AtomStringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOpExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOpExpr(gParser.UnaryOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(gParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomFloatExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFloatExpr(gParser.AtomFloatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parnExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParnExpr(gParser.ParnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomIntExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomIntExpr(gParser.AtomIntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomVarExpr}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVarExpr(gParser.AtomVarExprContext ctx);
}