package mpapi.models.orderCreateRequestModel;

public class Weight {
    private String typeName;
    private long defaultSaleUnitValue;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public long getDefaultSaleUnitValue() {
        return defaultSaleUnitValue;
    }

    public void setDefaultSaleUnitValue(long defaultSaleUnitValue) {
        this.defaultSaleUnitValue = defaultSaleUnitValue;
    }
}
