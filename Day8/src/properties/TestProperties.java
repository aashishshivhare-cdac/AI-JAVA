package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("app.properties");

        Properties porperties = new Properties();
        porperties.load(fis);

        String value = porperties.getProperty("name");
        System.out.println(value);
    }
}
