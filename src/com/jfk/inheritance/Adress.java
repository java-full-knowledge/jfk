package src.com.jfk.inheritance;

import java.util.Date;

class Address<PhoneNumber> extends AbstractBankEntity {

    private Country country;
    private String street;
    private PhoneNumber[] phoneNumbers;

    public Address(int id, Country country, String street, PhoneNumber[] phoneNumbers) {
        super(id);
        this.country = country;
        this.street = street;
        this.phoneNumbers = phoneNumbers;
        setUpdatedDate(new Date());
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

