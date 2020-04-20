import java.util.Stack;
import java.util.TreeMap;

public class Define implements IOperation {
    private TreeMap<String, Double> map;

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

        context.setMap(map);
    }
}
