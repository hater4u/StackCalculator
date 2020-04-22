import java.io.IOException;
import Exception.*;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Main {
    static Logger logger = getLogger("Logger");

    public static void main(String[] args) throws IOException, CalculatorException {
        logger.info("Initial logging");

        Calculator calculator = new Calculator();
        calculator.calculate("Calc.txt");
    }
}
