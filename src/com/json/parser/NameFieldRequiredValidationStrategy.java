package com.json.parser;

import com.json.validator.ValidationStrategy;

public class NameFieldRequiredValidationStrategy implements ValidationStrategy<PersonFields, Boolean> {
    @Override
    public Boolean apply(PersonFields personFields) {
        boolean containNameField = false;
        for (String field : personFields.getFields()) {
            if (field.equals("name")) {
                containNameField = true;
                break;
            }
        }
        return containNameField;
    }
}
