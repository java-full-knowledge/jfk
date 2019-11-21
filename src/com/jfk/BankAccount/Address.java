package com.jfk.BankAccount;

public class Address extends AbstractBankEntity{
    private Country country;
    private String street;
    private PhoneNumber[] phoneNumbers;

    public Address( Country country, String street, PhoneNumber[] phoneNumbers) {
        super(3);
        this.country = country;
        this.street = street;
        this.phoneNumbers = phoneNumbers;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
