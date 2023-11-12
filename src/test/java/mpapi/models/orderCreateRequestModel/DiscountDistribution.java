package mpapi.models.orderCreateRequestModel;

import java.util.List;

public class DiscountDistribution {
    private List<DiscountDistributionCoupon> coupons;
    private List<DiscountDistributionPromotion> promotions;

    public List<DiscountDistributionCoupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<DiscountDistributionCoupon> coupons) {
        this.coupons = coupons;
    }

    public List<DiscountDistributionPromotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<DiscountDistributionPromotion> promotions) {
        this.promotions = promotions;
    }
}
