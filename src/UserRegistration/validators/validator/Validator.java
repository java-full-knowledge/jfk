package UserRegistration.validators.validator;

import UserRegistration.validators.result.ValidationResult;

public interface Validator{

    ValidationResult success = new ValidationResult(true, "Success");

    ValidationResult validate(Object instance);
}
