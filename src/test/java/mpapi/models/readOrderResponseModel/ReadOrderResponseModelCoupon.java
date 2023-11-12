package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReadOrderResponseModelCoupon {
    private String id;
    private String description;
    private double appliedAmount;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(double appliedAmount) {
        this.appliedAmount = appliedAmount;
    }
}
