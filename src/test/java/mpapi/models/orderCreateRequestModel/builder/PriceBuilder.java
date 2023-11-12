package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Price;

public final class PriceBuilder {
    private double invoiceAmount;
    private double total;
    private double totalCargo;
    private double totalProduct;
    private double totalCoupon;
    private double totalPromotion;

    private PriceBuilder() {
    }

    public static PriceBuilder aPrice() {
        return new PriceBuilder();
    }

    public PriceBuilder invoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
        return this;
    }

    public PriceBuilder total(double total) {
        this.total = total;
        return this;
    }

    public PriceBuilder totalCargo(double totalCargo) {
        this.totalCargo = totalCargo;
        return this;
    }

    public PriceBuilder totalProduct(double totalProduct) {
        this.totalProduct = totalProduct;
        return this;
    }

    public PriceBuilder totalCoupon(double totalCoupon) {
        this.totalCoupon = totalCoupon;
        return this;
    }

    public PriceBuilder totalPromotion(double totalPromotion) {
        this.totalPromotion = totalPromotion;
        return this;
    }

    public Price build() {
        Price price = new Price();
        price.setInvoiceAmount(invoiceAmount);
        price.setTotal(total);
        price.setTotalCargo(totalCargo);
        price.setTotalProduct(totalProduct);
        price.setTotalCoupon(totalCoupon);
        price.setTotalPromotion(totalPromotion);
        return price;
    }
}
