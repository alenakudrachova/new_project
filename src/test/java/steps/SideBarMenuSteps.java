package steps;

import pages.SideBarMenu;

public class SideBarMenuSteps {
    SideBarMenu sideBarMenu = new SideBarMenu();

    public void setSideBarMenu() {
        sideBarMenu.setBurgerMenu();
        sideBarMenu.setClickLogout();
    }
}
