package jsonparsing.validator.imagevalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class ImageWidthValidator implements JsonValidator<String , ValidationResult> {
    @Override
    public ValidationResult validate(String content) {
        if (content.contains("width"))
            return new ValidationResult(true, " Line contains field width...");
        else
            return new ValidationResult(false, " Line not contains field width...");
    }
}
