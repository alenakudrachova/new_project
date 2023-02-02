package locator;

import org.openqa.selenium.By;

public class locatorsXpath {
    By linkTwitter = By.xpath("//a[@href='https://twitter.com/saucelabs']");
    By partTextFacebook = By.xpath("//a[contains(text(), 'Face')]");
    By select = By.xpath("//select");
    By elementButtonCheckout = By.xpath("//button[@name='checkout']");
    By findButtonById = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By allElements = By.xpath("//*");
    By secondButtons = By.xpath("//div[contains(@class, 'pricebar')]/button[2]");
    By findDivOr = By.xpath("//div[contains(@class, 'inventory_item_label') or contains(@class, 'inventory_item_img')]");
    By findButtonAnd = By.xpath("//button[contains(@class, 'btn_primary') and contains(@name, 'add-to-cart-sauce-labs-onesie')]");
    By followingSiblingPrice = By.xpath("//div/following-sibling::button");
    By precedingSiblingButton = By.xpath("//button/preceding-sibling::div");
}
