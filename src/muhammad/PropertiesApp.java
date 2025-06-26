package muhammad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/application.properties"));

            System.out.println(properties.getProperty("name.first"));

            properties.store(new FileOutputStream("name.properties"),"Ini Komen");
        } catch (FileNotFoundException exception) {
            System.out.println("File not found error : " );
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println("File load error : " + exception.getStackTrace());
        }

    }
}
