package com.jfk.BankAccount;

public enum Country {
    AM("Armenia", "051"),
    RU("Rus", "052"),
    GEO("Georgia", "053"),
    ;

    private String countryName;
    private String numericCode;

    Country(String countryName, String numericCode) {
        this.countryName=countryName;
        this.numericCode=numericCode;
    }
}
