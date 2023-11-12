package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReadOrderResponseModelPromotion {
    private long id;
    private String displayName;
    private double appliedAmount;
    private String supplierType;

    private long tagId;

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public double getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(double appliedAmount) {
        this.appliedAmount = appliedAmount;
    }
}
