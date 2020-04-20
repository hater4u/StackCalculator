import java.util.Stack;

import static java.lang.Math.sqrt;

public class Sqrt implements IOperation{
    private Stack<Double> stack;

    Sqrt () {}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        Double var, res;

        var = stack.pop();
        res = sqrt(var);

        stack.push(res);
        context.setStack(stack);
    }
}
