import java.util.Stack;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Pop implements IOperation {
    private Stack<Double> stack;
    static Logger logger = getLogger("Logger");

    Pop(){}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        Double value = stack.pop();

        logger.info("Popped value: " + value);
        context.setStack(stack);
    }
}
