package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Customer;

public final class CustomerBuilder {
    private long id;
    private String guid;
    private String firstName;
    private String lastName;
    private boolean freeFromFraudControl;
    private boolean guest;
    private boolean staffUser;
    private String note;
    private String tcIdentityNumber;

    private CustomerBuilder() {
    }

    public static CustomerBuilder aCustomer() {
        return new CustomerBuilder();
    }

    public CustomerBuilder id(long id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder guid(String guid) {
        this.guid = guid;
        return this;
    }

    public CustomerBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerBuilder freeFromFraudControl(boolean freeFromFraudControl) {
        this.freeFromFraudControl = freeFromFraudControl;
        return this;
    }

    public CustomerBuilder guest(boolean guest) {
        this.guest = guest;
        return this;
    }

    public CustomerBuilder staffUser(boolean staffUser) {
        this.staffUser = staffUser;
        return this;
    }

    public CustomerBuilder note(String note) {
        this.note = note;
        return this;
    }

    public CustomerBuilder tcIdentityNumber(String tcIdentityNumber) {
        this.tcIdentityNumber = tcIdentityNumber;
        return this;
    }

    public Customer build() {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setGuid(guid);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setFreeFromFraudControl(freeFromFraudControl);
        customer.setGuest(guest);
        customer.setStaffUser(staffUser);
        customer.setNote(note);
        customer.setTcIdentityNumber(tcIdentityNumber);
        return customer;
    }
}
