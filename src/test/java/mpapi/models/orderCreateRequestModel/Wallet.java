package mpapi.models.orderCreateRequestModel;

public class Wallet {

    private double rebateGainAmount;
    private double rebateSpendAmount;

    public double getRebateGainAmount() {
        return rebateGainAmount;
    }

    public void setRebateGainAmount(double rebateGainAmount) {
        this.rebateGainAmount = rebateGainAmount;
    }

    public double getRebateSpendAmount() {
        return rebateSpendAmount;
    }

    public void setRebateSpendAmount(double rebateSpendAmount) {
        this.rebateSpendAmount = rebateSpendAmount;
    }
}
