package jsonparsing.validator.thumbnailvalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class ThumbnailUrlValidator implements JsonValidator<String , ValidationResult> {
    @Override
    public ValidationResult validate(String content) {
        if (content.contains("url") && content.contains(".jpg"))
            return new ValidationResult(true, " Line contains field url...");
        else
            return new ValidationResult(false, " Line not contains field url...");
    }
}
