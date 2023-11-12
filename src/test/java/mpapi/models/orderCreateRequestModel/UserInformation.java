package mpapi.models.orderCreateRequestModel;

public class UserInformation {
    private long application;
    private long createdDate;
    private String userTypeStatus;
    private String userIp;
    private String visitorType;
    private String userAgent;
    private String pid;
    private String sid;

    public long getApplication() {
        return application;
    }

    public void setApplication(long application) {
        this.application = application;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public String getUserTypeStatus() {
        return userTypeStatus;
    }

    public void setUserTypeStatus(String userTypeStatus) {
        this.userTypeStatus = userTypeStatus;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

}
