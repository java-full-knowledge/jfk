package bankaccount;

public enum CountryCode
{
    ARM("374",Country.AM),
    RUS("+7",Country.RU),
    USA("+1",Country.Us),
    ;
    private String countryCode;
    private Country country;
    CountryCode(String countryCode, Country country){
    }
}
