import java.util.*;

public class Context {
    private Stack<Double> stack;
    private TreeMap<String, Double> map;

    Context() {
        stack = new Stack<Double>();
        map = new TreeMap<String, Double>();
    }

    Context(Stack<Double> st, TreeMap<String, Double> mp) {
        stack = st;
        map = mp;
    }

    void setStack (Stack<Double> st) {
        stack = st;
    }

    void setMap(TreeMap<String, Double> mp) {
        map = mp;
    }

    Stack<Double> getStack() {
        return stack;
    }

    TreeMap<String, Double> getMap() {
        return map;
    }


}
