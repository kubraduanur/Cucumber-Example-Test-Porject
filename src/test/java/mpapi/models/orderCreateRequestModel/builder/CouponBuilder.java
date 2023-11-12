package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Coupon;

public final class CouponBuilder {
    private String id;
    private double appliedAmount;
    private String description;
    private String supplierId;
    private String supplierType;

    private CouponBuilder() {
    }

    public static CouponBuilder aCoupon() {
        return new CouponBuilder();
    }

    public CouponBuilder id(String id) {
        this.id = id;
        return this;
    }

    public CouponBuilder appliedAmount(double appliedAmount) {
        this.appliedAmount = appliedAmount;
        return this;
    }

    public CouponBuilder description(String description) {
        this.description = description;
        return this;
    }

    public CouponBuilder supplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public CouponBuilder supplierType(String supplierType) {
        this.supplierType = supplierType;
        return this;
    }

    public Coupon build() {
        Coupon coupon = new Coupon();
        coupon.setId(id);
        coupon.setAppliedAmount(appliedAmount);
        coupon.setDescription(description);
        coupon.setSupplierId(supplierId);
        coupon.setSupplierType(supplierType);
        return coupon;
    }
}
