package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.id;
public class LoginPage extends  BasePage{
    private SelenideElement emailInputField = $(id("user-name"));
    private SelenideElement passwordInputField = $(id("password"));
    private SelenideElement loginButton = $(id("login-button"));
    private SelenideElement errorLogin  = $x("//div[contains (@class, 'error-message-container error')]");

    public  void openPage() {
        open(loginUrl);
    }

    public void inputEmail(String email) {
        emailInputField
                .shouldBe(Condition.visible)
                .sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordInputField
                .shouldBe(Condition.visible)
                .sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton
                .shouldBe(Condition.enabled)
                .click();
    }

    public boolean setErrorLogin() {
        return errorLogin.isDisplayed();
    }
}