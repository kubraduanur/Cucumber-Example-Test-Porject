package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Cargo;

public final class CargoBuilder {
    private double amount;

    private CargoBuilder() {
    }

    public static CargoBuilder aCargo() {
        return new CargoBuilder();
    }

    public CargoBuilder amount(double amount) {
        this.amount = amount;
        return this;
    }

    public Cargo build() {
        Cargo cargo = new Cargo();
        cargo.setAmount(amount);
        return cargo;
    }
}
