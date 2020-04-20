import java.util.Stack;
import java.util.TreeMap;

public class Push implements IOperation {
    private Stack<Double> stack;
    private TreeMap<String,Double> map;

    Push () {}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();
        map = context.getMap();

        if (map.get(args[0]) == null) {
            stack.push(Double.valueOf(args[0]));
        }
        else {
            stack.push(map.get(args[0]));
        }

        context.setStack(stack);
    }
}
