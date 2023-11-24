package support.page_object;


import mpapi.models.orderSummary.OrderSummary;
import org.junit.jupiter.api.Test;
import support.utils.BaseUtils;

import static com.trendyol.mpapi.finance.helper.GrocerySettlementHelper.*;
import static com.trendyol.mpapi.finance.matcher.DeliveredMatcher.isTrueSettlementDelivered;
import static com.trendyol.mpapi.finance.helper.GrocerySettlementHelper.createGroceryOrderWithDiscount;
import static com.trendyol.mpapi.finance.matcher.ReturnedMatcher.isTrueSettlementReturned;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReturnedPage {
    BaseUtils base = new BaseUtils();
    OrderSummary orderSummary=new OrderSummary();

    @Test
    public void shouldReturnedOrderWithDiscount() {
        orderSummary = createGroceryOrderWithDiscount(base.createSellers(), true,2,false);
        changeGroceryStatus(orderSummary,"Delivered");
        updateLineItemsForClaim(orderSummary);
        assertThat("Settlement should be correct. Order number: " + orderSummary.getOrderNumber(), isTrueSettlementReturned(orderSummary));
    }
}

