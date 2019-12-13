package jsonparsing.validator;

public class JsonArrayBracketsValidator implements JsonValidator<String,ValidationResult> {

    private static final String open_array_brackets = "[";
    private static final String close_array_brackets = "]";

    @Override
    public ValidationResult validate(final String content) {
        int openArrayBracketCount = content.length() - content.replace(open_array_brackets, "").length();
        int closeArrayBracketCount = content.length() - content.replace(close_array_brackets, "").length();

        if (openArrayBracketCount != closeArrayBracketCount)
            return new ValidationResult(false,"Invalid json array brackets ...");
        else
            return new ValidationResult(true,"Valid json array brackets ...");
    }
}
