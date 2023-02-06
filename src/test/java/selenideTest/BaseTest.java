package selenideTest;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setUp() {
        Configuration.timeout = 10000;
        Configuration.pollingInterval = 10000;
    }
}
