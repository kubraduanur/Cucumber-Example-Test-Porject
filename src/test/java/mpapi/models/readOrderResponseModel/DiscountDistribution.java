package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountDistribution {
    private List<DiscountDistributionCoupon> coupons;
    private List<DiscountDistributionPromotion> promotions;
    private long totalDiscountExceptFreeShipping;

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

    public long getTotalDiscountExceptFreeShipping() {
        return totalDiscountExceptFreeShipping;
    }

    public void setTotalDiscountExceptFreeShipping(long totalDiscountExceptFreeShipping) {
        this.totalDiscountExceptFreeShipping = totalDiscountExceptFreeShipping;
    }
}
