package jsonparsing.validator.google_mapvalidators;

import jsonparsing.validator.JsonValidator;
import jsonparsing.validator.ValidationResult;

public class Google_MapPositionValidator implements JsonValidator<String, ValidationResult> {
    @Override
    public ValidationResult validate(String content) {
        String[] arr = content.split("}");
        for (String str : arr)
            if (str.contains("position")) {
                int k = 0, m = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '[')
                        k++;
                    if (str.charAt(i) == ']')
                        m++;
                }
                if (m < 1 || k < 1)
                    return new ValidationResult(false, "Invalid rgba");
            }
        return new ValidationResult(true, "Valid rgba...");
    }
}
