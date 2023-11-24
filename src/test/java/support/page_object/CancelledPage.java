package support.page_object;

import mpapi.models.orderSummary.OrderSummary;
import org.junit.jupiter.api.Test;
import support.utils.BaseUtils;

import static com.trendyol.mpapi.finance.helper.GrocerySettlementHelper.createGroceryOrderWithDiscount;
import static com.trendyol.mpapi.finance.helper.GrocerySettlementHelper.updateLineItemsForCancelWithReasonCode;
import static com.trendyol.mpapi.finance.matcher.CancelledMatcher.isTrueSettlementCanceled;
import static org.hamcrest.MatcherAssert.assertThat;

public class CancelledPage {
    BaseUtils base=new BaseUtils();
    OrderSummary orderSummary=new OrderSummary();

    @Test
    public void shouldCancelledOrderWithDiscount() {
        orderSummary = createGroceryOrderWithDiscount(base.createSellers(), false,3,false);
        updateLineItemsForCancelWithReasonCode(orderSummary);
        assertThat("Settlement should be correct. Order number: " + orderSummary.getOrderNumber(), isTrueSettlementCanceled(orderSummary));

    }
}
