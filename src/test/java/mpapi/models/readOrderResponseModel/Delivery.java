package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Delivery {
    private String timeSlotId;
    private long estimatedDeliveryStartDate;
    private long estimatedDeliveryEndDate;
    private String model;
    private String scheduleType;


    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }
}
