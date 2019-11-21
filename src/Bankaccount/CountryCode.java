package Bankaccount;

public enum CountryCode {

    ARM("+374", Country.AM), GEO("+995", Country.GE),
    DEU("+49",Country.GE), FRA("+33",Country.FR);

    private String countryCode;
    private  Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;

    }
}
