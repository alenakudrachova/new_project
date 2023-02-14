package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

public class CheckoutPage {
    private SelenideElement elementCheckout = $(id("checkout"));
    private SelenideElement firstNameField = $(id("first-name"));
    private SelenideElement lastNameField = $(id("last-name"));
    private SelenideElement PostalCodeField = $(id("postal-code"));
    private SelenideElement buttonContinue = $(id("continue"));
    private SelenideElement checkoutOverview = $(className("summary_value_label"));
    private SelenideElement buttonFinish = $(id("finish"));
    public void clickElementCheckout() {
        elementCheckout
                .shouldBe(Condition.enabled)
                .click();
    }
    public void setFirstNameField (String firstName) {
        firstNameField
                .shouldBe(Condition.visible)
                .sendKeys(firstName);
    }
    public void setLastNameField (String lastName) {
        lastNameField
                .shouldBe(Condition.visible)
                .sendKeys(lastName);
    }
    public void setPostalCodeField (String postalCode) {
        PostalCodeField
                .shouldBe(Condition.visible)
                .sendKeys(postalCode);
    }
    public void buttonContinue () {
        buttonContinue
                .shouldBe(Condition.enabled)
                .click();
    }
    public void setCheckoutOverview() {
        checkoutOverview
                .shouldBe(Condition.visible);
    }
    public void setButtonFinish () {
        buttonFinish
                .shouldBe(Condition.enabled)
                .click();

    }

}
