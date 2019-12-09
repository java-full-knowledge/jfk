package com.json.parser;

import com.json.validator.Validation;
import com.json.validator.ValidationService;
import com.json.validator.ValidationStrategy;

public class PersonContentValidationService<T extends ValidationStrategy<PersonFields, Boolean>> implements ValidationService {

    @Override
    public Validation[] validate(ValidationStrategy[] strategies) {

        return new Validation[0];
    }
}
