package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Amount;
import mpapi.models.orderCreateRequestModel.DiscountDistributionCoupon;

public final class DiscountDistributionCouponBuilder {
    private Amount amount;
    private String couponId;
    private double sellerCoverageRatio;
    private boolean sellerPaid;

    private DiscountDistributionCouponBuilder() {
    }

    public static DiscountDistributionCouponBuilder aDiscountDistributionCoupon() {
        return new DiscountDistributionCouponBuilder();
    }

    public DiscountDistributionCouponBuilder amount(Amount amount) {
        this.amount = amount;
        return this;
    }

    public DiscountDistributionCouponBuilder couponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    public DiscountDistributionCouponBuilder sellerCoverageRatio(double sellerCoverageRatio) {
        this.sellerCoverageRatio = sellerCoverageRatio;
        return this;
    }

    public DiscountDistributionCouponBuilder sellerPaid(boolean sellerPaid) {
        this.sellerPaid = sellerPaid;
        return this;
    }

    public DiscountDistributionCoupon build() {
        DiscountDistributionCoupon discountDistributionCoupon = new DiscountDistributionCoupon();
        discountDistributionCoupon.setAmount(amount);
        discountDistributionCoupon.setCouponId(couponId);
        discountDistributionCoupon.setSellerCoverageRatio(sellerCoverageRatio);
        discountDistributionCoupon.setSellerPaid(sellerPaid);
        return discountDistributionCoupon;
    }
}
