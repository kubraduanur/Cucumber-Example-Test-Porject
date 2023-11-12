package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Amount;
import mpapi.models.orderCreateRequestModel.DiscountDistributionPromotion;

public final class DiscountDistributionPromotionBuilder {
    private Amount amount;
    private long appliedQuantity;
    private String discountType;
    private long promotionId;
    private double sellerCoverageRatio;
    private boolean sellerPaid;
    private long legacyPromotionId;

    private DiscountDistributionPromotionBuilder() {
    }

    public static DiscountDistributionPromotionBuilder aDiscountDistributionPromotion() {
        return new DiscountDistributionPromotionBuilder();
    }

    public DiscountDistributionPromotionBuilder amount(Amount amount) {
        this.amount = amount;
        return this;
    }

    public DiscountDistributionPromotionBuilder appliedQuantity(long appliedQuantity) {
        this.appliedQuantity = appliedQuantity;
        return this;
    }

    public DiscountDistributionPromotionBuilder discountType(String discountType) {
        this.discountType = discountType;
        return this;
    }

    public DiscountDistributionPromotionBuilder promotionId(long promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    public DiscountDistributionPromotionBuilder sellerCoverageRatio(double sellerCoverageRatio) {
        this.sellerCoverageRatio = sellerCoverageRatio;
        return this;
    }

    public DiscountDistributionPromotionBuilder sellerPaid(boolean sellerPaid) {
        this.sellerPaid = sellerPaid;
        return this;
    }

    public DiscountDistributionPromotionBuilder legacyPromotionId(long legacyPromotionId) {
        this.legacyPromotionId = legacyPromotionId;
        return this;
    }

    public DiscountDistributionPromotion build() {
        DiscountDistributionPromotion discountDistributionPromotion = new DiscountDistributionPromotion();
        discountDistributionPromotion.setAmount(amount);
        discountDistributionPromotion.setAppliedQuantity(appliedQuantity);
        discountDistributionPromotion.setDiscountType(discountType);
        discountDistributionPromotion.setPromotionId(promotionId);
        discountDistributionPromotion.setSellerCoverageRatio(sellerCoverageRatio);
        discountDistributionPromotion.setSellerPaid(sellerPaid);
        discountDistributionPromotion.setLegacyPromotionId(legacyPromotionId);
        return discountDistributionPromotion;
    }
}
