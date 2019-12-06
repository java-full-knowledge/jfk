package UserRegistration.validators.validator;

import UserRegistration.validators.result.ValidationResult;

public interface Validator<T>{

    ValidationResult success = new ValidationResult(true, "Success");

    ValidationResult validate(T instance);
}
