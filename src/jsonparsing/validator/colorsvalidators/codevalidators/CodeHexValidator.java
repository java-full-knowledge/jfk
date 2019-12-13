package jsonparsing.validator.colorsvalidators.codevalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class CodeHexValidator implements JsonValidator<String, ValidationResult> {
    @Override
    public ValidationResult validate(String content) {
        if (content.contains("hex"))
            return new ValidationResult(true, " Line contains field hex...");
        else
            return new ValidationResult(false, " Line not contains field hex ...");
    }

}
