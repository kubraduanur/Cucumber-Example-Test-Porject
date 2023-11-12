package step_definitions;


import io.cucumber.java.en.Given;
import mpapi.models.orderSummary.OrderSummary;
import mpapi.test.BaseTest;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterSuite;
import support.page_object.DeliveredPage;
import support.page_object.ReturnedPage;
import support.utils.BaseUtils;
import org.testng.annotations.BeforeSuite;

import java.util.List;

import static com.trendyol.mpapi.finance.helper.GrocerySettlementHelper.*;
import static com.trendyol.mpapi.finance.matcher.DeliveredMatcher.isTrueSettlementDelivered;
import static com.trendyol.mpapi.finance.matcher.ReturnedMatcher.isTrueSettlementReturned;
import static mpapi.helpers.RandomUtils.createRandomNumber;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class ReturnedSteps extends BaseTest {

    ReturnedPage returnedPage = new ReturnedPage();


    @Given("Grocery order returned")
    public void shouldPartialCancelGroceryOrderWithoutDiscountProvisionNegative() {
        returnedPage.shouldReturnedOrderWithDiscount();
    }
}
