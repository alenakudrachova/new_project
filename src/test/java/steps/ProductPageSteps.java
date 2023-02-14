package steps;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import pages.ProductsPage;

import static com.codeborne.selenide.Selenide.$;
public class ProductPageSteps {
    private ProductsPage productsPage = new ProductsPage();
    public void byClick () {
        productsPage.clickByButton();
        productsPage.clickElementShopping();
    }
    private SelenideElement nameOfProduct = $(new ByText("Sauce Labs Onesie"));
    public boolean setNameOfProduct () {
        return nameOfProduct.exists();
    }
}
