import Exception.*;

public interface IOperation {
    void action(String[] args, Context context) throws CalculatorException;
}
