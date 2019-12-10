package com.json.validator;


/**
 * JsonContentValidator class.
 * Main json content validator which should contains different type validators.
 */
public final class JsonContentValidator implements JsonValidator {


    private final JsonValidator[] validators = {new JsonBracketsValidator(), new JsonArrayBracketsValidator(), new JsonFieldsValidator()};

    /**
     * @param content to validate
     */
    @Override
    public void validate(final String content) {
        for (final JsonValidator validator : this.validators) {
            validator.validate(content);
        }
    }
}