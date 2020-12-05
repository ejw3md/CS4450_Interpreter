import java.util.HashMap;

public class MyVisitor extends gBaseVisitor<Object> {
    public static HashMap<String ,Object> variables = new HashMap<>();

    @Override public Object visitStart(gParser.StartContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAssignmentStatement(gParser.AssignmentStatementContext ctx) {
        Object exp = visit(ctx.exp);
        String name = ctx.var.getText();

        variables.put(name, exp);
        return null;
    }

    @Override public Object visitExprStatement(gParser.ExprStatementContext ctx) {
        return visit(ctx.exp);
    }

    @Override public Object visitCommentExpr(gParser.CommentExprContext ctx) {
        return null;
    }

    @Override public Object visitUnaryOpExpr(gParser.UnaryOpExprContext ctx) { return visitChildren(ctx); }

    @Override public Object visitOpExpr(gParser.OpExprContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAtomStringExpr(gParser.AtomStringExprContext ctx) {
        String with_quotes = ctx.atom.getText();
        return with_quotes.substring(1, with_quotes.length()-1);
    }

    @Override public Object visitAtomFloatExpr(gParser.AtomFloatExprContext ctx) {
        return Float.parseFloat(ctx.atom.getText());
    }

    @Override public Object visitParnExpr(gParser.ParnExprContext ctx) {
        return visit(ctx.exp);
    }

    @Override public Object visitAtomIntExpr(gParser.AtomIntExprContext ctx) {
        return Integer.parseInt(ctx.atom.getText());
    }

    @Override public Object visitAtomVarExpr(gParser.AtomVarExprContext ctx) {
        return variables.get(ctx.var.getText());
    }

    @Override public Object visitPrintExpr(gParser.PrintExprContext ctx) {
        Object exp = visit(ctx.exp);
        System.out.println(exp);

        return null;
    }
}
