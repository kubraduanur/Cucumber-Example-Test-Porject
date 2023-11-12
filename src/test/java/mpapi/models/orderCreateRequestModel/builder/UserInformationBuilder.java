package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.UserInformation;

public final class UserInformationBuilder {
    private long application;
    private long createdDate;
    private String userTypeStatus;
    private String userIp;
    private String visitorType;
    private String userAgent;
    private String pid;
    private String sid;

    private UserInformationBuilder() {
    }

    public static UserInformationBuilder anUserInformation() {
        return new UserInformationBuilder();
    }

    public UserInformationBuilder application(long application) {
        this.application = application;
        return this;
    }

    public UserInformationBuilder createdDate(long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public UserInformationBuilder userTypeStatus(String userTypeStatus) {
        this.userTypeStatus = userTypeStatus;
        return this;
    }

    public UserInformationBuilder userIp(String userIp) {
        this.userIp = userIp;
        return this;
    }

    public UserInformationBuilder visitorType(String visitorType) {
        this.visitorType = visitorType;
        return this;
    }

    public UserInformationBuilder userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public UserInformationBuilder pid(String pid) {
        this.pid = pid;
        return this;
    }

    public UserInformationBuilder sid(String sid) {
        this.sid = sid;
        return this;
    }

    public UserInformation build() {
        UserInformation userInformation = new UserInformation();
        userInformation.setApplication(application);
        userInformation.setCreatedDate(createdDate);
        userInformation.setUserTypeStatus(userTypeStatus);
        userInformation.setUserIp(userIp);
        userInformation.setVisitorType(visitorType);
        userInformation.setUserAgent(userAgent);
        userInformation.setPid(pid);
        userInformation.setSid(sid);
        return userInformation;
    }
}
