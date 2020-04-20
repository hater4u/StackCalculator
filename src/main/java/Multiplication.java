import java.util.Stack;

public class Multiplication implements IOperation{
    private Stack<Double> stack;

    Multiplication () {}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        Double var1, var2, res;

        var2 = stack.pop();
        var1 = stack.pop();
        res = var1 * var2;

        stack.push(res);
        context.setStack(stack);
    }
}
