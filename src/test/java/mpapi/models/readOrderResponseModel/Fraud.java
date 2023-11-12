package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fraud {
    private long notificationDate;
    private String status;
    private Object reasonCode;
    private Object agentId;
    private Object reasonComment;
    private Object description;

    public long getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(long notificationDate) {
        this.notificationDate = notificationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Object reasonCode) {
        this.reasonCode = reasonCode;
    }

    public Object getAgentId() {
        return agentId;
    }

    public void setAgentId(Object agentId) {
        this.agentId = agentId;
    }

    public Object getReasonComment() {
        return reasonComment;
    }

    public void setReasonComment(Object reasonComment) {
        this.reasonComment = reasonComment;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }
}
