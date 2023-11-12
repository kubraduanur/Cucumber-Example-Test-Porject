package mpapi.models.orderCreateRequestModel;

public class Delivery {
    private String model;
    private long estimatedDeliveryStartDate;
    private long estimatedDeliveryEndDate;
    private String scheduleType;
    private String timeSlotId;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getEstimatedDeliveryStartDate() {
        return estimatedDeliveryStartDate;
    }

    public void setEstimatedDeliveryStartDate(long estimatedDeliveryStartDate) {
        this.estimatedDeliveryStartDate = estimatedDeliveryStartDate;
    }

    public long getEstimatedDeliveryEndDate() {
        return estimatedDeliveryEndDate;
    }

    public void setEstimatedDeliveryEndDate(long estimatedDeliveryEndDate) {
        this.estimatedDeliveryEndDate = estimatedDeliveryEndDate;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }
}
