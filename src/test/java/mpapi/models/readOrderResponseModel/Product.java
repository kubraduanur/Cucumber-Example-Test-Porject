package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private String name;
    private long productCategoryId;
    private long brandId;
    private String brandName;
    private String platformListingId;
    private long productContentId;
    private String productCategory;
    private List<String> categoryHierarchy;
    private List<String> imageUrls;
    private String sku;
    private Object sellerSku;
    private Object commission;
    private long instantDeci;
    private Object saleUnitValue;
    private Object weight;
    private String productSaleName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPlatformListingId() {
        return platformListingId;
    }

    public void setPlatformListingId(String platformListingId) {
        this.platformListingId = platformListingId;
    }

    public long getProductContentId() {
        return productContentId;
    }

    public void setProductContentId(long productContentId) {
        this.productContentId = productContentId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public List<String> getCategoryHierarchy() {
        return categoryHierarchy;
    }

    public void setCategoryHierarchy(List<String> categoryHierarchy) {
        this.categoryHierarchy = categoryHierarchy;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Object getSellerSku() {
        return sellerSku;
    }

    public void setSellerSku(Object sellerSku) {
        this.sellerSku = sellerSku;
    }

    public Object getCommission() {
        return commission;
    }

    public void setCommission(Object commission) {
        this.commission = commission;
    }

    public long getInstantDeci() {
        return instantDeci;
    }

    public void setInstantDeci(long instantDeci) {
        this.instantDeci = instantDeci;
    }

    public Object getSaleUnitValue() {
        return saleUnitValue;
    }

    public void setSaleUnitValue(Object saleUnitValue) {
        this.saleUnitValue = saleUnitValue;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    public String getProductSaleName() {
        return productSaleName;
    }

    public void setProductSaleName(String productSaleName) {
        this.productSaleName = productSaleName;
    }
}
