package mpapi.models.orderCreateRequestModel;

public class Store {
    private long id;
    private String name;
    private long sellerId;
    private String logoUrl;
    private String sellerType;
    private String eta;
    private double minimumBasketAmount;
    private String zoneId;

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

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public double getMinimumBasketAmount() {
        return minimumBasketAmount;
    }

    public void setMinimumBasketAmount(double minimumBasketAmount) {
        this.minimumBasketAmount = minimumBasketAmount;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}
