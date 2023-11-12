package mpapi.models.orderCreateRequestModel;

public class Promotion {
    private long id;
    private double appliedAmount;
    private String displayName;
    private String supplierType;

    private long  tagId;

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

    public double getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(double appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
