import java.util.logging.Logger;
import Exception.*;

import static java.util.logging.Logger.getLogger;

public class Division implements IOperation{
    static Logger logger = getLogger("Logger");

    Division () {}

    @Override
    public void action(String[] args, Context context) {
        double var1, var2, res;

        if (context.getStackSize() < 2) {
            throw new StackException();
        }

        var2 = context.pop();
        var1 = context.pop();
        if (var2 == 0.0) {
            throw new DivisionException();
        } else {
            res = var1 / var2;

            logger.info("Division result: " + res);
            context.push(res);
        }
    }
}
