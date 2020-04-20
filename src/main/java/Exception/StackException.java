package Exception;

public class StackException extends CalculatorException{
    public StackException() {
        super("Stack have only one element or is empty");
    }
}
