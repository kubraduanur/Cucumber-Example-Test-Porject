package mpapi.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class BaseTest extends AbstractTestNGCucumberTests {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(ITestContext context) {
        for (ITestNGMethod method : context.getSuite().getAllMethods()) {
            method.setRetryAnalyzerClass(Retry.class);
        }
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        TestContext testContext = TestContext.init();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        TestContext.remove();
    }



}
