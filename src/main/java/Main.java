import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;
import static java.util.logging.LogManager.getLogManager;

public class Main {
    static Logger logger = getLogger("Logger");

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        logger.info("Initial logging");

        Calculator calculator = new Calculator();
        calculator.calculate("Calc.txt");
    }
}
