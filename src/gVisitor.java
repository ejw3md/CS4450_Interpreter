// Generated from C:/Users/ewood/school/PoPL/AntlrParser\g.g4 by ANTLR 4.8
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
}