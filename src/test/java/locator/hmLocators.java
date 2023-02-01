package locator;

import org.openqa.selenium.By;

public class hmLocators {
    By linkTwitter = By.linkText("Twitter");
    By partLinkTextFacebook = By.partialLinkText("Face");
    By selectTag = By.tagName("select");
    By elementProducts = By.className("title");
    By nameButtonCheckout = By.name("checkout");
    By findId = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By allElements = By.cssSelector("*");
    By allButtons = By.cssSelector("[id^=add-to-cart]");
    By elementsButtons = By.cssSelector("#header_container button");
    By elementByClass = By.cssSelector("[class='inventory_item_name']");
    By dataTestAddToCardButton = By.cssSelector("[data-test^='add-to-cart']");
}
