package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Delivery;

public final class DeliveryBuilder {
    private String model;
    private long estimatedDeliveryStartDate;
    private long estimatedDeliveryEndDate;
    private String scheduleType;
    private String timeSlotId;

    private DeliveryBuilder() {
    }

    public static DeliveryBuilder aDelivery() {
        return new DeliveryBuilder();
    }

    public DeliveryBuilder model(String model) {
        this.model = model;
        return this;
    }

    public DeliveryBuilder estimatedDeliveryStartDate(long estimatedDeliveryStartDate) {
        this.estimatedDeliveryStartDate = estimatedDeliveryStartDate;
        return this;
    }

    public DeliveryBuilder estimatedDeliveryEndDate(long estimatedDeliveryEndDate) {
        this.estimatedDeliveryEndDate = estimatedDeliveryEndDate;
        return this;
    }

    public DeliveryBuilder scheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    public DeliveryBuilder timeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
        return this;
    }

    public Delivery build() {
        Delivery delivery = new Delivery();
        delivery.setModel(model);
        delivery.setEstimatedDeliveryStartDate(estimatedDeliveryStartDate);
        delivery.setEstimatedDeliveryEndDate(estimatedDeliveryEndDate);
        delivery.setScheduleType(scheduleType);
        delivery.setTimeSlotId(timeSlotId);
        return delivery;
    }
}
