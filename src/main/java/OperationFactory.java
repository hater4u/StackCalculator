import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import Exception.*;

import static java.util.logging.Logger.getLogger;

public class OperationFactory {
    private volatile static OperationFactory instance;
    private Properties properties = new Properties();
    static Logger logger = getLogger("Logger");

    private OperationFactory() throws IOException{
        logger.info("Start create OperationFactory");

        InputStream conf = getClass().getResourceAsStream("config.properties");
        properties.load(conf);
        conf.close();

        logger.info("Successful create");
    }

    public static OperationFactory getInstance() throws IOException {
        if (instance == null)
        synchronized (OperationFactory.class)
        {
            if (instance == null) {
                instance = new OperationFactory();
            }
        }
        return instance;
    }

    IOperation createOperation(String operationName) throws FactoryException {
        IOperation operation;

        try {
            operation = (IOperation) Class.forName(properties.getProperty(operationName)).getDeclaredConstructor().newInstance();
        }
        catch (Exception e) {
            throw new FactoryException();
        }

        return operation;
    }
}
