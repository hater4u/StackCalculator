import java.util.logging.Logger;
import Exception.*;

import static java.util.logging.Logger.getLogger;

public class Define implements IOperation {
    static Logger logger = getLogger("Logger");

    Define () {}

    @Override
    public void action(String[] args, Context context) {
        String variable;
        double value;

        if (args.length < 2) {
            throw new DefineException();
        }
        else {

            variable = args[0];
            value = Double.parseDouble(args[1]);

            context.put(variable, value);
            logger.info("Define successfully: " + variable + " = " + value);
        }
    }
}
