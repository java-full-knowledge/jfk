package jsonparsing.validator.colorsvalidators.colorvalidator;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class ColorCategoryValidator implements JsonValidator<String, ValidationResult> {
    @Override
    public ValidationResult validate(String content) {
        if (content.contains("category"))
            return new ValidationResult(true, " Line contains field category...");
        else
            return new ValidationResult(false, " Line not contains field category...");
    }
}
