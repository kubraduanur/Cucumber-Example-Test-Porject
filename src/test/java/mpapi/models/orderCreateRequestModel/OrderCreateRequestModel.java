package mpapi.models.orderCreateRequestModel;

import java.util.List;

public class OrderCreateRequestModel {
    private String orderParentNumber;
    private long orderDate;
    private long preOrderCompletedDate;
    private String paymentStatus;
    private long storefrontId;
    private boolean isTestOrder;
    private String currency;
    private List<Line> lineProducts;
    private List<Charge> charges;
    private List<Coupon> coupons;
    private Customer customer;
    private Delivery delivery;
    private Address invoiceAddress;
    private Address shipmentAddress;
    private Payment payment;
    private Price price;
    private List<Promotion> promotions;
    private Store store;
    private UserInformation userInformation;

    public boolean getIsTestOrder() {
        return isTestOrder;
    }

    public void setIsTestOrder(boolean isTestOrder) {
        this.isTestOrder = isTestOrder;
    }

    public String getOrderParentNumber() {
        return orderParentNumber;
    }

    public void setOrderParentNumber(String orderParentNumber) {
        this.orderParentNumber = orderParentNumber;
    }

    public long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(long orderDate) {
        this.orderDate = orderDate;
    }

    public long getPreOrderCompletedDate() {
        return preOrderCompletedDate;
    }

    public void setPreOrderCompletedDate(long preOrderCompletedDate) {
        this.preOrderCompletedDate = preOrderCompletedDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public long getStorefrontId() {
        return storefrontId;
    }

    public void setStorefrontId(long storefrontId) {
        this.storefrontId = storefrontId;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Line> getLines() {
        return lineProducts;
    }

    public void setLines(List<Line> lineProducts) {
        this.lineProducts = lineProducts;
    }

    public List<Charge> getCharges() {
        return charges;
    }

    public void setCharges(List<Charge> charges) {
        this.charges = charges;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Address getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(Address invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public Address getShipmentAddress() {
        return shipmentAddress;
    }

    public void setShipmentAddress(Address shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }
}
