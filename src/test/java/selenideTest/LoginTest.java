package selenideTest;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static selenideTest.WebVariables.loginUrl;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() {
        open(loginUrl);
        $(By.id("user-name")).sendKeys("standard_user");
        $(By.id("password")).sendKeys("secret_sauce");
        $(By.id("login-button")).click();
        $x("//button[contains(@class, 'btn_primary') and contains(@name, 'add-to-cart-sauce-labs-onesie')]").click();
        $x("//a[contains (@class, 'shopping_cart_link')]").click();
        SelenideElement nameOfProduct = $x("//div[contains (@class, 'inventory_item_name')]");
        Assert.assertTrue(nameOfProduct.isDisplayed(), String.format("Element not found"));
    }
}
