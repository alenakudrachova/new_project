package steps;

import models.LoginPageModel;
import pages.LoginPage;

public class LoginPageSteps {

    private LoginPage loginPage = new LoginPage();

    public void setLoginPageHardcode() {
        loginPage.openPage();
        loginPage.inputEmail(System.getProperty("username"));
        loginPage.inputPassword(System.getProperty("password"));
        loginPage.clickLoginButton();
    }

    public void login (LoginPageModel model) {
        loginPage.openPage();
        loginPage.inputEmail(model.getUsername());
        loginPage.inputPassword(model.getPassword());
        loginPage.clickLoginButton();
    }
}