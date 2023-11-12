package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Cargo;
import mpapi.models.orderCreateRequestModel.ChargeDistribution;

public final class ChargeDistributionBuilder {
    private Cargo cargo;
    private Cargo installment;

    private ChargeDistributionBuilder() {
    }

    public static ChargeDistributionBuilder aChargeDistribution() {
        return new ChargeDistributionBuilder();
    }

    public ChargeDistributionBuilder cargo(Cargo cargo) {
        this.cargo = cargo;
        return this;
    }

    public ChargeDistributionBuilder installment(Cargo installment) {
        this.installment = installment;
        return this;
    }

    public ChargeDistribution build() {
        ChargeDistribution chargeDistribution = new ChargeDistribution();
        chargeDistribution.setCargo(cargo);
        chargeDistribution.setInstallment(installment);
        return chargeDistribution;
    }
}
