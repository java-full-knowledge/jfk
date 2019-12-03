package com.jfk.userregistration.validators.domainvalidator;

import com.jfk.userregistration.dto.UserCreateRequestDto;
import com.jfk.userregistration.validators.result.ValidationResult;
import com.jfk.userregistration.validators.validator.Validator;

public class UserValidator implements ValidatesDomain<UserCreateRequestDto> {

    private final Validator[] validators;

    public UserValidator(Validator[] validators) {
        this.validators = validators;
    }

//    @Override
//    public ValidationResult[] doValidate(Object domain) {
//        ValidationResult[] results = new ValidationResult[this.validators.length];
//        int k = 0;
//        for (Validator validator : this.validators) {
//            results[k] = validator.validate(domain);
//            k++;
//        }
//        return results;
//    }


    @Override
    public ValidationResult[] doValidate(UserCreateRequestDto createParameters) {
        return new ValidationResult[0];
    }
}
