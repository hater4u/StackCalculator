import java.util.Stack;
import java.util.TreeMap;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Define implements IOperation {
    private TreeMap<String, Double> map;
    static Logger logger = getLogger("Logger");

    Define () {}

    @Override
    public void action(String[] args, Context context) {
        String variable;
        Double value;

//        stack = context.getStack();
        map = context.getMap();

        variable = args[0];
        value = Double.valueOf(args[1]);

        map.put(variable, value);
        logger.info("Define successfully: " + variable + " = " + value);
        context.setMap(map);
    }
}
