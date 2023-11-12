package mpapi.models.orderCreateRequestModel;

public class Amount {
    private double seller;
    private double total;
    private double ty;

    public double getSeller() {
        return seller;
    }

    public void setSeller(double seller) {
        this.seller = seller;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTy() {
        return ty;
    }

    public void setTy(double ty) {
        this.ty = ty;
    }
}
