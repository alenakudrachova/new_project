package steps;

import pages.ProductsPage;

public class DeleteSteps {
   private ProductsPage productsPage = new ProductsPage();

   public void deleteProduct() {
       productsPage.setBuyButtonClick();
       productsPage.setElementShoppingLink();
       productsPage.setButtonRemove();
   }
}
