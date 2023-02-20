package selenideTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SortingPage;
import steps.LoginPageSteps;
import steps.SortingCheckSteps;

public class SortingCheckTest{

    @Test
    public void checkSorting() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        SortingCheckSteps sortingCheckSteps = new SortingCheckSteps();
        sortingCheckSteps.sorting();
        SortingPage sortingPage = new SortingPage();
        Assert.assertTrue(sortingPage.nameSorting(),"Check name of sorting");
    }
}
