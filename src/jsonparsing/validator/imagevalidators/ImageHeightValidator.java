package jsonparsing.validator.imagevalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class ImageHeightValidator implements JsonValidator<String, ValidationResult> {
    @Override
    public ValidationResult validate(String content) {
        if (content.contains("height"))
            return new ValidationResult(true, " Line contains field height...");
        else
            return new ValidationResult(false, " Line not contains field height...");
    }
}
