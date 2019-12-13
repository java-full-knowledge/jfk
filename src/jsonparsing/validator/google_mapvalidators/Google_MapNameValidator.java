package jsonparsing.validator.google_mapvalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class Google_MapNameValidator implements JsonValidator<String, ValidationResult> {
    @Override
    public ValidationResult validate(String content) {
        if (content.contains("name"))
            return new ValidationResult(true, " Line contains field name...");
        else
            return new ValidationResult(false, " Line not contains field age...");
    }
}
