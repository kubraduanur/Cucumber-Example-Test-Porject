package support.page_object;

import mpapi.models.orderSummary.OrderSummary;
import org.junit.jupiter.api.Test;
import support.utils.BaseUtils;

import static com.trendyol.mpapi.finance.helper.GrocerySettlementHelper.createGroceryOrderWithoutDiscount;
import static com.trendyol.mpapi.finance.matcher.CreatedMatcher.isTrueSettlementCreated;
import static org.hamcrest.MatcherAssert.assertThat;


public class CreatedPage {

    BaseUtils base = new BaseUtils();
    OrderSummary orderSummary=new OrderSummary();


    @Test
    public void shouldCreatedOrderWithDiscount() {
        orderSummary = createGroceryOrderWithoutDiscount(base.createSellers(), true,2,false);
        assertThat("Settlement should be correct. Order number: " + orderSummary.getOrderNumber(), isTrueSettlementCreated(orderSummary));
    }



}
