package selenideTest;

import org.testng.annotations.Test;
import steps.LoginPageSteps;

public class TestLogin {

    @Test
    public void TestLogin () {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
    }
}
