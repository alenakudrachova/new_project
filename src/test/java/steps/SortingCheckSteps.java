package steps;

import pages.SortingPage;

public class SortingCheckSteps {
    private SortingPage sortingCheck = new SortingPage();

    public void sorting () {
        sortingCheck.setProductSort();
        sortingCheck.setSortPrice();
    }
}
