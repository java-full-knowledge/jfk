package com.jfk.userregistration.validators.validator;

import com.jfk.userregistration.validators.result.ValidationResult;

public interface Validator {

    ValidationResult success = new ValidationResult(true, "Success");

    ValidationResult validate(Object instance);
}
