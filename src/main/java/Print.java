import java.util.logging.Logger;
import Exception.*;

import static java.util.logging.Logger.getLogger;

public class Print implements IOperation {
    static Logger logger = getLogger("Logger");

    Print(){}

    @Override
    public void action(String[] args, Context context) {
        if (context.getStackSize() < 2) {
            throw new StackException();
        }

        System.out.println(context.peek());
        logger.info("Printed successfully");
    }
}
