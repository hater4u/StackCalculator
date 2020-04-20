import java.util.logging.Logger;
import Exception.*;

import static java.util.logging.Logger.getLogger;

public class Plus implements IOperation{
    static Logger logger = getLogger("Logger");

    Plus () {}

    @Override
    public void action(String[] args, Context context) {
        double var1, var2, res;

        if (context.getStackSize() < 2) {
            throw new StackException();
        }

        var2 = context.pop();
        var1 = context.pop();
        res = var1 + var2;

        logger.info("Addition result: " + res);
        context.push(res);
    }
}
