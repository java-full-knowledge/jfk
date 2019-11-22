package Bankaccount;

public enum Country {

    AM("Armenia", "051"),
    ES("Spain","724"),
    FR("France", "250"),
    AU("Australia", "036");
    private String countryName;
    private String numericCode;

    Country(String countryName, String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }
    }
