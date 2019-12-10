package com.json.validator;


/**
 * JsonBracketsValidator class.
 * Validate brackets in json string content.
 */
public final class JsonBracketsValidator implements JsonValidator {

    private static final String OPEN_BRACKETS = "{";
    private static final String CLOSE_BRACKETS = "}";

    /**
     * @param content to validate
     */
    @Override
    public void validate(final String content){

        int openBracketCount = content.length() - content.replace(OPEN_BRACKETS, "").length();
        int closeBracketCount = content.length() - content.replace(CLOSE_BRACKETS, "").length();

        if (openBracketCount != closeBracketCount) {
            System.out.println("Open and Close brackets count does not match ...");
        }

    }
}