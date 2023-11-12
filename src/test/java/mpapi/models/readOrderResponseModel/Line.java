package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Line {
    private String id;
    private LinePrice price;
    private List<Item> items;
    private Product product;
    private Stock stock;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LinePrice getPrice() {
        return price;
    }

    public void setPrice(LinePrice price) {
        this.price = price;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
