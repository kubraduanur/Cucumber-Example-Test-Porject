package mpapi.models.orderCreateRequestModel;

public class LinePrice {
    private double costOfGoods;
    private double discountedPrice;
    private double originalPrice;
    private double price;
    private double vatBaseAmount;

    public double getCostOfGoods() {
        return costOfGoods;
    }

    public void setCostOfGoods(double costOfGoods) {
        this.costOfGoods = costOfGoods;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVatBaseAmount() {
        return vatBaseAmount;
    }

    public void setVatBaseAmount(double vatBaseAmount) {
        this.vatBaseAmount = vatBaseAmount;
    }
}
