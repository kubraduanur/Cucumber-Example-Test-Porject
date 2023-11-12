package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Wallet;

public final class WalletBuilder {
    private double rebateGainAmount;
    private double rebateSpendAmount;

    private WalletBuilder() {
    }

    public static WalletBuilder aWallet() {
        return new WalletBuilder();
    }

    public WalletBuilder rebateGainAmount(double rebateGainAmount) {
        this.rebateGainAmount = rebateGainAmount;
        return this;
    }

    public WalletBuilder rebateSpendAmount(double rebateSpendAmount) {
        this.rebateSpendAmount = rebateSpendAmount;
        return this;
    }

    public Wallet build() {
        Wallet wallet = new Wallet();
        wallet.setRebateGainAmount(rebateGainAmount);
        wallet.setRebateSpendAmount(rebateSpendAmount);
        return wallet;
    }
}
