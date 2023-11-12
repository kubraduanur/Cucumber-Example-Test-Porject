package mpapi.models.orderCreateRequestModel;

public class Line {
    private ChargeDistribution chargeDistribution;
    private DiscountDistribution discountDistribution;
    private LinePrice price;
    private LineProduct product;
    private long quantity;
    private Stock stock;

    public ChargeDistribution getChargeDistribution() {
        return chargeDistribution;
    }

    public void setChargeDistribution(ChargeDistribution chargeDistribution) {
        this.chargeDistribution = chargeDistribution;
    }

    public DiscountDistribution getDiscountDistribution() {
        return discountDistribution;
    }

    public void setDiscountDistribution(DiscountDistribution discountDistribution) {
        this.discountDistribution = discountDistribution;
    }

    public LinePrice getPrice() {
        return price;
    }

    public void setPrice(LinePrice price) {
        this.price = price;
    }


    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public LineProduct getProduct() {
        return product;
    }

    public void setProduct(LineProduct product) {
        this.product = product;
    }
}
