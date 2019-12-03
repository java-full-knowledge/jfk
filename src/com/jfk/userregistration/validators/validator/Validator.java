package com.jfk.userregistration.validators.validator;

import com.jfk.userregistration.domain.Domain;
import com.jfk.userregistration.validators.result.ValidationResult;

public interface Validator<T extends Domain> {

    ValidationResult success = new ValidationResult(true, "Success");

    ValidationResult validate(T instance);
}
