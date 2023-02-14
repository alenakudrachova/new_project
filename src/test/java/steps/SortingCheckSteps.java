package steps;

import pages.SortingCheck;

public class SortingCheckSteps {
    private SortingCheck sortingCheck = new SortingCheck();

    public void sorting () {
        sortingCheck.setProductSort();
        sortingCheck.setSortPrice();
    }
}
