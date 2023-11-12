package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Amount;

public final class AmountBuilder {
    private double seller;
    private double total;
    private double ty;

    private AmountBuilder() {
    }

    public static AmountBuilder anAmount() {
        return new AmountBuilder();
    }

    public AmountBuilder seller(double seller) {
        this.seller = seller;
        return this;
    }

    public AmountBuilder total(double total) {
        this.total = total;
        return this;
    }

    public AmountBuilder ty(double ty) {
        this.ty = ty;
        return this;
    }

    public Amount build() {
        Amount amount = new Amount();
        amount.setSeller(seller);
        amount.setTotal(total);
        amount.setTy(ty);
        return amount;
    }
}
