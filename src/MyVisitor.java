public class MyVisitor extends gBaseVisitor<Object> {
    @Override public Object visitStart(gParser.StartContext ctx) {
        System.out.println("IT WORKS!");

        return null;
    }
}
