import java.util.logging.Logger;
import Exception.*;

import static java.util.logging.Logger.getLogger;

public class Define implements IOperation {
    static Logger logger = getLogger("Logger");

    Define () {}

    @Override
    public void action(String[] args, Context context) throws CalculatorException{
        String variable;
        double value;

        if (args.length < 2) {
            throw new IllegalArgumentException();
        }
        else {

            variable = args[0];
            try {
                value = Double.parseDouble(args[1]);
            }
            catch (NumberFormatException ex) {
                throw new DefineException();
            }

            context.put(variable, value);
            logger.info("Define successfully: " + variable + " = " + value);
        }
    }
}
