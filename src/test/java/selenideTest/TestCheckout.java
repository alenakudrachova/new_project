package selenideTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import steps.CheckoutPageSteps;

public class TestCheckout extends TestProductPage{

    @Test
    public void TestCheckout () {
        super.TestProduct();
        CheckoutPageSteps checkoutPageSteps = new CheckoutPageSteps();
        checkoutPageSteps.clickCheckout();
        checkoutPageSteps.checkout("Alyona","A", "111");
        checkoutPageSteps.buttonsClick();
        Assert.assertTrue(checkoutPageSteps.setCheckoutComplete(), "Checkout complete not found");
    }
}
