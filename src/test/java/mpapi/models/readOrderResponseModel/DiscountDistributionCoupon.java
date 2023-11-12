package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountDistributionCoupon {
    private String couponId;
    private double sellerCoverageRatio;
    private Amount amount;
    private boolean sellerPaid;

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

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public boolean isSellerPaid() {
        return sellerPaid;
    }

    public void setSellerPaid(boolean sellerPaid) {
        this.sellerPaid = sellerPaid;
    }
}
