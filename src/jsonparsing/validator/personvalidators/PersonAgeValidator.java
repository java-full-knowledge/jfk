package jsonparsing.validator.personvalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class PersonAgeValidator implements JsonValidator<String, ValidationResult> {
    @Override
    public ValidationResult validate(String content) {
        if (content.contains("age"))
            return new ValidationResult(true, " Line contains field age...");
        else
            return new ValidationResult(false, " Line not contains field age...");
    }
}
