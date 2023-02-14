package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.id;
import static selenideTest.WebVariables.loginUrl;
public class LoginPage extends  BasePage{
    private SelenideElement emailInputField = $(id("user-name"));
    private SelenideElement passwordInputField = $(id("password"));
    private SelenideElement loginButton = $(id("login-button"));
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
    public void clickLoginButton () {
        loginButton
                .shouldBe(Condition.enabled)
                .click();
    }
}
