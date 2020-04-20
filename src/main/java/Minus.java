import java.util.Stack;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Minus implements IOperation{
    private Stack<Double> stack;
    static Logger logger = getLogger("Logger");

    Minus () {}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        Double var1, var2, res;

        var2 = stack.pop();
        var1 = stack.pop();
        res = var1 - var2;

        logger.info("Subtraction result: " + res);
        stack.push(res);
        context.setStack(stack);
    }
}
