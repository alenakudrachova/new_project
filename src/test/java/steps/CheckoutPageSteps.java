package steps;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import pages.CheckoutPage;

import static com.codeborne.selenide.Selenide.$;
public class CheckoutPageSteps {
    private CheckoutPage checkoutPage = new CheckoutPage();
    public void clickCheckout () {
        checkoutPage.clickElementCheckout();
    }
    public void checkout (String firstName, String lastName, String postalCode) {
        checkoutPage.setFirstNameField(firstName);
        checkoutPage.setLastNameField(lastName);
        checkoutPage.setPostalCodeField(postalCode);
    }
    public void buttonsClick () {
        checkoutPage.buttonContinue();
        checkoutPage.setCheckoutOverview();
        checkoutPage.setButtonFinish();
    }
    private SelenideElement checkoutComplete = $(new ByText("Checkout: Complete!"));
    public boolean setCheckoutComplete () {
        return checkoutComplete.isDisplayed();
    }
}
