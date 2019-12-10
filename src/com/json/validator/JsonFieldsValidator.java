package com.json.validator;


/**
 * JsonFieldsValidator class
 * Validates content field formatting
 */
public final class JsonFieldsValidator implements JsonValidator {


    private static final String TWO_DOTS = ":";
    private static final String OPEN_BRACKETS = "{";
    private static final String CLOSE_BRACKETS = "}";
    private static final String OPEN_ARRAY_BRACKETS = "[";
    private static final String COMMA = ",";

    /**
     * @param content to validate.
     */
    @Override
    public void validate(final String content) {
        String withoutBrackets = content.replace(OPEN_BRACKETS, "").replace(CLOSE_BRACKETS, "");
        int commaCount = withoutBrackets.split(COMMA).length;
        int twoDotCount = content.length() - content.replace(TWO_DOTS, "").length();
        if (!withoutBrackets.contains(OPEN_ARRAY_BRACKETS)) {
            if (commaCount != twoDotCount) {
                System.out.println("Key : Value field count does not match ...");
            }
        }
    }
}