package pages;

import elements.ProductsElement;

public class ProductsElementPage {

    public void productInfo() {
        new ProductsElement("Sauce Labs Backpack").clickForDetails();
        new ProductsElement("Sauce Labs Backpack").addProductToCart("Add to cart");
        new ProductsElement("Sauce Labs Backpack").removeFromCart("Remove");
    }
}
