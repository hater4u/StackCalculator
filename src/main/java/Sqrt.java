import java.util.Stack;
import java.util.logging.Logger;

import static java.lang.Math.sqrt;
import static java.util.logging.Logger.getLogger;

public class Sqrt implements IOperation{
    private Stack<Double> stack;
    static Logger logger = getLogger("Logger");

    Sqrt () {}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        Double var, res;

        var = stack.pop();
        res = sqrt(var);

        logger.info("Root extraction result: " + res);
        stack.push(res);
        context.setStack(stack);
    }
}
