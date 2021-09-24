package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("properties")
public class SystemPropertiesTests {

    @Test
    void test1() {

        System.out.println("Test1 browser   " + System.getProperty("browser"));
        System.out.println("Test1 version   " + System.getProperty("version"));

    }

    @Test
    void readNullFormPropertiestest(){
        String value=System.getProperty("ourProperty");
        System.out.println(value);
    }

    @Test
    void readDefaultFormPropertiestest(){
        String value=System.getProperty("ourProperty","DefaultValue");
        System.out.println(value);
    }

    @Test
    void readWithTerminalFormPropertiestest(){
        String browser =System.getProperty("browser","chrome");
        String version =System.getProperty("version","91");
        System.out.println(browser);
        System.out.println(version);
    }


}
