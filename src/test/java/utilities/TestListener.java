package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(String.format("%s started", result.getName()));
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(String.format("%s finished", context.getName()));
    }
}
