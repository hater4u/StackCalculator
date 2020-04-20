import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.TreeMap;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class OperationFactory {
    private TreeMap <String, IOperation> operationMap = new TreeMap<>();
    private volatile static OperationFactory instance;
    static Logger logger = getLogger("Logger");

    private OperationFactory() throws IOException, ClassNotFoundException {
        logger.info("Start create OperationFactory");

        Properties properties = new Properties();
        InputStream conf = getClass().getResourceAsStream("config.properties");
        properties.load(conf);

        for (String key : properties.stringPropertyNames()) {
            operationMap.put(key , createOperation(properties.getProperty(key)));
        }
        conf.close();

        logger.info("Successful create");
    }

    public static OperationFactory getInstance() throws IOException, ClassNotFoundException {
        if (instance == null)
        synchronized (OperationFactory.class)
        {
            if (instance == null) {
                instance = new OperationFactory();
            }
        }
        return instance;
    }

    IOperation createOperation(String operationName)  {
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
