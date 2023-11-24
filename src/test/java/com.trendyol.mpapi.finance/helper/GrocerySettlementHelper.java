package com.trendyol.mpapi.finance.helper;


import mpapi.models.orderCreateRequestModel.OrderCreateRequestModel;
import mpapi.models.orderSummary.OrderSummary;
import static mpapi.models.orderCreateRequestModel.factory.OrderCreateFactory.createOrderWithoutDiscountRequestModel;
import static mpapi.models.orderSummary.factory.OrderSummaryFactory.createOrderSummary;



public class GrocerySettlementHelper {

    private static OrderSummary createGroceryOrder(boolean isGoDelivery,int sellerId,int lineQuantity,boolean isTestOrder) {
        OrderSummary orderSummary = createOrderSummary(isGoDelivery,sellerId,lineQuantity,isTestOrder);
        return orderSummary;
    }

    public static OrderSummary createGroceryOrderWithDiscount(int sellerId,boolean isGoDelivery,int lineQuantity, boolean isTestOrder) {
        return createGroceryOrder(isGoDelivery,sellerId,lineQuantity,isTestOrder);
    }


    public static void changeGroceryStatus(OrderSummary orderSummary, String orderStatusTo) {
        switch (orderStatusTo) {
            case "Picking" -> updateGroceryPackagePicked(orderSummary);
            case "Invoiced" -> {
                updateGroceryPackagePicked(orderSummary);
                updateGroceryPackageInvoiced(orderSummary);
            }
            case "Shipped" -> {
                updateGroceryPackagePicked(orderSummary);
                updateGroceryPackageInvoiced(orderSummary);
                updateGroceryPackageShipped(orderSummary);
            }
            case "Delivered" -> {
                updateGroceryPackagePicked(orderSummary);
                updateGroceryPackageInvoiced(orderSummary);
                updateGroceryPackageShipped(orderSummary);
                updateGroceryPackageDelivered(orderSummary);
            }
        }
        orderSummary.setOmsOrderStatus(orderStatusTo);
    }
    public static void updateLineItemsForCancelWithReasonCode(OrderSummary orderSummary) {
        orderSummary.getOrderLineItems()
                .stream()
                .filter(lineItemInfo -> lineItemInfo.getStatus().equals("Created"))
                .forEach(lineItemInfo ->
                        {
                            lineItemInfo.setStatus("Canceled");
                            lineItemInfo.setOmsStatus("Canceled");
                            orderSummary.setOmsOrderStatus("Canceled");
                        }
                );
    }

    public static void updateLineItemsForClaim(OrderSummary orderSummary) {
        orderSummary.getOrderLineItems()
                .stream()
                .filter(lineItemInfo -> lineItemInfo.getStatus().equals("Delivered"))
                .forEach(lineItemInfo ->
                        {
                            lineItemInfo.setStatus("Returned");
                            lineItemInfo.setOmsStatus("Returned");
                            orderSummary.setOmsOrderStatus("Returned");
                        }
                );
    }

    private static void updateGroceryPackagePicked(OrderSummary orderSummary) {
        for(int i=0;i<orderSummary.getOrderLineItems().size();i++){
            if(orderSummary.getOrderLineItems().get(i).getStatus().equals("Created"))
            {
                orderSummary.getOrderLineItems().get(i).setStatus("Picking");
                orderSummary.setOmsOrderStatus("Picking");

            }
        }
    }

    private static void updateGroceryPackageInvoiced(OrderSummary orderSummary) {
        for(int i=0;i<orderSummary.getOrderLineItems().size();i++){
            if(orderSummary.getOrderLineItems().get(i).getStatus().equals("Picking"))
            {
                orderSummary.getOrderLineItems().get(i).setStatus("Invoiced");
                orderSummary.setOmsOrderStatus("Invoiced");

            }
        }


    }

    private static void updateGroceryPackageShipped(OrderSummary orderSummary) {
        for(int i=0;i<orderSummary.getOrderLineItems().size();i++){
            if(orderSummary.getOrderLineItems().get(i).getStatus().equals("Invoiced"))
            {
                orderSummary.getOrderLineItems().get(i).setStatus("Shipped");
                orderSummary.setOmsOrderStatus("Shipped");

            }
        }
    }

    private static void updateGroceryPackageDelivered(OrderSummary orderSummary) {
        for(int i=0;i<orderSummary.getOrderLineItems().size();i++){
            if(orderSummary.getOrderLineItems().get(i).getStatus().equals("Shipped"))
            {
                orderSummary.getOrderLineItems().get(i).setStatus("Delivered");
                orderSummary.setOmsOrderStatus("Delivered");

            }
        }
    }

    public static boolean isSellerResponsibleCancellation(OrderSummary orderSummary, int reasonCode) {
        return switch (reasonCode) {
            case 69 -> orderSummary.getOmsOrderStatus().equals("Created");
            case 602 -> !orderSummary.getOmsOrderStatus().equals("Shipped");
            default -> true;
        };
    }

}
