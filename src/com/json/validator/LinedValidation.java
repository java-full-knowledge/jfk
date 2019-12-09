package com.json.validator;

public class LinedValidation implements Validation {

    private static String default_lined_message = "error in line %d";
    private boolean isValid = true;
    private int lineNumber;

    public LinedValidation(int lineNumber) {
        if (lineNumber >= 0) {
            this.isValid = false;
        }
        this.lineNumber = lineNumber;
    }

    @Override
    public boolean isValid() {
        return this.isValid;
    }

    @Override
    public String message() {
        return String.format(default_lined_message, this.lineNumber);
    }
}
