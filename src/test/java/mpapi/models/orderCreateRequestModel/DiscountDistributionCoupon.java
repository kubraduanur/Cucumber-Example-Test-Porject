package mpapi.models.orderCreateRequestModel;

public class DiscountDistributionCoupon {
    private Amount amount;
    private String couponId;
    private double sellerCoverageRatio;
    private boolean sellerPaid;

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public double getSellerCoverageRatio() {
        return sellerCoverageRatio;
    }

    public void setSellerCoverageRatio(double sellerCoverageRatio) {
        this.sellerCoverageRatio = sellerCoverageRatio;
    }

    public boolean isSellerPaid() {
        return sellerPaid;
    }

    public void setSellerPaid(boolean sellerPaid) {
        this.sellerPaid = sellerPaid;
    }
}
