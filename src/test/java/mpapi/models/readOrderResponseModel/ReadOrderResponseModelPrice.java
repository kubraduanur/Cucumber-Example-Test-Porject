package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReadOrderResponseModelPrice {
    private double total;
    private double totalProduct;
    private double totalCargo;
    private double totalCoupon;
    private double totalPromotion;
    private double invoiceAmount;
    private double sellerInvoiceAmount;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(double totalProduct) {
        this.totalProduct = totalProduct;
    }

    public double getTotalCargo() {
        return totalCargo;
    }

    public void setTotalCargo(double totalCargo) {
        this.totalCargo = totalCargo;
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

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public double getSellerInvoiceAmount() {
        return sellerInvoiceAmount;
    }

    public void setSellerInvoiceAmount(double sellerInvoiceAmount) {
        this.sellerInvoiceAmount = sellerInvoiceAmount;
    }
}
