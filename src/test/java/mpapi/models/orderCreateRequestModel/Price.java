package mpapi.models.orderCreateRequestModel;

public class Price {
    private double invoiceAmount;
    private double total;
    private double totalCargo;
    private double totalProduct;
    private double totalCoupon;
    private double totalPromotion;

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalCargo() {
        return totalCargo;
    }

    public void setTotalCargo(double totalCargo) {
        this.totalCargo = totalCargo;
    }

    public double getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(double totalProduct) {
        this.totalProduct = totalProduct;
    }

    public double getTotalCoupon() {
        return totalCoupon;
    }

    public void setTotalCoupon(double totalCoupon) {
        this.totalCoupon = totalCoupon;
    }

    public double getTotalPromotion() {
        return totalPromotion;
    }

    public void setTotalPromotion(double totalPromotion) {
        this.totalPromotion = totalPromotion;
    }
}
