import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Parser {
    private String _fileName;

    Parser(String fileName) {
        _fileName = fileName;
    }

    void parse() throws IOException {



        String propertiesFileName = "config.properties";
        Properties properties = new Properties();
        FileInputStream conf = new FileInputStream(propertiesFileName);
        properties.load(conf);

        FileInputStream fin = new FileInputStream(_fileName);
        //BufferedInputStream = new BufferedInputStream();



    }
}
