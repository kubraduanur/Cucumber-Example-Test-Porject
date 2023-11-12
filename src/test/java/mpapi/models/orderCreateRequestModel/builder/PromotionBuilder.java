package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Promotion;

public final class PromotionBuilder {
    private long id;
    private double appliedAmount;
    private String displayName;
    private String supplierType;
    private long tagId;

    private PromotionBuilder() {
    }

    public static PromotionBuilder aPromotion() {
        return new PromotionBuilder();
    }

    public PromotionBuilder id(long id) {
        this.id = id;
        return this;
    }

    public PromotionBuilder appliedAmount(double appliedAmount) {
        this.appliedAmount = appliedAmount;
        return this;
    }

    public PromotionBuilder displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public PromotionBuilder supplierType(String supplierType) {
        this.supplierType = supplierType;
        return this;
    }

    public PromotionBuilder tagId(long tagId) {
        this.tagId = tagId;
        return this;
    }

    public Promotion build() {
        Promotion promotion = new Promotion();
        promotion.setId(id);
        promotion.setAppliedAmount(appliedAmount);
        promotion.setDisplayName(displayName);
        promotion.setSupplierType(supplierType);
        promotion.setTagId(tagId);
        return promotion;
    }
}
