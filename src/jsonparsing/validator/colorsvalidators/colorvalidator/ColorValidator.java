package jsonparsing.validator.colorsvalidators.colorvalidator;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;
import jsonparsing.validator.colorsvalidators.codevalidators.CodeValidator;

public class ColorValidator implements JsonValidator<String , ValidationResult []> {


    private final JsonValidator [] validators=new JsonValidator[]{new ColorColorValidator(),
            new ColorCategoryValidator() };

    @Override
    public ValidationResult [] validate(String content) {
        CodeValidator codeValidator=new CodeValidator();
        ValidationResult[] validationResults=new ValidationResult[validators.length+codeValidator.validate(content).length];
        int i=0;
        for(ValidationResult validationResult:codeValidator.validate(content)) {
            validationResults[i] = validationResult;
            i++;
        }
        for(JsonValidator validator:validators) {
            validationResults[i] = (ValidationResult) validator.validate(content);
            i++;
        }
        return validationResults;
    }
}
