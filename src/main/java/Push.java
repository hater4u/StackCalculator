import java.util.Stack;
import java.util.TreeMap;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Push implements IOperation {
    private Stack<Double> stack;
    private TreeMap<String,Double> map;
    static Logger logger = getLogger("Logger");

    Push () {}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();
        map = context.getMap();
        Double value;

        if (map.get(args[0]) == null) {
            value = stack.push(Double.valueOf(args[0]));
        }
        else {
            value = stack.push(map.get(args[0]));
        }

        logger.info("Pushed value: " + value);
        context.setStack(stack);
    }
}
