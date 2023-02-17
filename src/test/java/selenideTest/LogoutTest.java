package selenideTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SideBarMenu;
import steps.LoginPageSteps;
import steps.SideBarMenuSteps;

public class LogoutTest {
        @Test
        public void logoutTest() {
            LoginPageSteps loginPageSteps = new LoginPageSteps();
            loginPageSteps.login("standard_user", "secret_sauce");
            SideBarMenuSteps logoutSteps =new SideBarMenuSteps();
            logoutSteps.setSideBarMenu();
            SideBarMenu sideBarMenu = new SideBarMenu();
            Assert.assertFalse(sideBarMenu.showBurgerMenu(), "Burger menu is displayed");
        }
}
