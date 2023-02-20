package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.id;

public class SideBarMenu {
    private SelenideElement burgerMenu = $(id("react-burger-menu-btn"));
    private SelenideElement clickLogout = $(id("logout_sidebar_link"));

    public void setBurgerMenu() {
        burgerMenu
                .shouldBe(Condition.enabled)
                .click();
    }

    public void setClickLogout() {
        clickLogout
                .shouldBe(Condition.enabled)
                .click();
    }

    public boolean showBurgerMenu() {
        return burgerMenu.isDisplayed();
    }
}
