package selenideTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import steps.DeleteSteps;
import steps.LoginPageSteps;

public class TestDelete {
    @Test
    public void TestDelete () {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        DeleteSteps deleteSteps = new DeleteSteps();
        deleteSteps.deleteProduct();
        deleteSteps.setProductName();
        Assert.assertFalse(deleteSteps.setProductName(),"Element found");
    }
}
