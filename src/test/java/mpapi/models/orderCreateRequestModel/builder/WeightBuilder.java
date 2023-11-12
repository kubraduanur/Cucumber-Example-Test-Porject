package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Weight;

public final class WeightBuilder {
    private String typeName;
    private long defaultSaleUnitValue;

    private WeightBuilder() {
    }

    public static WeightBuilder aWeight() {
        return new WeightBuilder();
    }

    public WeightBuilder typeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public WeightBuilder defaultSaleUnitValue(long defaultSaleUnitValue) {
        this.defaultSaleUnitValue = defaultSaleUnitValue;
        return this;
    }

    public Weight build() {
        Weight weight = new Weight();
        weight.setTypeName(typeName);
        weight.setDefaultSaleUnitValue(defaultSaleUnitValue);
        return weight;
    }
}
