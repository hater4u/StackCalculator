import java.util.Stack;

public class Print implements IOperation {
    private Stack<Double> stack;

    Print(){}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        System.out.println(stack.peek());
    }
}
