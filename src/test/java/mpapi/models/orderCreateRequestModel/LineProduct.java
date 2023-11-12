package mpapi.models.orderCreateRequestModel;

import java.util.List;

public class LineProduct {
    private String name;
    private long productContentId;
    private String platformListingId;
    private String sku;
    private List<String> imageUrls;
    private String productCategory;
    private long productCategoryId;
    private List<String> categoryHierarchy;
    private long brandId;
    private long commission;
    private String brandName;
    private long instantDeci;
    private double saleUnitValue;
    private Weight weight;
    private String productSaleName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProductContentId() {
        return productContentId;
    }

    public void setProductContentId(long productContentId) {
        this.productContentId = productContentId;
    }

    public String getPlatformListingId() {
        return platformListingId;
    }

    public void setPlatformListingId(String platformListingId) {
        this.platformListingId = platformListingId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public List<String> getCategoryHierarchy() {
        return categoryHierarchy;
    }

    public void setCategoryHierarchy(List<String> categoryHierarchy) {
        this.categoryHierarchy = categoryHierarchy;
    }

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    public long getCommission() {
        return commission;
    }

    public void setCommission(long commission) {
        this.commission = commission;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public long getInstantDeci() {
        return instantDeci;
    }

    public void setInstantDeci(long instantDeci) {
        this.instantDeci = instantDeci;
    }

    public double getSaleUnitValue() {
        return saleUnitValue;
    }

    public void setSaleUnitValue(double saleUnitValue) {
        this.saleUnitValue = saleUnitValue;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public String getProductSaleName() {
        return productSaleName;
    }

    public void setProductSaleName(String productSaleName) {
        this.productSaleName = productSaleName;
    }
}
