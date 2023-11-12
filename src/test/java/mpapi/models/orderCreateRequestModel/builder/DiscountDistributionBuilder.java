package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.DiscountDistribution;
import mpapi.models.orderCreateRequestModel.DiscountDistributionCoupon;
import mpapi.models.orderCreateRequestModel.DiscountDistributionPromotion;

import java.util.List;

public final class DiscountDistributionBuilder {
    private List<DiscountDistributionCoupon> coupons;
    private List<DiscountDistributionPromotion> promotions;

    private DiscountDistributionBuilder() {
    }

    public static DiscountDistributionBuilder aDiscountDistribution() {
        return new DiscountDistributionBuilder();
    }

    public DiscountDistributionBuilder coupons(List<DiscountDistributionCoupon> coupons) {
        this.coupons = coupons;
        return this;
    }

    public DiscountDistributionBuilder promotions(List<DiscountDistributionPromotion> promotions) {
        this.promotions = promotions;
        return this;
    }

    public DiscountDistribution build() {
        DiscountDistribution discountDistribution = new DiscountDistribution();
        discountDistribution.setCoupons(coupons);
        discountDistribution.setPromotions(promotions);
        return discountDistribution;
    }
}
