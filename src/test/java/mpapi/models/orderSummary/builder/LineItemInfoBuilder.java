package mpapi.models.orderSummary.builder;

import mpapi.models.orderSummary.LineItemInfo;

public final class LineItemInfoBuilder {
    private String status;
    private long shipmentNumber;
    private long sellerId;
    private String shipmentId;
    private String shipmentPackageItemId;
    private String orderNumber;
    private String orderId;
    private long createdDate;
    private double price;
    private double sellerPromotionPrice;
    private double sellerCouponPrice;
    private String orderLineItemId;
    private double commission;
    private double sellerPromotionCommission;
    private double sellerCouponCommission;
    private long paymentTerm;
    private double commissionRate;
    private double sellerRevenue;
    private double sellerPromotionSellerRevenue;
    private double sellerCouponSellerRevenue;
    private String sellerName;
    private String productName;
    private String barcode;
    private String firstName;
    private String lastName;
    private String currentAccountName;
    private String originId;
    private String sellerPromotionName;
    private String sellerCouponName;
    private long reasonCode;
    private String reasonName;
    private double manuelRefundPrice;
    private double manuelRefundCommission;
    private double manuelRefundSellerRevenue;
    private String omsStatus;
    private String listingId;
    private String claimId;
    private String claimItemId;
    private long deliveryDate;
    private long paymentDate;
    private long effectiveDate;
    private long returnPaymentDate;
    private long manuelRefundPaymentDate;
    private long manuelRefundCancelPaymentDate;
    private double sellerPromotionPriceEqualsTagId22;

    private LineItemInfoBuilder() {
    }

    public static LineItemInfoBuilder aLineItemInfo() {
        return new LineItemInfoBuilder();
    }

    public LineItemInfoBuilder status(String status) {
        this.status = status;
        return this;
    }

    public LineItemInfoBuilder shipmentNumber(long shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
        return this;
    }

