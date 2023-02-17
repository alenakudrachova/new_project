package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;
public class ProductsPage {
    private SelenideElement buyButton = $(id("add-to-cart-sauce-labs-onesie"));
    private SelenideElement elementShoppingCartLink = $(className("shopping_cart_link"));
    private SelenideElement buyButtonClick = $(id("add-to-cart-sauce-labs-backpack"));
    private SelenideElement elementShoppingLink = $(className("shopping_cart_link"));
    private SelenideElement buttonRemove = $(id("remove-sauce-labs-backpack"));

    public void setBuyButtonClick() {
        buyButtonClick
                .shouldBe(Condition.enabled)
                .click();
    }

    public void setElementShoppingLink() {
        elementShoppingLink
                .shouldBe(Condition.enabled)
                .click();
    }

    public void setButtonRemove() {
        buttonRemove
                .shouldBe(Condition.enabled)
                .click();
    }

    public void clickByButton() {
        buyButton
                .shouldBe(Condition.enabled)
                .click();
    }

    public void clickElementShopping() {
        elementShoppingCartLink
                .shouldBe(Condition.enabled)
                .click();
    }

    private SelenideElement productHeader = $(new ByText("Products"));

    public boolean setProductHeader() {
        return productHeader.isDisplayed();
    }

    private SelenideElement productName = $(new ByText("Sauce Labs Backpack"));

    public boolean setProductName() {
        return productName.exists();
    }

    private SelenideElement nameOfProduct = $(new ByText("Sauce Labs Onesie"));

    public boolean setNameOfProduct() {
        return nameOfProduct.exists();
    }
}

