import java.util.HashMap;

public class MyVisitor extends gBaseVisitor<Object> {
    public static HashMap<String ,Object> variables = new HashMap<>();
    public static boolean broken = false;

    @Override public Object visitStart(gParser.StartContext ctx) {
        return visitChildren(ctx);
    }

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

    @Override public Object visitConditionalExpr(gParser.ConditionalExprContext ctx) {
        Number left = (Number) visit(ctx.left);
        Number right = (Number) visit(ctx.right);
        String cond = ctx.cndl.getText();

        if(cond.equals("==")){
            if(left.doubleValue() == right.doubleValue()){
                return Boolean.TRUE;
            }
            else
                return Boolean.FALSE;
        }
        if(cond.equals("!=")) {
            if(left.doubleValue() != right.doubleValue()){
                return Boolean.TRUE;
            }
            else
                return Boolean.FALSE;
        }
        if(cond.equals("<")) {
            if(left.doubleValue() < right.doubleValue()){
                return Boolean.TRUE;
            }
            else
                return Boolean.FALSE;
        }
        if(cond.equals("<=")) {
            if(left.doubleValue() <= right.doubleValue()){
                return Boolean.TRUE;
            }
            else
                return Boolean.FALSE;
        }
        if(cond.equals(">")) {
            if(left.doubleValue() > right.doubleValue()){
                return Boolean.TRUE;
            }
            else
                return Boolean.FALSE;
        }
        if(cond.equals(">=")) {
            if(left.doubleValue() >= right.doubleValue()){
                return Boolean.TRUE;
            }
            else
                return Boolean.FALSE;
        }

        return null;
    }

    @Override public Object visitArithmeticExpr(gParser.ArithmeticExprContext ctx) {
        Number left = (Number)visit(ctx.l);
        Number right = (Number)visit(ctx.r);
        String arth = ctx.arth.getText();

        if(arth.equals("+")) {
            return left.doubleValue() + right.doubleValue();
        }

        if(arth.equals("-")) {
            return left.doubleValue() - right.doubleValue();
        }

        if(arth.equals("*")) {
            return left.doubleValue() * right.doubleValue();
        }

        if(arth.equals("/")) {
            if(right.intValue() == 0){
                return "Undefined";
            } else {
                return left.doubleValue() / right.doubleValue();
            }
        }

        if(arth.equals("%")) {
            if(right.intValue() == 0){
                return "Undefined";
            } else {
                return left.doubleValue() % right.doubleValue();
            }
        }

        if(arth.equals("^")) {
            double value = left.doubleValue();
            double temp = left.doubleValue();

            if(right.intValue() == 0){
                return (double)1;
            } else {
                for (int i = 1; i < (Integer) right; i++) {
                    value *= temp;
                }
                return value;
            }
        }

        return null;
    }
}