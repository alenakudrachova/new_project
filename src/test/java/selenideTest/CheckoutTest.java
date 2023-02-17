package selenideTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import steps.CheckoutPageSteps;
import steps.LoginPageSteps;
import steps.ProductPageSteps;

public class CheckoutTest {

    @Test
    public void checkoutTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductPageSteps productPageSteps = new ProductPageSteps();
        productPageSteps.addToShoppingCart();
        CheckoutPageSteps checkoutPageSteps = new CheckoutPageSteps();
        checkoutPageSteps.clickCheckout();
        checkoutPageSteps.checkout("Alyona","A", "111");
        CheckoutPage checkoutPage = new CheckoutPage();
        Assert.assertTrue(checkoutPage.setCheckoutComplete(), "Checkout complete not found");
    }
}
