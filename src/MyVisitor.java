import java.util.HashMap;

public class MyVisitor extends gBaseVisitor<Object> {
    public static HashMap<String ,Object> variables = new HashMap<>();
    public static boolean broken = false;

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

    @Override public Object visitCommentStatement(gParser.CommentStatementContext ctx) {
        return null;
    }

    //TODO: TEST function
    @Override public Object visitWhileStatement(gParser.WhileStatementContext ctx) {
        while((Boolean)visit(ctx.exp) && !broken) {
            visit(ctx.block);
        }

        broken = false;
        return null;
    }

    @Override public Object visitForStatement(gParser.ForStatementContext ctx) {
        String varname = ctx.var.getText();
        Integer begin = (Integer)visit(ctx.begin);
        Integer end = (Integer)visit(ctx.end);

        variables.put(varname, begin);

        while((Integer)variables.get(varname) < end && !broken) {
            visit(ctx.block);
            Integer temp = (Integer)variables.get(varname);
            variables.put(varname, temp+1);
        }
        broken = false;

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

    @Override public Object visitPrintStatement(gParser.PrintStatementContext ctx) {
        Object exp = visit(ctx.exp);
        System.out.println(exp);

        return null;
    }

    @Override public Object visitBreakExpr(gParser.BreakExprContext ctx) {
        broken = true;
        return null;
    }

    @Override public  Object visitToString(gParser.ToStringContext ctx){
        Object exp = visit(ctx.exp);
        return exp.toString();
    }

    @Override public Object visitToInt(gParser.ToIntContext ctx){
        Float exp = (Float)visit(ctx.exp);
        return exp.intValue();
    }
    @Override public Object visitIfStatement(gParser.IfStatementContext ctx){
        boolean value = (boolean)visit(ctx.expr());

        if(value) {
            visit(ctx.statement_block(0));
        }
        else {
            visit(ctx.statement_block(1));
        }
        return null;
    }
}
