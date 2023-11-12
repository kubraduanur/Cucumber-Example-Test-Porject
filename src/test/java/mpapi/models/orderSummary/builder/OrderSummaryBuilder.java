package mpapi.models.orderSummary.builder;

import mpapi.models.orderSummary.LineItemInfo;
import mpapi.models.orderSummary.OrderSummary;

import java.util.List;

public final class OrderSummaryBuilder {
    private String orderId;
    private boolean goDelivery;
    private String orderNumber;
    private long orderDate;
    private List<LineItemInfo> orderLineItems;
    private boolean verified;
    private long customerId;
    private long sellerId;
    private boolean testOrder;
    private String omsOrderStatus;
    private long storeId;
    private double provisionPrice;
    private double provisionCommission;
    private double provisionSellerRevenue;
    private double commissionRate;
    private double sellerInvoiceAmount;
    private long tagId;

    private OrderSummaryBuilder() {
    }

    public static OrderSummaryBuilder anOrderSummary() {
        return new OrderSummaryBuilder();
    }

    public OrderSummaryBuilder orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderSummaryBuilder goDelivery(boolean goDelivery) {
        this.goDelivery = goDelivery;
        return this;
    }

    public OrderSummaryBuilder orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public OrderSummaryBuilder orderDate(long orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public OrderSummaryBuilder orderLineItems(List<LineItemInfo> orderLineItems) {
        this.orderLineItems = orderLineItems;
        return this;
    }

    public OrderSummaryBuilder verified(boolean verified) {
        this.verified = verified;
        return this;
    }

    public OrderSummaryBuilder customerId(long customerId) {
        this.customerId = customerId;
        return this;
    }

    public OrderSummaryBuilder sellerId(long sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    public OrderSummaryBuilder testOrder(boolean testOrder) {
        this.testOrder = testOrder;
        return this;
    }

    public OrderSummaryBuilder omsOrderStatus(String omsOrderStatus) {
        this.omsOrderStatus = omsOrderStatus;
        return this;
    }

    public OrderSummaryBuilder storeId(long storeId) {
        this.storeId = storeId;
        return this;
    }


    public OrderSummaryBuilder provisionPrice(double provisionPrice) {
        this.provisionPrice = provisionPrice;
        return this;
    }

    public OrderSummaryBuilder provisionCommission(double provisionCommission) {
        this.provisionCommission = provisionCommission;
        return this;
    }

    public OrderSummaryBuilder provisionSellerRevenue(double provisionSellerRevenue) {
        this.provisionSellerRevenue = provisionSellerRevenue;
        return this;
    }

    public OrderSummaryBuilder commissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
        return this;
    }

    public OrderSummaryBuilder sellerInvoiceAmount(double sellerInvoiceAmount) {
        this.sellerInvoiceAmount = sellerInvoiceAmount;
        return this;
    }

    public OrderSummaryBuilder tagId(long tagId) {
        this.tagId = tagId;
        return this;
    }

    public OrderSummary build() {
        OrderSummary orderSummary = new OrderSummary();
        orderSummary.setOrderId(orderId);
        orderSummary.setGoDelivery(goDelivery);
        orderSummary.setOrderNumber(orderNumber);
        orderSummary.setOrderDate(orderDate);
        orderSummary.setOrderLineItems(orderLineItems);
        orderSummary.setVerified(verified);
        orderSummary.setCustomerId(customerId);
        orderSummary.setSellerId(sellerId);
        orderSummary.setTestOrder(testOrder);
        orderSummary.setOmsOrderStatus(omsOrderStatus);
        orderSummary.setStoreId(storeId);
        orderSummary.setProvisionPrice(provisionPrice);
        orderSummary.setProvisionCommission(provisionCommission);
        orderSummary.setProvisionSellerRevenue(provisionSellerRevenue);
        orderSummary.setCommissionRate(commissionRate);
        orderSummary.setSellerInvoiceAmount(sellerInvoiceAmount);

        return orderSummary;
    }
}
