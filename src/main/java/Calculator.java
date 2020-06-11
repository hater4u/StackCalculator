import java.io.*;
import Exception.*;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Calculator {
    Context context = new Context();
    static Logger logger = getLogger("Logger");

    public Calculator() {}

    public Calculator(Context context_data) {
        context = context_data; //only for tests
    }

    public void calculate(String filename) throws IOException, CalculatorException {
            logger.info("Start calculate from file: " + filename);
            calculate(new FileInputStream(filename));
    }

    public void calculate(InputStream is) throws IOException, CalculatorException {
        OperationFactory operationFactory = OperationFactory.getInstance();


        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        String[] words;
        String[] args;
        while ((line = reader.readLine()) != null) {
            if (line.charAt(0) != '#') {
                words = line.split("\\s+");
                args = new String[words.length - 1];
                if (words.length - 1 >= 0) {
                    System.arraycopy(words, 1, args, 0, words.length - 1);
                    operationFactory.createOperation(words[0]).action(args, context);
                }
            }
        }
        logger.info("Calculate end successfully");
    }
}
