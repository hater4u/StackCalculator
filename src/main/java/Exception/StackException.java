package Exception;

public class StackException extends CalculatorException{
    public StackException() {
        super("Stack has no needed count of elements");
    }
}
