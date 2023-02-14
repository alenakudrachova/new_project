package steps;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import pages.DeletePage;

import static com.codeborne.selenide.Selenide.$;

public class DeleteSteps {
   private DeletePage deletePage = new DeletePage();

   public void deleteProduct () {
       deletePage.setBuyButtonClick();
       deletePage.setElementShoppingLink();
       deletePage.setButtonRemove();
   }
    private SelenideElement productName = $(new ByText("Sauce Labs Backpack"));
    public boolean setProductName () {
        return productName.exists();
    }
}
