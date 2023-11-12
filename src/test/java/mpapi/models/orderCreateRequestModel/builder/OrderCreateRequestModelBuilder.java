package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.*;

import java.util.List;

public final class OrderCreateRequestModelBuilder {
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

    private OrderCreateRequestModelBuilder() {
    }

    public static OrderCreateRequestModelBuilder anOrderCreateRequestModel() {
        return new OrderCreateRequestModelBuilder();
    }

    public OrderCreateRequestModelBuilder orderParentNumber(String orderParentNumber) {
        this.orderParentNumber = orderParentNumber;
        return this;
    }

    public OrderCreateRequestModelBuilder orderDate(long orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public OrderCreateRequestModelBuilder preOrderCompletedDate(long preOrderCompletedDate) {
        this.preOrderCompletedDate = preOrderCompletedDate;
        return this;
    }

    public OrderCreateRequestModelBuilder paymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    public OrderCreateRequestModelBuilder storefrontId(long storefrontId) {
        this.storefrontId = storefrontId;
        return this;
    }

    public OrderCreateRequestModelBuilder isTestOrder(boolean isTestOrder) {
        this.isTestOrder = isTestOrder;
        return this;
    }

    public OrderCreateRequestModelBuilder currency(String currency) {
        this.currency = currency;
        return this;
    }

    public OrderCreateRequestModelBuilder lines(List<Line> lineProducts) {
        this.lineProducts = lineProducts;
        return this;
    }

    public OrderCreateRequestModelBuilder charges(List<Charge> charges) {
        this.charges = charges;
        return this;
    }

    public OrderCreateRequestModelBuilder coupons(List<Coupon> coupons) {
        this.coupons = coupons;
        return this;
    }

    public OrderCreateRequestModelBuilder customer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderCreateRequestModelBuilder delivery(Delivery delivery) {
        this.delivery = delivery;
        return this;
    }

    public OrderCreateRequestModelBuilder invoiceAddress(Address invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
        return this;
    }

    public OrderCreateRequestModelBuilder shipmentAddress(Address shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
        return this;
    }

    public OrderCreateRequestModelBuilder payment(Payment payment) {
        this.payment = payment;
        return this;
    }

    public OrderCreateRequestModelBuilder price(Price price) {
        this.price = price;
        return this;
    }

    public OrderCreateRequestModelBuilder promotions(List<Promotion> promotions) {
        this.promotions = promotions;
        return this;
    }

    public OrderCreateRequestModelBuilder store(Store store) {
        this.store = store;
        return this;
    }

    public OrderCreateRequestModelBuilder userInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
        return this;
    }

    public OrderCreateRequestModel build() {
        OrderCreateRequestModel orderCreateRequestModel = new OrderCreateRequestModel();
        orderCreateRequestModel.setOrderParentNumber(orderParentNumber);
        orderCreateRequestModel.setOrderDate(orderDate);
        orderCreateRequestModel.setPreOrderCompletedDate(preOrderCompletedDate);
        orderCreateRequestModel.setPaymentStatus(paymentStatus);
        orderCreateRequestModel.setStorefrontId(storefrontId);
        orderCreateRequestModel.setIsTestOrder(isTestOrder);
        orderCreateRequestModel.setCurrency(currency);
        orderCreateRequestModel.setLines(lineProducts);
        orderCreateRequestModel.setCharges(charges);
        orderCreateRequestModel.setCoupons(coupons);
        orderCreateRequestModel.setCustomer(customer);
        orderCreateRequestModel.setDelivery(delivery);
        orderCreateRequestModel.setInvoiceAddress(invoiceAddress);
        orderCreateRequestModel.setShipmentAddress(shipmentAddress);
        orderCreateRequestModel.setPayment(payment);
        orderCreateRequestModel.setPrice(price);
        orderCreateRequestModel.setPromotions(promotions);
        orderCreateRequestModel.setStore(store);
        orderCreateRequestModel.setUserInformation(userInformation);
        return orderCreateRequestModel;
    }
}
