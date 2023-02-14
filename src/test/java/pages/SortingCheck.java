package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SortingCheck {
    private SelenideElement productSort = $(By.tagName("select"));
    private SelenideElement sortPrice = $(By.cssSelector("[value='lohi']"));

    public void setProductSort() {
    productSort
            .shouldBe(Condition.enabled)
            .click();
    }
    public void setSortPrice() {
    sortPrice
            .shouldBe(Condition.visible)
            .click();
    }
}
