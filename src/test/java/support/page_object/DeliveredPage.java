package support.page_object;


import mpapi.models.orderSummary.OrderSummary;
import org.junit.jupiter.api.Test;
import support.utils.BaseUtils;

import java.util.List;

import static com.trendyol.mpapi.finance.helper.GrocerySettlementHelper.changeGroceryStatus;
import static com.trendyol.mpapi.finance.helper.GrocerySettlementHelper.createGroceryOrderWithoutDiscount;
import static com.trendyol.mpapi.finance.matcher.DeliveredMatcher.isTrueSettlementDelivered;
import static org.hamcrest.MatcherAssert.assertThat;


public class DeliveredPage {
    BaseUtils base=new BaseUtils();
    OrderSummary orderSummary=new OrderSummary();

    @Test
    public void shouldDeliveredOrderWithDiscount() {
        orderSummary = createGroceryOrderWithoutDiscount(base.createSellers(), false,2,false);
        changeGroceryStatus(orderSummary,"Delivered");
        assertThat("Settlement should be correct. Order number: " + orderSummary.getOrderNumber(), isTrueSettlementDelivered(orderSummary));

    }
}
