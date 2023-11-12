package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Store {
    private long id;
    private String name;
    private String logoUrl;
    private double minimumBasketAmount;
    private long sellerId;
    private String eta;
    private String sellerType;
    private String zoneId;
    private Object sellerSubType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public double getMinimumBasketAmount() {
        return minimumBasketAmount;
    }

    public void setMinimumBasketAmount(double minimumBasketAmount) {
        this.minimumBasketAmount = minimumBasketAmount;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Object getSellerSubType() {
        return sellerSubType;
    }

    public void setSellerSubType(Object sellerSubType) {
        this.sellerSubType = sellerSubType;
    }
}
