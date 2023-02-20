package selenideTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;
import steps.DeleteSteps;
import steps.LoginPageSteps;

public class DeleteTest {
    @Test
    public void deleteTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        DeleteSteps deleteSteps = new DeleteSteps();
        deleteSteps.deleteProduct();
        ProductsPage productsPage = new ProductsPage();
        productsPage.setProductName();
        Assert.assertFalse(productsPage.setProductName(),"Element found");
    }
}
