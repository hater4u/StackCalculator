import java.util.logging.Logger;
import Exception.*;

import static java.util.logging.Logger.getLogger;

public class Pop implements IOperation {
    static Logger logger = getLogger("Logger");

    Pop(){}

    @Override
    public void action(String[] args, Context context) throws CalculatorException{
        if (context.getStackSize() < 1) {
            throw new StackException();
        }

        double value = context.pop();

        logger.info("Popped value: " + value);
    }
}
