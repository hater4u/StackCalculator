import java.io.*;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Calculator {
    Context context = new Context();
    static Logger logger = getLogger("Logger");

    public Calculator() {}

    public void calculate(String filename) throws IOException, ClassNotFoundException {
        if (filename == null) {
            logger.info("Start calculate from System.in");
            calculate(System.in);
        }
        else {
            logger.info("Start calculate from file: " + filename);
            calculate(getClass().getResourceAsStream(filename));
        }
    }

    public void calculate(InputStream is) throws IOException, ClassNotFoundException {
        OperationFactory operationFactory = OperationFactory.getInstance();


        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        String[] words;
        String[] args = new String[10];
        while ((line = reader.readLine()) != null) {
            if (line.charAt(0) != '#') {
                words = line.split("[^0-9a-zA-z]+");
                StringBuilder arguments = new StringBuilder();
                for (int it = 1; it < words.length; it++){
                    args[it - 1] = words[it];
                }
                operationFactory.createOperation(words[0]).action(args, context);
            }
        }
        logger.info("Calculate end successfully");
    }
}
