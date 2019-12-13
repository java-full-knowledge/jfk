package jsonparsing.validator.personvalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class PersonGenderValidator implements JsonValidator<String, ValidationResult> {
    @Override
    public ValidationResult validate(String content) {
        if (content.contains("gender"))
            return new ValidationResult(true, " Line contains field gender...");
        else
            return new ValidationResult(false, " Line not contains field gender...");
    }
}
