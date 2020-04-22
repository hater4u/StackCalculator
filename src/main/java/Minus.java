import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;
import Exception.*;

public class Minus implements IOperation{
    static Logger logger = getLogger("Logger");

    Minus () {}

    @Override
    public void action(String[] args, Context context) throws CalculatorException{
        double var1, var2, res;

        if (context.getStackSize() < 2) {
            throw new StackException();
        }

        var2 = context.pop();
        var1 = context.pop();
        res = var1 - var2;

        logger.info("Subtraction result: " + res);
        context.push(res);
    }
}
