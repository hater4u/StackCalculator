package Exception;

public class DivisionException extends CalculatorException{
    public DivisionException() {
        super("Division by 0");
    }
}
