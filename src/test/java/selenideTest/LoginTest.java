package selenideTest;

import lombok.Builder;
import lombok.Data;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import prepare_data.PrepareLoginData;
import steps.LoginPageSteps;
@Data
@Builder
public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.setLoginPageHardcode();
        ProductsPage productsPage = new ProductsPage();
        Assert.assertTrue(productsPage.setProductHeader(), "Header not found");
    }

    @Test
    public void loginFakeTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login(PrepareLoginData.getData());
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.setErrorLogin(), "Error not found");
    }

    @Test(dataProvider = "invalidLoginData")
    public void loginDataProviderTest(String email, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.inputEmail(email);
        loginPage.inputPassword(password);
        loginPage.clickLoginButton();;
        Assert.assertTrue(loginPage.setErrorLogin(), "Error not found");
    }
    @DataProvider(name= "invalidLoginData")
    public Object [][] input(){
        return new Object[][]{
                {"lkjhgf",""},
                {"lkj","lkjdd"},
                {"","jhgfd"}
        };
    }
}