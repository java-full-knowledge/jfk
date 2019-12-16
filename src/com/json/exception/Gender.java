package com.json.exception;

public enum Gender {

    MALE("male"), FEMALE("female");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public static Gender of(String gender) throws InvalidGenderException {
        for (int i = 0; i < values().length; i++) {
            if (gender.equalsIgnoreCase(values()[i].gender)) {
                return values()[i];
            }
        }
        throw new InvalidGenderException(gender);
    }
}
