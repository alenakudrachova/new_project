package steps;
import pages.LoginPage;
public class LoginPageSteps {
    private LoginPage loginPage = new LoginPage();
    public void login (String email, String password) {
        loginPage.openPage();
        loginPage.inputEmail(email);
        loginPage.inputPassword(password);
        loginPage.clickLoginButton();
    }
}
