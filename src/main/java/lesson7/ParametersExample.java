package lesson7;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    @Test
    @Parameters({"email", "password"})
    public void login(String email, String password){
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

}
