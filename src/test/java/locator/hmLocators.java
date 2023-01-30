package locator;

import org.openqa.selenium.By;

public class hmLocators {
    By linkTwitter = By.linkText("Twitter");
    By partLinkTextFacebook = By.partialLinkText("Face");
    By divTag = By.tagName("div");
    By elementProducts = By.className("title");
    By nameButtonCheckout = By.name("checkout");
    By findId = By.id("[id^=add-to-cart]");
    By allElements = By.cssSelector("*");
    By allButtons = By.cssSelector("[id^=add-to-cart]");
    By ElementsById = By.cssSelector("#header_container *");
    By ElementByClass = By.cssSelector("[class='inventory_item_name']");
    By dataTestAddToCardButton = By.cssSelector("[data-test^='add-to-cart']");
}
