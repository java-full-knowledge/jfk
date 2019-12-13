package jsonparsing.validator.colorsvalidators.colorvalidator;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class ColorColorValidator implements JsonValidator<String, ValidationResult> {

    @Override
    public ValidationResult validate(String content) {
        if (content.contains("color"))
            return new ValidationResult(true, " Line contains field color...");
        else
            return new ValidationResult(false, " Line not contains field color...");
    }

}
