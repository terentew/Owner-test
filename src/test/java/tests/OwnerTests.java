package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static config.Credentials.credentials;

@Tag("properties")
public class OwnerTests {

    @Test

    void readFromPropertiesTest() {
        String login = credentials.login();
        String password = credentials.password();
        String selenoidRemote=System.getProperty("seleniodRemote");

        System.out.println(login);
        System.out.println(password);

        String message = String.format("I try to login as %s with password %s", login, password);
        System.out.println(message);
        System.out.println(selenoidRemote);
    }
}

