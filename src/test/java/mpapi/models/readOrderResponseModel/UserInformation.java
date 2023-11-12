package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInformation {
    private String userAgent;
    private String userIp;
    private String userTypeStatus;
    private String visitorType;
    private long createdDate;
    private long application;
    private Object pid;
    private Object sid;
    private Object uniqueId;

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getUserTypeStatus() {
        return userTypeStatus;
    }

    public void setUserTypeStatus(String userTypeStatus) {
        this.userTypeStatus = userTypeStatus;
    }

    public String getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public long getApplication() {
        return application;
    }

    public void setApplication(long application) {
        this.application = application;
    }

    public Object getPid() {
        return pid;
    }

    public void setPid(Object pid) {
        this.pid = pid;
    }

    public Object getSid() {
        return sid;
    }

    public void setSid(Object sid) {
        this.sid = sid;
    }

    public Object getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Object uniqueId) {
        this.uniqueId = uniqueId;
    }
}
