package steps;

import pages.CheckoutPage;
public class CheckoutPageSteps {
    private CheckoutPage checkoutPage = new CheckoutPage();

    public void clickCheckout() {
        checkoutPage.clickElementCheckout();
    }

    public void checkout(String firstName, String lastName, String postalCode) {
        checkoutPage.setFirstNameField(firstName);
        checkoutPage.setLastNameField(lastName);
        checkoutPage.setPostalCodeField(postalCode);
        checkoutPage.clickContinue();
        checkoutPage.waitForCheckoutOverview();
        checkoutPage.setButtonFinish();
    }
}
