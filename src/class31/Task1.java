package class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    /*Create a property file to store following configurations:
browser=chrome
url=https://facebook.com
username
password
Read file and extract values of browser & url
*/
    public static void main(String[] args) throws IOException {
        String path="Files/Task1.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        //loads the data from the ROM to RAM
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("browser"));

    }
}
