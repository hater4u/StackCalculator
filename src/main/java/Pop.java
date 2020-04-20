import java.util.Stack;

public class Pop implements IOperation {
    private Stack<Double> stack;

    Pop(){}

    @Override
    public void action(String[] args, Context context) {
        stack = context.getStack();

        stack.pop();

        context.setStack(stack);
    }
}
