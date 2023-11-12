package mpapi.models.orderCreateRequestModel;

public class Coupon {
    private String id;
    private double appliedAmount;
    private String description;
    private String supplierId;
    private String supplierType;

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(double appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
