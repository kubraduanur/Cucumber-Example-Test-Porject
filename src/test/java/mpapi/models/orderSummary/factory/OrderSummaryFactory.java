package mpapi.models.orderSummary.factory;


import mpapi.models.orderSummary.LineItemInfo;
import mpapi.models.orderSummary.OrderSummary;
import mpapi.models.orderSummary.builder.LineItemInfoBuilder;
import mpapi.models.orderSummary.builder.OrderSummaryBuilder;
import mpapi.models.readOrderResponseModel.Item;
import mpapi.models.readOrderResponseModel.Line;
import mpapi.models.readOrderResponseModel.ReadOrderResponseModel;

import java.util.*;


import static mpapi.helpers.RoundHelper.addZeroWhenSingleZeroAfterPoint;
import static mpapi.helpers.RoundHelper.roundToTwoDigitsAfterPoint;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class OrderSummaryFactory {
    public static OrderSummary createOrderSummary(boolean isGoDelivery, int sellerId,int lineQuantity,boolean isTestorder) {
        OrderSummary orderSummary = new OrderSummary();
        String orderDate = "1" + randomNumeric(12);
        String orderNumber = "7" + randomNumeric(8);
        String orderId= "3" + randomNumeric(5);
        List<LineItemInfo> lineItemInfos = new ArrayList<>();

             for(int i=0;i<lineQuantity;i++){
                 lineItemInfos.add(createLineItemInfo(sellerId,orderSummary));
             }
        return OrderSummaryBuilder
                .anOrderSummary()
                .orderId(orderId)
                .orderNumber(orderNumber)
                .orderDate(Long.parseLong(orderDate))
                .verified(false)
                .orderLineItems(lineItemInfos)
                .goDelivery(isGoDelivery)
                .sellerId(sellerId)
                .storeId(1100)
                .omsOrderStatus("Created")
                .commissionRate(15)
                .testOrder(isTestorder)
                .build();
    }






    private static LineItemInfo createLineItemInfo(int sellerId,OrderSummary orderSummary) {

        return LineItemInfoBuilder
                .aLineItemInfo()
                .status("Created")
                .sellerId(sellerId)
                .orderNumber(orderSummary.getOrderNumber())
                .orderId(orderSummary.getOrderId())
                .price(500)
                .orderLineItemId("12345678")
                .sellerName("Test Seller")
                .productName("Koltuk Takımı")
                .barcode("5678")
                .firstName("FirstName")
                .lastName("LastName")
                .currentAccountName("Test Company")
                .originId("INSTANT_ORDER_TRANSACTION")
                .sellerPromotionPrice(10)
                .sellerCouponPrice(5)
                .sellerPromotionName("Promotion 10")
                .sellerCouponName("Coupon 5")
                .build();
    }
}
