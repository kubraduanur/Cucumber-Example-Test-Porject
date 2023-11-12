package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountDistributionPromotion {
    private long promotionId;
    private long legacyPromotionId;
    private String discountType;
    private double sellerCoverageRatio;
    private Amount amount;
    private boolean sellerPaid;

    public long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(long promotionId) {
        this.promotionId = promotionId;
    }

    public long getLegacyPromotionId() {
        return legacyPromotionId;
    }

    public void setLegacyPromotionId(long legacyPromotionId) {
        this.legacyPromotionId = legacyPromotionId;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public double getSellerCoverageRatio() {
        return sellerCoverageRatio;
    }

    public void setSellerCoverageRatio(double sellerCoverageRatio) {
        this.sellerCoverageRatio = sellerCoverageRatio;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public boolean isSellerPaid() {
        return sellerPaid;
    }

    public void setSellerPaid(boolean sellerPaid) {
        this.sellerPaid = sellerPaid;
    }
}
