package selenideTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import steps.LoginPageSteps;
import steps.ProductPageSteps;

public class TestProductPage{
    @Test
    public void TestProduct () {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductPageSteps productPageSteps = new ProductPageSteps();
        productPageSteps.byClick();
        Assert.assertTrue(productPageSteps.setNameOfProduct(), String.format("Element not found"));
    }
}
