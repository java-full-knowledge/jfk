package com.json.validator;


/**
 * JsonArrayBracketsValidator class.
 * Array type brackets validator class
 */
public final class JsonArrayBracketsValidator implements JsonValidator {


    private static final String OPEN_ARRAY_BRACKETS = "[";
    private static final String CLOSE_ARRAY_BRACKETS = "]";

    /**
     * @param content to validate
     */
    @Override
    public void validate(final String content) {
        int openArrayBracketCount = content.length() - content.replace(OPEN_ARRAY_BRACKETS, "").length();
        int closeArrayBracketCount = content.length() - content.replace(CLOSE_ARRAY_BRACKETS, "").length();

        if (openArrayBracketCount != closeArrayBracketCount) {
            System.out.println("Invalid json array brackets ...");
        }
    }
}