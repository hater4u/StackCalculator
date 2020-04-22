import java.util.*;

public class Context {
    private Stack<Double> stack;
    private TreeMap<String, Double> map;

    Context() {
        stack = new Stack<>();
        map = new TreeMap<>();
    }

//    void setStack (Stack<Double> st) {
//        stack = st;
//    }
//
//    void setMap(TreeMap<String, Double> mp) {
//        map = mp;
//    }
//
//    Stack<Double> getStack() {
//        return stack;
//    }
//
//    TreeMap<String, Double> getMap() {
//        return map;
//    }

    void push(Double val) {
        stack.push(val);
    }

    Double pop() {
        return stack.pop();
    }

    Double peek() {
        return stack.peek();
    }

    void put (String str, Double val) {
        map.put(str, val);
    }

    Double get(String key){
        return map.get(key);
    }

    Integer getStackSize() {
        return stack.size();
    }
}
