import java.util.logging.Logger;
import Exception.*;

import static java.util.logging.Logger.getLogger;

public class Push implements IOperation {
    static Logger logger = getLogger("Logger");

    Push () {}

    @Override
    public void action(String[] args, Context context) throws CalculatorException{
        double value;

        if (args.length < 1) {
            throw new IllegalArgumentException();
        }
        else {
            try {
                value = Double.parseDouble(args[0]);
            } catch (NumberFormatException e) {
                try {
                    value = context.get(args[0]);
                }
                catch (NullPointerException ex) {
                    throw new PushException();
                }
            }

            context.push(value);
            logger.info("Pushed value: " + value);
        }
    }
}
