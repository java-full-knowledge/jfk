package jsonparsing.validator;


public class JsonBracketsValidator implements JsonValidator<String, ValidationResult> {

    private final String openBrackets = "{";
    private final String closeBrackets = "}";


    @Override
    public ValidationResult validate(String content) {

        int openBracketscount = content.length() - content.replace(openBrackets, "").length();
        int closeBracjetscount = content.length() - content.replace(closeBrackets, "").length();

        if (openBracketscount != closeBracjetscount)
            return new ValidationResult(false, "Open and Close brackets count does not match...");
        else
            return new ValidationResult(true, "Open and Close brackets count does match...");
    }

}
