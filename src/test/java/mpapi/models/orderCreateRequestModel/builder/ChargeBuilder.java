package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Charge;

public final class ChargeBuilder {
    private double amount;
    private String chargeType;
    private String currencyCode;

    private ChargeBuilder() {
    }

    public static ChargeBuilder aCharge() {
        return new ChargeBuilder();
    }

    public ChargeBuilder amount(double amount) {
        this.amount = amount;
        return this;
    }

    public ChargeBuilder chargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    public ChargeBuilder currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public Charge build() {
        Charge charge = new Charge();
        charge.setAmount(amount);
        charge.setChargeType(chargeType);
        charge.setCurrencyCode(currencyCode);
        return charge;
    }
}
