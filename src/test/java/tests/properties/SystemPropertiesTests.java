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

}
