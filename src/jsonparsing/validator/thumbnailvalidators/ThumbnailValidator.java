package jsonparsing.validator.thumbnailvalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class ThumbnailValidator implements JsonValidator<String, ValidationResult [] > {

    private final JsonValidator [] validators=new JsonValidator[]{new ThumbnailHeightValidator(),
                                                                     new ThumbnailWidthValidator(),
                                                                         new ThumbnailUrlValidator()};
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
