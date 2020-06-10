package src.com.jfk.inheritance;

public enum PhoneCodes {
    ARM("Armenia", "+374"),
    RUS("Russian", "+7"),
    GEO("Georgia", "+995");

    private final String countryName;
    private final String countryCode;

    PhoneCodes(String countryName, String countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public static PhoneCodes findByCountryName(String countryName) {
        for (int i = 0; i < values().length; i++) {
            if (values()[i].countryName.equalsIgnoreCase(countryName)) {
                return values()[i];
            }
        }
        return null;
    }
}
