package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

public class DeletePage {
    private SelenideElement buyButtonClick = $(id("add-to-cart-sauce-labs-backpack"));
    private SelenideElement elementShoppingLink = $(className("shopping_cart_link"));
    private SelenideElement buttonRemove = $(id("remove-sauce-labs-backpack"));
    public void setBuyButtonClick () {
        buyButtonClick
                .shouldBe(Condition.enabled)
                .click();
    }
    public void setElementShoppingLink () {
        elementShoppingLink
                .shouldBe(Condition.enabled)
                .click();
    }
    public void setButtonRemove() {
        buttonRemove
                .shouldBe(Condition.enabled)
                .click();
    }
}
