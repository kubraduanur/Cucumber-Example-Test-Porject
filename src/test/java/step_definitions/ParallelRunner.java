package step_definitions;

import com.trendyol.mpapi.finance.BaseFinanceTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = {"src/test/resources/step_definitions"})

public class ParallelRunner extends BaseFinanceTest {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

