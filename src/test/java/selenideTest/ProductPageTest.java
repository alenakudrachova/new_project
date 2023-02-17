package selenideTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;
import steps.LoginPageSteps;
import steps.ProductPageSteps;

public class ProductPageTest{
    @Test
    public void testProduct() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductPageSteps productPageSteps = new ProductPageSteps();
        productPageSteps.addToShoppingCart();
        ProductsPage productsPage = new ProductsPage();
        Assert.assertTrue(productsPage.setNameOfProduct(), String.format("Element not found"));
    }
}
