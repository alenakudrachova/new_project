package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProductsElement {
    private String productXpath = "//div[@class='inventory_item' and contains(.,'%s')]";
    private SelenideElement productName;
    private String productText;
    private String buttonXpath = "//div[@class='inventory_item' and contains(.,'%s')]//button";

    public ProductsElement(String productText) {
        this.productText = productText;
    }

    private void initElement() {
        String locator = String.format(productXpath, productText);
        productName = $x(locator).shouldBe(Condition.visible);
    }

    public void clickForDetails() {
        initElement();
        productName.click();
    }

    public void addProductToCart(String addButtonText) {
        SelenideElement addToCartButton = $x(String.format(buttonXpath, addButtonText));
        String addToCartButtonText = addToCartButton.text();
        if (addToCartButtonText == "Add to cart") {
            addToCartButton.click();
        }
    }

    public void removeFromCart(String removeButtonText) {
        SelenideElement removeButton = $x(String.format(buttonXpath, removeButtonText));
        String removeButtonClick = removeButton.text();
        if (removeButtonClick == "Remove") {
            removeButton.click();
        }
    }
}