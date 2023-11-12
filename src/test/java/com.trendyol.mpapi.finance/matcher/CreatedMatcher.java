package com.trendyol.mpapi.finance.matcher;

import mpapi.models.orderSummary.LineItemInfo;
import mpapi.models.orderSummary.OrderSummary;

import java.util.Objects;

public class CreatedMatcher {
    public static boolean isTrueSettlementCreated(OrderSummary orderSummary) {
        boolean isAllItemTrue = true;
        for (LineItemInfo lineItemInfo : orderSummary.getOrderLineItems()) {
            if (lineItemInfo.getPrice()<=13000) {
                isAllItemTrue = isAllItemTrue &&
                        Objects.equals("Created", orderSummary.getOmsOrderStatus()) &&
                        Objects.equals("Test Seller", lineItemInfo.getSellerName()) &&
                        Objects.equals("5678", lineItemInfo.getBarcode()) &&
                        Objects.equals("FirstName", lineItemInfo.getFirstName()) &&
                        Objects.equals("LastName", lineItemInfo.getLastName()) &&
                        Objects.equals("INSTANT_ORDER_TRANSACTION", lineItemInfo.getOriginId()) &&
                        Objects.equals("12345678", lineItemInfo.getOrderLineItemId())&&
                        Objects.equals("Created", lineItemInfo.getStatus())&&
                        Objects.equals(false, orderSummary.isTestOrder())&&
                        Objects.equals(true, orderSummary.isGoDelivery())&&
                        Objects.equals(2, orderSummary.getOrderLineItems().size()) &&
                        Objects.equals(1100L, orderSummary.getStoreId())&&
                        Objects.equals(15.0, orderSummary.getCommissionRate());
            }
            else {
                isAllItemTrue = false;
            }
        }
        return isAllItemTrue;
    }

}
