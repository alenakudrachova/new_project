package steps;

import pages.LogoutPage;

public class LogoutSteps {
    LogoutPage logoutPage = new LogoutPage();

    public void setLogoutPage() {
        logoutPage.setBurgerMenu();
        logoutPage.setClickLogout();
    }
}
