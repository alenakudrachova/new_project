package selenideTest;

import org.testng.annotations.Test;
import steps.LoginPageSteps;
import steps.LogoutSteps;

public class TestLogout {
        @Test
        public void TestLogout () {
            LoginPageSteps loginPageSteps = new LoginPageSteps();
            loginPageSteps.login("standard_user", "secret_sauce");
            LogoutSteps logoutSteps =new LogoutSteps();
            logoutSteps.setLogoutPage();
        }
}
