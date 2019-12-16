package com.json.exception;

public class InvalidGenderException extends Throwable {

    private final String genderName;

    public InvalidGenderException(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderName() {
        return this.genderName;
    }
}
