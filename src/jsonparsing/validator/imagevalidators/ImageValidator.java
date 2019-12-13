package jsonparsing.validator.imagevalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class ImageValidator implements JsonValidator<String, ValidationResult [] > {

    private final JsonValidator [] validators=new JsonValidator[]{new ImageHeightValidator(),
                                                                     new ImageUrlValidator(),
                                                                         new ImageWidthValidator()};
    @Override
    public ValidationResult [] validate(String content) {
        ValidationResult[] validationResults=new ValidationResult[validators.length];
        int i=0;
        for(JsonValidator validator:validators) {
            validationResults[i] = (ValidationResult) validator.validate(content);
            i++;
        }
        return validationResults;
    }
}
