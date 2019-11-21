package Bankaccount;

public enum Country {

    AM("Armenia", "051"),GE("Georgia","047"),
    DE("Germany","062"), FR("France", "066");
    private String countryName;
    private String numericCode;

    Country(String countryName, String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }
    }
