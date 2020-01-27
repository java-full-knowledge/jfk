package com.jfk.userregistration.validators.result;

public class ValidationResult {

    private boolean isValid;

    private String validationMessage;

    public ValidationResult(boolean isValid, String validationMessage) {
        this.isValid = isValid;
        this.validationMessage = validationMessage;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public String message() {
        return this.validationMessage;
    }
}