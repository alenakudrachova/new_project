package selenideTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;
import prepare_data.PrepareLoginData;
import steps.LoginPageSteps;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.setLoginPageHardcode();
        ProductsPage productsPage = new ProductsPage();
        Assert.assertTrue(productsPage.setProductHeader(), "Header not found");
    }

    @Test
    public void loginTestFake() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login(PrepareLoginData.getData());
        ProductsPage productsPage = new ProductsPage();
        Assert.assertTrue(productsPage.setProductHeader(), "Header not found");
    }

//    public void loginFluentPageTest() {
//        LoginFluentPage loginFluentPage = new LoginFluentPage();
//        boolean isHeaderDisplayed = loginFluentPage
//                .openPage()
//                .inputEmail("standard_user")
//                .inputPassword("secret_sauce")
//                .clickLoginButton()
//                .setProductHeader();
//        Assert.assertTrue(isHeaderDisplayed, "Header not found");
//    }
}
