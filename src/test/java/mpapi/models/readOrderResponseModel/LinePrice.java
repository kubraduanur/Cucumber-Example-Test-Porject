package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LinePrice {
    private double price;
    private double originalPrice;
    private double discountedPrice;
    private double vatBaseAmount;
    private double costOfGoods;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public double getVatBaseAmount() {
        return vatBaseAmount;
    }

    public void setVatBaseAmount(double vatBaseAmount) {
        this.vatBaseAmount = vatBaseAmount;
    }

    public double getCostOfGoods() {
        return costOfGoods;
    }

    public void setCostOfGoods(double costOfGoods) {
        this.costOfGoods = costOfGoods;
    }
}
