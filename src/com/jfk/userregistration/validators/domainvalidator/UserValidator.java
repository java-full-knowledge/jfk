package com.jfk.userregistration.validators.domainvalidator;

import com.jfk.userregistration.validators.result.ValidationResult;
import com.jfk.userregistration.validators.validator.Validator;

public class UserValidator implements ValidatesDomain {

    private final Validator[] validators;

    public UserValidator(Validator[] validators) {
        this.validators = validators;
    }

    @Override
    public ValidationResult[] doValidate(Object domain) {
        ValidationResult[] results = new ValidationResult[this.validators.length];
        int k = 0;
        for (Validator validator : this.validators) {
            results[k] = validator.validate(domain);
            k++;
        }
        return results;
    }
}
