import java.util.Stack;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Print implements IOperation {
    private Stack<Double> stack;
    static Logger logger = getLogger("Logger");

    Print(){}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        System.out.println(stack.peek());
        logger.info("Printed successfully");
    }
}
