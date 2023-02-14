package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;
public class ProductsPage {
    private SelenideElement buyButton = $(id("add-to-cart-sauce-labs-onesie"));
    private SelenideElement elementShoppingCartLink = $(className("shopping_cart_link"));

    public void clickByButton () {
        buyButton
                .shouldBe(Condition.enabled)
                .click();
    }
    public void clickElementShopping() {
        elementShoppingCartLink
                .shouldBe(Condition.enabled)
                .click();
    }
}

