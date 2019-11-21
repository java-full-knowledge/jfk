package com.jfk.BankAccount;

public class PhoneNumber extends AbstractBankEntity {
    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType type) {
        super(1);
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }

    public PhoneNumber(int id) {
        super(id);
    }
}
