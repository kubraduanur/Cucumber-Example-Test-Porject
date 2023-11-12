package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
    private long id;
    private String guid;
    private String firstName;
    private String lastName;
    private boolean guest;
    private boolean freeFromFraudControl;
    private boolean staffUser;
    private String tcIdentityNumber;
    private String note;
    private List<Object> segments;
    private boolean hasOrder;
    private Properties properties;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGuest() {
        return guest;
    }

    public void setGuest(boolean guest) {
        this.guest = guest;
    }

    public boolean isFreeFromFraudControl() {
        return freeFromFraudControl;
    }

    public void setFreeFromFraudControl(boolean freeFromFraudControl) {
        this.freeFromFraudControl = freeFromFraudControl;
    }

    public boolean isStaffUser() {
        return staffUser;
    }

    public void setStaffUser(boolean staffUser) {
        this.staffUser = staffUser;
    }

    public String getTcIdentityNumber() {
        return tcIdentityNumber;
    }

    public void setTcIdentityNumber(String tcIdentityNumber) {
        this.tcIdentityNumber = tcIdentityNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Object> getSegments() {
        return segments;
    }

    public void setSegments(List<Object> segments) {
        this.segments = segments;
    }

    public boolean isHasOrder() {
        return hasOrder;
    }

    public void setHasOrder(boolean hasOrder) {
        this.hasOrder = hasOrder;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
