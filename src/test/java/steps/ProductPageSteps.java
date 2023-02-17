package steps;

import pages.ProductsPage;
public class ProductPageSteps {
    private ProductsPage productsPage = new ProductsPage();

    public void addToShoppingCart() {
        productsPage.clickByButton();
        productsPage.clickElementShopping();
    }
}
