package class31;

import utils.ConfigReader;
import utils.Constants;

import java.io.IOException;
import java.util.Properties;

public class ConfigReaderDemo {
    public static void main(String[] args) throws IOException {
        Properties properties =ConfigReader.read(Constants.ConfigReaderPath);
        System.out.println(properties.getProperty("user"));
    }
}
