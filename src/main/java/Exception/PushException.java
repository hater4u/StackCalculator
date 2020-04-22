package Exception;

public class PushException extends CalculatorException {
    public PushException() {
        super("Variable doesn't exist");
    }

}
