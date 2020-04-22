package Exception;

public class FactoryException extends CalculatorException{
    public FactoryException() {
        super("Command not found");
    }
}
