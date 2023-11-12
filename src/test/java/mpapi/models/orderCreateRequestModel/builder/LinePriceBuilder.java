package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.LinePrice;

public final class LinePriceBuilder {
    private double costOfGoods;
    private double discountedPrice;
    private double originalPrice;
    private double price;
    private double vatBaseAmount;

    private LinePriceBuilder() {
    }

    public static LinePriceBuilder aLinePrice() {
        return new LinePriceBuilder();
    }

    public LinePriceBuilder costOfGoods(double costOfGoods) {
        this.costOfGoods = costOfGoods;
        return this;
    }

    public LinePriceBuilder discountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    public LinePriceBuilder originalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    public LinePriceBuilder price(double price) {
        this.price = price;
        return this;
    }

    public LinePriceBuilder vatBaseAmount(double vatBaseAmount) {
        this.vatBaseAmount = vatBaseAmount;
        return this;
    }

    public LinePrice build() {
        LinePrice linePrice = new LinePrice();
        linePrice.setCostOfGoods(costOfGoods);
        linePrice.setDiscountedPrice(discountedPrice);
        linePrice.setOriginalPrice(originalPrice);
        linePrice.setPrice(price);
        linePrice.setVatBaseAmount(vatBaseAmount);
        return linePrice;
    }
}
