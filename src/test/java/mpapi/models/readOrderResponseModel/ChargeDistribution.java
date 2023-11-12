package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChargeDistribution {
    private Cargo cargo;
    private Cargo installment;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Cargo getInstallment() {
        return installment;
    }

    public void setInstallment(Cargo installment) {
        this.installment = installment;
    }
}
