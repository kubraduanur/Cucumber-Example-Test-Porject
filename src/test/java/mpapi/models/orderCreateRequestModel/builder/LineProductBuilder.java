package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.LineProduct;
import mpapi.models.orderCreateRequestModel.Weight;

import java.util.List;

public final class LineProductBuilder {
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

    private LineProductBuilder() {
    }

    public static LineProductBuilder aLineProduct() {
        return new LineProductBuilder();
    }

    public LineProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    public LineProductBuilder productContentId(long productContentId) {
        this.productContentId = productContentId;
        return this;
    }

    public LineProductBuilder platformListingId(String platformListingId) {
        this.platformListingId = platformListingId;
        return this;
    }

    public LineProductBuilder sku(String sku) {
        this.sku = sku;
        return this;
    }

    public LineProductBuilder imageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }

    public LineProductBuilder productCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public LineProductBuilder productCategoryId(long productCategoryId) {
        this.productCategoryId = productCategoryId;
        return this;
    }

    public LineProductBuilder categoryHierarchy(List<String> categoryHierarchy) {
        this.categoryHierarchy = categoryHierarchy;
        return this;
    }

    public LineProductBuilder brandId(long brandId) {
        this.brandId = brandId;
        return this;
    }

    public LineProductBuilder commission(long commission) {
        this.commission = commission;
        return this;
    }

    public LineProductBuilder brandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public LineProductBuilder instantDeci(long instantDeci) {
        this.instantDeci = instantDeci;
        return this;
    }

    public LineProductBuilder saleUnitValue(double saleUnitValue) {
        this.saleUnitValue = saleUnitValue;
        return this;
    }

    public LineProductBuilder weight(Weight weight) {
        this.weight = weight;
        return this;
    }

    public LineProductBuilder productSaleName(String productSaleName) {
        this.productSaleName = productSaleName;
        return this;
    }

    public LineProduct build() {
        LineProduct lineProduct = new LineProduct();
        lineProduct.setName(name);
        lineProduct.setProductContentId(productContentId);
        lineProduct.setPlatformListingId(platformListingId);
        lineProduct.setSku(sku);
        lineProduct.setImageUrls(imageUrls);
        lineProduct.setProductCategory(productCategory);
        lineProduct.setProductCategoryId(productCategoryId);
        lineProduct.setCategoryHierarchy(categoryHierarchy);
        lineProduct.setBrandId(brandId);
        lineProduct.setCommission(commission);
        lineProduct.setBrandName(brandName);
        lineProduct.setInstantDeci(instantDeci);
        lineProduct.setSaleUnitValue(saleUnitValue);
        lineProduct.setWeight(weight);
        lineProduct.setProductSaleName(productSaleName);
        return lineProduct;
    }
}
