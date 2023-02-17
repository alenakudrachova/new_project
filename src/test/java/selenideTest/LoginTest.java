package selenideTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;
import steps.LoginPageSteps;

public class LoginTest {

    @Test
    public void loginTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        Assert.assertTrue(productsPage.setProductHeader(), "Header not found");
    }
}
