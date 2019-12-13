package jsonparsing.validator;



public class JsonFieldsValidator implements JsonValidator<String,ValidationResult> {


    private static final String TWO_DOTS = ":";
    private static final String OPEN_BRACKETS = "{";
    private static final String CLOSE_BRACKETS = "}";
  //  private static final String OPEN_ARRAY_BRACKETS = "[";
    private static final String COMMA = ":";


    @Override
    public ValidationResult validate(final String content) {
        ValidationResult validationResult;
        String withoutBrackets = content.replace(OPEN_BRACKETS, "").replace(CLOSE_BRACKETS, "");
        int commaCount = withoutBrackets.split(COMMA).length;
        int twoDotCount = content.length() - content.replace(TWO_DOTS, "").length();
            if (commaCount-1 != twoDotCount) {
                validationResult = new ValidationResult(false, "Key : Value field count does not match ...");
                // System.out.println("Key : Value field count does not match ...");
            } else
                validationResult = new ValidationResult(true,"Key : Value field count does  match ..." );

        return validationResult;
    }
}
