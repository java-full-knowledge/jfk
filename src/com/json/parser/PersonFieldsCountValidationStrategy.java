package com.json.parser;

import com.json.validator.ValidationStrategy;

public class PersonFieldsCountValidationStrategy implements ValidationStrategy<PersonFields, Boolean> {

    @Override
    public Boolean apply(PersonFields personFields) {
        return personFields.getFields().length == 3;

    }
}