    public LineItemInfoBuilder sellerId(long sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    public LineItemInfoBuilder shipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    public LineItemInfoBuilder shipmentPackageItemId(String shipmentPackageItemId) {
        this.shipmentPackageItemId = shipmentPackageItemId;
        return this;
    }

    public LineItemInfoBuilder orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public LineItemInfoBuilder orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public LineItemInfoBuilder createdDate(long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LineItemInfoBuilder price(double price) {
        this.price = price;
        return this;
    }

    public LineItemInfoBuilder sellerPromotionPrice(double sellerPromotionPrice) {
        this.sellerPromotionPrice = sellerPromotionPrice;
        return this;
    }

    public LineItemInfoBuilder sellerCouponPrice(double sellerCouponPrice) {
        this.sellerCouponPrice = sellerCouponPrice;
        return this;
    }

    public LineItemInfoBuilder orderLineItemId(String orderLineItemId) {
        this.orderLineItemId = orderLineItemId;
        return this;
    }

    public LineItemInfoBuilder commission(double commission) {
        this.commission = commission;
        return this;
    }

    public LineItemInfoBuilder sellerPromotionCommission(double sellerPromotionCommission) {
        this.sellerPromotionCommission = sellerPromotionCommission;
        return this;
    }

    public LineItemInfoBuilder sellerCouponCommission(double sellerCouponCommission) {
        this.sellerCouponCommission = sellerCouponCommission;
        return this;
    }

    public LineItemInfoBuilder paymentTerm(long paymentTerm) {
        this.paymentTerm = paymentTerm;
        return this;
    }

    public LineItemInfoBuilder commissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
        return this;
    }

    public LineItemInfoBuilder sellerRevenue(double sellerRevenue) {
        this.sellerRevenue = sellerRevenue;
        return this;
    }

    public LineItemInfoBuilder sellerPromotionSellerRevenue(double sellerPromotionSellerRevenue) {
        this.sellerPromotionSellerRevenue = sellerPromotionSellerRevenue;
        return this;
    }

    public LineItemInfoBuilder sellerCouponSellerRevenue(double sellerCouponSellerRevenue) {
        this.sellerCouponSellerRevenue = sellerCouponSellerRevenue;
        return this;
    }

    public LineItemInfoBuilder sellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    public LineItemInfoBuilder productName(String productName) {
        this.productName = productName;
        return this;
    }

    public LineItemInfoBuilder barcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public LineItemInfoBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public LineItemInfoBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LineItemInfoBuilder currentAccountName(String currentAccountName) {
        this.currentAccountName = currentAccountName;
        return this;
    }

    public LineItemInfoBuilder originId(String originId) {
        this.originId = originId;
        return this;
    }

    public LineItemInfoBuilder sellerPromotionName(String sellerPromotionName) {
        this.sellerPromotionName = sellerPromotionName;
        return this;
    }

    public LineItemInfoBuilder sellerCouponName(String sellerCouponName) {
        this.sellerCouponName = sellerCouponName;
        return this;
    }

    public LineItemInfoBuilder reasonCode(long reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    public LineItemInfoBuilder reasonName(String reasonName) {
        this.reasonName = reasonName;
        return this;
    }

    public LineItemInfoBuilder manuelRefundPrice(double manuelRefundPrice) {
        this.manuelRefundPrice = manuelRefundPrice;
        return this;
    }

    public LineItemInfoBuilder manuelRefundCommission(double manuelRefundCommission) {
        this.manuelRefundCommission = manuelRefundCommission;
        return this;
    }

    public LineItemInfoBuilder manuelRefundSellerRevenue(double manuelRefundSellerRevenue) {
        this.manuelRefundSellerRevenue = manuelRefundSellerRevenue;
        return this;
    }

    public LineItemInfoBuilder omsStatus(String omsStatus) {
        this.omsStatus = omsStatus;
        return this;
    }

    public LineItemInfoBuilder listingId(String listingId) {
        this.listingId = listingId;
        return this;
    }

    public LineItemInfoBuilder claimId(String claimId) {
        this.claimId = claimId;
        return this;
    }

    public LineItemInfoBuilder claimItemId(String claimItemId) {
        this.claimItemId = claimItemId;
        return this;
    }

    public LineItemInfoBuilder deliveryDate(long deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }

    public LineItemInfoBuilder paymentDate(long paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public LineItemInfoBuilder effectiveDate(long effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public LineItemInfoBuilder returnPaymentDate(long returnPaymentDate) {
        this.returnPaymentDate = returnPaymentDate;
        return this;
    }

    public LineItemInfoBuilder manuelRefundPaymentDate(long manuelRefundPaymentDate) {
        this.manuelRefundPaymentDate = manuelRefundPaymentDate;
        return this;
    }

    public LineItemInfoBuilder manuelRefundCancelPaymentDate(long manuelRefundCancelPaymentDate) {
        this.manuelRefundCancelPaymentDate = manuelRefundCancelPaymentDate;
        return this;
    }

    public LineItemInfoBuilder sellerPromotionPriceEqualsTagId22(double sellerPromotionPriceEqualsTagId22) {
        this.sellerPromotionPriceEqualsTagId22 = sellerPromotionPriceEqualsTagId22;
        return this;
    }

    public LineItemInfo build() {
        LineItemInfo lineItemInfo = new LineItemInfo();
        lineItemInfo.setStatus(status);
        lineItemInfo.setShipmentNumber(shipmentNumber);
        lineItemInfo.setSellerId(sellerId);
        lineItemInfo.setShipmentId(shipmentId);
        lineItemInfo.setShipmentPackageItemId(shipmentPackageItemId);
        lineItemInfo.setOrderNumber(orderNumber);
        lineItemInfo.setOrderId(orderId);
        lineItemInfo.setCreatedDate(createdDate);
        lineItemInfo.setPrice(price);
        lineItemInfo.setSellerPromotionPrice(sellerPromotionPrice);
        lineItemInfo.setSellerCouponPrice(sellerCouponPrice);
        lineItemInfo.setOrderLineItemId(orderLineItemId);
        lineItemInfo.setCommission(commission);
        lineItemInfo.setSellerPromotionCommission(sellerPromotionCommission);
        lineItemInfo.setSellerCouponCommission(sellerCouponCommission);
        lineItemInfo.setPaymentTerm(paymentTerm);
        lineItemInfo.setCommissionRate(commissionRate);
        lineItemInfo.setSellerRevenue(sellerRevenue);
        lineItemInfo.setSellerPromotionSellerRevenue(sellerPromotionSellerRevenue);
        lineItemInfo.setSellerCouponSellerRevenue(sellerCouponSellerRevenue);
        lineItemInfo.setSellerName(sellerName);
        lineItemInfo.setProductName(productName);
        lineItemInfo.setBarcode(barcode);
        lineItemInfo.setFirstName(firstName);
        lineItemInfo.setLastName(lastName);
        lineItemInfo.setCurrentAccountName(currentAccountName);
        lineItemInfo.setOriginId(originId);
        lineItemInfo.setSellerPromotionName(sellerPromotionName);
        lineItemInfo.setSellerCouponName(sellerCouponName);
        lineItemInfo.setReasonCode(reasonCode);
        lineItemInfo.setReasonName(reasonName);
        lineItemInfo.setManuelRefundPrice(manuelRefundPrice);
        lineItemInfo.setManuelRefundCommission(manuelRefundCommission);
        lineItemInfo.setManuelRefundSellerRevenue(manuelRefundSellerRevenue);
        lineItemInfo.setOmsStatus(omsStatus);
        lineItemInfo.setListingId(listingId);
        lineItemInfo.setClaimId(claimId);
        lineItemInfo.setClaimItemId(claimItemId);
        lineItemInfo.setDeliveryDate(deliveryDate);
        lineItemInfo.setPaymentDate(paymentDate);
        lineItemInfo.setEffectiveDate(effectiveDate);
        lineItemInfo.setReturnPaymentDate(returnPaymentDate);
        lineItemInfo.setManuelRefundPaymentDate(manuelRefundPaymentDate);
        lineItemInfo.setManuelRefundCancelPaymentDate(manuelRefundCancelPaymentDate);
        lineItemInfo.setSellerPromotionPriceEqualsTagId22(sellerPromotionPriceEqualsTagId22);
        return lineItemInfo;
    }
}
