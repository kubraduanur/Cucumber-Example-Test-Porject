package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.*;

public final class LineBuilder {
    private ChargeDistribution chargeDistribution;
    private DiscountDistribution discountDistribution;
    private LinePrice price;
    private LineProduct product;
    private long quantity;
    private Stock stock;

    private LineBuilder() {
    }

    public static LineBuilder aLine() {
        return new LineBuilder();
    }

    public LineBuilder chargeDistribution(ChargeDistribution chargeDistribution) {
        this.chargeDistribution = chargeDistribution;
        return this;
    }

    public LineBuilder discountDistribution(DiscountDistribution discountDistribution) {
        this.discountDistribution = discountDistribution;
        return this;
    }

    public LineBuilder price(LinePrice price) {
        this.price = price;
        return this;
    }

    public LineBuilder product(LineProduct product) {
        this.product = product;
        return this;
    }

    public LineBuilder quantity(long quantity) {
        this.quantity = quantity;
        return this;
    }

    public LineBuilder stock(Stock stock) {
        this.stock = stock;
        return this;
    }

    public Line build() {
        Line line = new Line();
        line.setChargeDistribution(chargeDistribution);
        line.setDiscountDistribution(discountDistribution);
        line.setPrice(price);
        line.setProduct(product);
        line.setQuantity(quantity);
        line.setStock(stock);
        return line;
    }
}
