package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Address;

public final class AddressBuilder {
    private String firstName;
    private String lastName;
    private String address1;
    private String email;
    private String city;
    private long cityCode;
    private long cityId;
    private String countryCode;
    private String district;
    private long districtId;
    private String latitude;
    private String longitude;
    private long neighborhoodId;
    private String phone;
    private String address2;
    private String addressDescription;
    private String apartmentNumber;
    private String company;
    private String doorNumber;
    private String floor;
    private String identityNumber;
    private String neighborhood;
    private String postalCode;

    private AddressBuilder() {
    }

    public static AddressBuilder anAddress() {
        return new AddressBuilder();
    }

    public AddressBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public AddressBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AddressBuilder address1(String address1) {
        this.address1 = address1;
        return this;
    }

    public AddressBuilder email(String email) {
        this.email = email;
        return this;
    }

    public AddressBuilder city(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder cityCode(long cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    public AddressBuilder cityId(long cityId) {
        this.cityId = cityId;
        return this;
    }

    public AddressBuilder countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public AddressBuilder district(String district) {
        this.district = district;
        return this;
    }

    public AddressBuilder districtId(long districtId) {
        this.districtId = districtId;
        return this;
    }

    public AddressBuilder latitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public AddressBuilder longitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public AddressBuilder neighborhoodId(long neighborhoodId) {
        this.neighborhoodId = neighborhoodId;
        return this;
    }

    public AddressBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public AddressBuilder address2(String address2) {
        this.address2 = address2;
        return this;
    }

    public AddressBuilder addressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
        return this;
    }

    public AddressBuilder apartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        return this;
    }

    public AddressBuilder company(String company) {
        this.company = company;
        return this;
    }

    public AddressBuilder doorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
        return this;
    }

    public AddressBuilder floor(String floor) {
        this.floor = floor;
        return this;
    }

    public AddressBuilder identityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
        return this;
    }

    public AddressBuilder neighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public AddressBuilder postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public Address build() {
        Address address = new Address();
        address.setFirstName(firstName);
        address.setLastName(lastName);
        address.setAddress1(address1);
        address.setEmail(email);
        address.setCity(city);
        address.setCityCode(cityCode);
        address.setCityId(cityId);
        address.setCountryCode(countryCode);
        address.setDistrict(district);
        address.setDistrictId(districtId);
        address.setLatitude(latitude);
        address.setLongitude(longitude);
        address.setNeighborhoodId(neighborhoodId);
        address.setPhone(phone);
        address.setAddress2(address2);
        address.setAddressDescription(addressDescription);
        address.setApartmentNumber(apartmentNumber);
        address.setCompany(company);
        address.setDoorNumber(doorNumber);
        address.setFloor(floor);
        address.setIdentityNumber(identityNumber);
        address.setNeighborhood(neighborhood);
        address.setPostalCode(postalCode);
        return address;
    }
}
