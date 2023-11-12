package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Stock;

public final class StockBuilder {
    private String id;
    private String reservationId;

    private StockBuilder() {
    }

    public static StockBuilder aStock() {
        return new StockBuilder();
    }

    public StockBuilder id(String id) {
        this.id = id;
        return this;
    }

    public StockBuilder reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    public Stock build() {
        Stock stock = new Stock();
        stock.setId(id);
        stock.setReservationId(reservationId);
        return stock;
    }
}
