package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Store;

public final class StoreBuilder {
    private long id;
    private String name;
    private long sellerId;
    private String logoUrl;
    private String sellerType;
    private String eta;
    private double minimumBasketAmount;
    private String zoneId;

    private StoreBuilder() {
    }

    public static StoreBuilder aStore() {
        return new StoreBuilder();
    }

    public StoreBuilder id(long id) {
        this.id = id;
        return this;
    }

    public StoreBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StoreBuilder sellerId(long sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    public StoreBuilder logoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    public StoreBuilder sellerType(String sellerType) {
        this.sellerType = sellerType;
        return this;
    }

    public StoreBuilder eta(String eta) {
        this.eta = eta;
        return this;
    }

    public StoreBuilder minimumBasketAmount(double minimumBasketAmount) {
        this.minimumBasketAmount = minimumBasketAmount;
        return this;
    }

    public StoreBuilder zoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    public Store build() {
        Store store = new Store();
        store.setId(id);
        store.setName(name);
        store.setSellerId(sellerId);
        store.setLogoUrl(logoUrl);
        store.setSellerType(sellerType);
        store.setEta(eta);
        store.setMinimumBasketAmount(minimumBasketAmount);
        store.setZoneId(zoneId);
        return store;
    }
}
