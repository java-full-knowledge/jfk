package com.jfk.BankAccount;

public enum CountryCode {
    ARM("+374",Country.AM),
    RUS("+7",Country.RU),
    GEO("+265",Country.GEO);

    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode=countryCode;
        this.country=country;
    }
}
