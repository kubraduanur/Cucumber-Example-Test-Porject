package mpapi.models.orderSummary;


import java.util.List;

public class OrderSummary {
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

    public boolean isTestOrder() {
        return testOrder;
    }

    public void setTestOrder(boolean testOrder) {
        this.testOrder = testOrder;
    }

    public double getSellerInvoiceAmount() {
        return sellerInvoiceAmount;
    }

    public void setSellerInvoiceAmount(double sellerInvoiceAmount) {
        this.sellerInvoiceAmount = sellerInvoiceAmount;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isGoDelivery() {
        return goDelivery;
    }

    public void setGoDelivery(boolean goDelivery) {
        this.goDelivery = goDelivery;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(long orderDate) {
        this.orderDate = orderDate;
    }

    public List<LineItemInfo> getOrderLineItems() {
        return orderLineItems;
    }

    public void setOrderLineItems(List<LineItemInfo> orderLineItems) {
        this.orderLineItems = orderLineItems;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public String getOmsOrderStatus() {
        return omsOrderStatus;
    }

    public void setOmsOrderStatus(String omsOrderStatus) {
        this.omsOrderStatus = omsOrderStatus;
    }

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public double getProvisionPrice() {
        return provisionPrice;
    }

    public void setProvisionPrice(double provisionPrice) {
        this.provisionPrice = provisionPrice;
    }

    public double getProvisionCommission() {
        return provisionCommission;
    }

    public void setProvisionCommission(double provisionCommission) {
        this.provisionCommission = provisionCommission;
    }

    public double getProvisionSellerRevenue() {
        return provisionSellerRevenue;
    }

    public void setProvisionSellerRevenue(double provisionSellerRevenue) {
        this.provisionSellerRevenue = provisionSellerRevenue;
    }
}
