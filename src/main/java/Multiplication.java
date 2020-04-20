import java.util.Stack;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Multiplication implements IOperation{
    private Stack<Double> stack;
    static Logger logger = getLogger("Logger");

    Multiplication () {}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        Double var1, var2, res;

        var2 = stack.pop();
        var1 = stack.pop();
        res = var1 * var2;

        logger.info("Multiplication result: " + res);
        stack.push(res);
        context.setStack(stack);
    }
}
