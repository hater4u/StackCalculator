import java.util.Stack;
import java.util.TreeMap;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Division implements IOperation{
    private Stack<Double> stack;
    static Logger logger = getLogger("Logger");

    Division () {}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        Double var1, var2, res;

        var2 = stack.pop();
        var1 = stack.pop();
        res = var1 / var2;

        logger.info("Division result: " + res);
        stack.push(res);
        context.setStack(stack);
    }
}
