package com.trendyol.mpapi.finance.matcher;

import mpapi.models.orderSummary.LineItemInfo;
import mpapi.models.orderSummary.OrderSummary;

import java.util.Objects;


public class CancelledMatcher {


    public static boolean isTrueSettlementCanceled(OrderSummary orderSummary) {
        boolean isAllItemTrue = true;
        for (LineItemInfo lineItemInfo : orderSummary.getOrderLineItems()) {
            if (lineItemInfo.getPrice()<=13000 && !orderSummary.isTestOrder()) {
                isAllItemTrue = isAllItemTrue &&
                        Objects.equals("Canceled", orderSummary.getOmsOrderStatus()) &&
                        Objects.equals("Test Seller", lineItemInfo.getSellerName()) &&
                        Objects.equals("5678", lineItemInfo.getBarcode()) &&
                        Objects.equals("FirstName", lineItemInfo.getFirstName()) &&
                        Objects.equals("LastName", lineItemInfo.getLastName()) &&
                        Objects.equals("INSTANT_ORDER_TRANSACTION", lineItemInfo.getOriginId()) &&
                        Objects.equals("12345678", lineItemInfo.getOrderLineItemId())&&
                        Objects.equals("Canceled", lineItemInfo.getStatus())&&
                        Objects.equals(1100L, orderSummary.getStoreId())&&
                        Objects.equals(false, orderSummary.isGoDelivery())&&
                        Objects.equals(false, orderSummary.isTestOrder())&&
                        Objects.equals(3, orderSummary.getOrderLineItems().size()) &&
                        Objects.equals(15.0, orderSummary.getCommissionRate());
            }
            else {
                isAllItemTrue = false;
            }
        }
        return isAllItemTrue;
    }



}
