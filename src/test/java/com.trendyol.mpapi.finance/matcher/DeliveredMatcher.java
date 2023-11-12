package com.trendyol.mpapi.finance.matcher;

import mpapi.models.orderSummary.LineItemInfo;
import mpapi.models.orderSummary.OrderSummary;

import java.util.Objects;

public class DeliveredMatcher {

    public static boolean isTrueSettlementDelivered(OrderSummary orderSummary) {
        boolean isAllItemTrue = true;
        for (LineItemInfo lineItemInfo : orderSummary.getOrderLineItems()) {
            if (lineItemInfo.getPrice()<=13000) {
                isAllItemTrue = isAllItemTrue &&
                        Objects.equals("Delivered", orderSummary.getOmsOrderStatus()) &&
                        Objects.equals("Test Seller", lineItemInfo.getSellerName()) &&
                        Objects.equals("5678", lineItemInfo.getBarcode()) &&
                        Objects.equals("FirstName", lineItemInfo.getFirstName()) &&
                        Objects.equals("LastName", lineItemInfo.getLastName()) &&
                        Objects.equals("INSTANT_ORDER_TRANSACTION", lineItemInfo.getOriginId()) &&
                        Objects.equals(false, orderSummary.isTestOrder()) &&
                        Objects.equals(false, orderSummary.isGoDelivery()) &&
                        Objects.equals(2, orderSummary.getOrderLineItems().size()) &&
                        Objects.equals("12345678", lineItemInfo.getOrderLineItemId());
            }

            else {
                isAllItemTrue = false;
            }
        }
        return isAllItemTrue;
    }
}
