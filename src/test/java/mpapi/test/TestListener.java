package mpapi.test;

import mpapi.helpers.LogUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static final Logger LOGGER = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult iTestResult) {
        try {
            LOGGER.info("TEST STARTED: {}", iTestResult.getName());
        } catch (ArrayIndexOutOfBoundsException oobe) {
            LOGGER.error("Cannot log test name!");
        }
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        LogUtils.logInfo("Test Finished Successfully: " + iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        LogUtils.logError("Test Failed: " + iTestResult.getName() + " Exception is: " + iTestResult.getThrowable().getMessage());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        if (iTestResult.getParameters().length == 0) {
            LogUtils.logWarn("Test Has Been Skipped: " + iTestResult.getName() + " Exception is: " + iTestResult.getThrowable().getMessage());
        } else {
            iTestResult.setStatus(2);
            iTestResult.setParameters(new String[]{});
        }
    }
}
