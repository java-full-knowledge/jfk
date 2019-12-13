package jsonparsing.jsonobject;

public enum Gender {
    MALE,FEMALE;

    public static Gender find(String fieldName) {
        for (Gender value : values()) {
            if (value.name().equalsIgnoreCase(fieldName)) {
                return value;
            }
        }
        return null;
    }
}
