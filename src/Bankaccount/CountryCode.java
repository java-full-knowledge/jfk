package Bankaccount;

public enum CountryCode {

    ARM("+374", Country.AM),
    ESP("+34", Country.ES),
    AUS("+61", Country.AU),
    FRA("+33", Country.FR);

    private String countryCode;
    private  Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;

    }
}
