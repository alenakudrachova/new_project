package selenideTest;

import org.testng.annotations.Test;
import steps.SortingCheckSteps;

public class TestSortingCheck extends TestLogin{

    @Test
    public void CheckSorting () {
        super.TestLogin();
        SortingCheckSteps sortingCheckSteps = new SortingCheckSteps();
        sortingCheckSteps.sorting();
    }
}
