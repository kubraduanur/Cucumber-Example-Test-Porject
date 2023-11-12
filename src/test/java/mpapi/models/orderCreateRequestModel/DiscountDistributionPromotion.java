package mpapi.models.orderCreateRequestModel;

public class DiscountDistributionPromotion {
    private Amount amount;
    private long appliedQuantity;
    private String discountType;
    private long promotionId;
    private double sellerCoverageRatio;
    private boolean sellerPaid;
    private long legacyPromotionId;

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public long getAppliedQuantity() {
        return appliedQuantity;
    }

    public void setAppliedQuantity(long appliedQuantity) {
        this.appliedQuantity = appliedQuantity;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(long promotionId) {
        this.promotionId = promotionId;
    }

    public double getSellerCoverageRatio() {
        return sellerCoverageRatio;
    }

    public void setSellerCoverageRatio(double sellerCoverageRatio) {
        this.sellerCoverageRatio = sellerCoverageRatio;
    }

    public boolean isSellerPaid() {
        return sellerPaid;
    }

    public void setSellerPaid(boolean sellerPaid) {
        this.sellerPaid = sellerPaid;
    }

    public long getLegacyPromotionId() {
        return legacyPromotionId;
    }

    public void setLegacyPromotionId(long legacyPromotionId) {
        this.legacyPromotionId = legacyPromotionId;
    }
}
