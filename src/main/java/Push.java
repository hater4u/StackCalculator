import java.util.logging.Logger;
import Exception.*;

import static java.util.logging.Logger.getLogger;

public class Push implements IOperation {
    static Logger logger = getLogger("Logger");

    Push () {}

    @Override
    public void action(String[] args, Context context) {
        double value;

        try {
            value = Double.parseDouble(args[0]);
        }
        catch (NumberFormatException e){
            value = context.get(args[0]);
        }

        context.push(value);
        logger.info("Pushed value: " + value);
    }
}
