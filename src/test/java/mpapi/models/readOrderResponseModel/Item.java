package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    private String id;
    private Object refundInfo;
    private DiscountDistribution discountDistribution;
    private ChargeDistribution chargeDistribution;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getRefundInfo() {
        return refundInfo;
    }

    public void setRefundInfo(Object refundInfo) {
        this.refundInfo = refundInfo;
    }

    public DiscountDistribution getDiscountDistribution() {
        return discountDistribution;
    }

    public void setDiscountDistribution(DiscountDistribution discountDistribution) {
        this.discountDistribution = discountDistribution;
    }

    public ChargeDistribution getChargeDistribution() {
        return chargeDistribution;
    }

    public void setChargeDistribution(ChargeDistribution chargeDistribution) {
        this.chargeDistribution = chargeDistribution;
    }
}
