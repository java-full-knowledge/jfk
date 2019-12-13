package jsonparsing.validator.colorsvalidators.codevalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class CodeValidator implements JsonValidator<String, ValidationResult[]> {
    private final JsonValidator[] validators = new JsonValidator[]{new CodeHexValidator(),
            new CodeRgbaValidator()};

    @Override
    public ValidationResult[] validate(String content) {
        ValidationResult[] validationResults = new ValidationResult[validators.length];
        int i = 0;
        for (JsonValidator validator : validators) {
            validationResults[i] = (ValidationResult) validator.validate(content);
            i++;
        }
        return validationResults;
    }
}
