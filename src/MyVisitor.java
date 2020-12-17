
import java.util.HashMap;

public class MyVisitor extends gBaseVisitor<Object> {
    public static HashMap<String ,Object> variables = new HashMap<>();
    public static boolean broken = false;

    @Override public Object visitStart(gParser.StartContext ctx) {
        return visitChildren(ctx);
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
        Number begin = (Number)visit(ctx.begin);
        Number end = (Number)visit(ctx.end);

        variables.put(varname, begin);

        while(((Number)variables.get(varname)).intValue() < end.intValue() && !broken) {
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
        if(visit(ctx.l) instanceof java.lang.String && visit(ctx.r) instanceof java.lang.String){
            // if they are strings instead of
            String left = (String) visit(ctx.l);
            String right = (String) visit(ctx.r);
            return left + right;
        }
//        System.out.println(visit(ctx.l));
//        System.out.println(visit(ctx.r));

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

    @Override public Object visitAssignmentStatement(gParser.AssignmentStatementContext ctx) {
        Object exp = visit(ctx.exp);
        String name = ctx.var.getText();

        variables.put(name, exp);
        return null;
    }

    @Override public Object visitAssignmentStatements(gParser.AssignmentStatementsContext ctx) {
        String name = ctx.var.getText();
        String asgn = ctx.asgn.getText();
        Number exp = (Number)visit(ctx.exp);

        if(asgn.equals("+=")){
            Number temp = (Number)variables.get(name);

            double value = temp.doubleValue() + exp.doubleValue();
            variables.replace(name, value);
        }

        if(asgn.equals("-=")){
            Number temp = (Number)variables.get(name);

            double value = temp.doubleValue() - exp.doubleValue();
            variables.replace(name, value);
        }

        if(asgn.equals("*=")){
            Number temp = (Number)variables.get(name);

            double value = temp.doubleValue() * exp.doubleValue();
            variables.replace(name, value);
        }

        if(asgn.equals("/=")){
            if(exp.intValue() == 0){
                variables.replace(name, "Undefined");
            } else {
                Number temp = (Number) variables.get(name);
                double value = temp.doubleValue() / exp.doubleValue();

                variables.replace(name, value);
            }
        }

        if(asgn.equals("%=")){
            if(exp.intValue() == 0){
                variables.replace(name, "Undefined");
            } else {
                Number temp = (Number) variables.get(name);
                double value = temp.doubleValue() % exp.doubleValue();

                variables.replace(name, value);
            }
        }

        if(asgn.equals("^=")){
            if(exp.intValue() == 0){
                variables.replace(name, (double)1.0);
            } else {
                Number init = (Number) variables.get(name);
                double left = init.doubleValue();
                double temp = init.doubleValue();

                for (int i = 1; i < (Integer)exp; i++) {
                    left *= temp;
                }

                variables.replace(name, left);
            }
        }

        return null;
    }

    @Override
    public Object visitAndExpr(gParser.AndExprContext ctx) {
        Boolean left = (Boolean) visit(ctx.left);
        Boolean right = (Boolean) visit(ctx.right);

        if(left == true && right == true){
            return Boolean.TRUE;
        }


        return Boolean.FALSE;
    }

    @Override public  Object visitToString(gParser.ToStringContext ctx){
        Object exp = visit(ctx.exp);
        return exp.toString();
    }

    @Override public Object visitToInt(gParser.ToIntContext ctx){
        Number exp = (Number)visit(ctx.exp);
        return exp.intValue();
    }
    @Override public Object visitIfStatement(gParser.IfStatementContext ctx){
        boolean value = (boolean)visit(ctx.if_exp);

        if(value) {
            visit(ctx.if_block);
        }
        else if(ctx.elif_exp != null) {
            value = (boolean)visit(ctx.if_exp);
            if(value) {
                visit(ctx.elif_block);
            }
        }
        else {
            if(ctx.else_block != null) {
                visit(ctx.else_block);
            }
        }
        return null;
    }
}