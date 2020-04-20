import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.TreeMap;

public class OperationFactory {
    private TreeMap <String, IOperation> operationMap = new TreeMap<String, IOperation>();

    private static OperationFactory instance;
    private OperationFactory() throws IOException, ClassNotFoundException {
       // String propertiesFileName = "\\config.properties";
        Properties properties = new Properties();
        InputStream conf = getClass().getResourceAsStream("config.properties");
        properties.load(conf);


        for (String key : properties.stringPropertyNames()) {
            operationMap.put(key , createOperation(properties.getProperty(key)));
        }
        conf.close();
    }
    public static OperationFactory getInstance() throws IOException, ClassNotFoundException {
        if (instance == null) {
            instance = new OperationFactory();
        }
        return instance;
    }

    IOperation createOperation(String operationName) throws ClassNotFoundException {
        IOperation operation = operationMap.get(operationName);

        if (operationMap.get(operationName) == null) {
            try {
                operation = (IOperation) Class.forName(operationName).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return operation;
    }
}
