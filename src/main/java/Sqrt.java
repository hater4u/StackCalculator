import java.util.logging.Logger;
import Exception.*;

import static java.lang.Math.sqrt;
import static java.util.logging.Logger.getLogger;

public class Sqrt implements IOperation{
    static Logger logger = getLogger("Logger");

    Sqrt () {}

    @Override
    public void action(String[] args, Context context) throws CalculatorException{
        double var, res;

        if (context.getStackSize() < 1) {
            throw new StackException();
        }

        var = context.pop();
        if (var < 0) {
            throw new SqrtException();
        } else {
            res = sqrt(var);


            logger.info("Root extraction result: " + res);
            context.push(res);
        }
    }
}
