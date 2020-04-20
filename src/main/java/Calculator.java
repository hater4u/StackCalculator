import java.io.*;
import java.util.Stack;

public class Calculator {
    Context context = new Context();

    public Calculator() {}

    public void calculate() throws IOException, ClassNotFoundException {
        OperationFactory operationFactory = OperationFactory.getInstance();

        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("Calc.txt")));
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


    }
}
