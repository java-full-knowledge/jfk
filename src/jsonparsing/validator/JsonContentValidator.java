package jsonparsing.validator;

public class JsonContentValidator implements JsonValidator<String ,ValidationResult []> {

    private final JsonValidator [] validators=new JsonValidator[]{new JsonBracketsValidator(),
                                                        new JsonFieldsValidator(),
                                                            new JsonArrayBracketsValidator()};

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
