import java.util.Stack;
import java.util.TreeMap;

public class Division implements IOperation{
    private Stack<Double> stack;

    Division () {}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        Double var1, var2, res;

        var2 = stack.pop();
        var1 = stack.pop();
        res = var1 / var2;

        stack.push(res);
        context.setStack(stack);
    }
}
