package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReadOrderResponseModel {
    private String id;
    private double version;
    private String orderNumber;
    private long orderDate;
    private long lastModifiedDate;
    private String currency;
    private String paymentStatus;
    private boolean isTestOrder;
    private boolean isConcealed;
    private Store store;
    private Delivery delivery;
    private List<Line> lines;
    private List<ReadOrderResponseModelPromotion> promotions;
    private List<ReadOrderResponseModelCoupon> coupons;
    private long storefrontId;
    private ReadOrderResponseModelPrice price;
    private Payment payment;
    private Fraud fraud;
    private List<Object> charges;
    private UserInformation userInformation;
    private Object tip;
    private Address invoiceAddress;
    private Address shipmentAddress;
    private Customer customer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
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

    public long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public boolean isTestOrder() {
        return isTestOrder;
    }

    public void setIsTestOrder(boolean isTestOrder) {
        this.isTestOrder = isTestOrder;
    }

    public boolean isConcealed() {
        return isConcealed;
    }

    public void setIsConcealed(boolean isConcealed) {
        this.isConcealed = isConcealed;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public List<ReadOrderResponseModelPromotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<ReadOrderResponseModelPromotion> promotions) {
        this.promotions = promotions;
    }

    public List<ReadOrderResponseModelCoupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<ReadOrderResponseModelCoupon> coupons) {
        this.coupons = coupons;
    }

    public long getStorefrontId() {
        return storefrontId;
    }

    public void setStorefrontId(long storefrontId) {
        this.storefrontId = storefrontId;
    }

    public ReadOrderResponseModelPrice getPrice() {
        return price;
    }

    public void setPrice(ReadOrderResponseModelPrice price) {
        this.price = price;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Fraud getFraud() {
        return fraud;
    }

    public void setFraud(Fraud fraud) {
        this.fraud = fraud;
    }

    public List<Object> getCharges() {
        return charges;
    }

    public void setCharges(List<Object> charges) {
        this.charges = charges;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public Object getTip() {
        return tip;
    }

    public void setTip(Object tip) {
        this.tip = tip;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
