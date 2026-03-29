package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@CardTest")
    public void beforeValidation()
    {
        System.out.println("Login performed successfully for credit card");

    }

    @After("@CardTest")
    public void afterTest()
    {
        System.out.println("Session is closed for credit card");
    }
}
