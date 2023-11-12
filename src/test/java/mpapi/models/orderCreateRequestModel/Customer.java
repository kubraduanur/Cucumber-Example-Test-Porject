package mpapi.models.orderCreateRequestModel;

import java.util.List;

public class Customer {
    private long id;
    private String guid;
    private String firstName;
    private String lastName;
    private boolean freeFromFraudControl;
    private boolean guest;
    private boolean staffUser;
    private String note;
    private String tcIdentityNumber;

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

    public boolean isFreeFromFraudControl() {
        return freeFromFraudControl;
    }

    public void setFreeFromFraudControl(boolean freeFromFraudControl) {
        this.freeFromFraudControl = freeFromFraudControl;
    }

    public boolean isGuest() {
        return guest;
    }

    public void setGuest(boolean guest) {
        this.guest = guest;
    }

    public boolean isStaffUser() {
        return staffUser;
    }

    public void setStaffUser(boolean staffUser) {
        this.staffUser = staffUser;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTcIdentityNumber() {
        return tcIdentityNumber;
    }

    public void setTcIdentityNumber(String tcIdentityNumber) {
        this.tcIdentityNumber = tcIdentityNumber;
    }



}
