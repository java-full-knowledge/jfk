package com.json.validator;

public class JsonContentValidationService implements ValidationService {

    private final String content;

    public JsonContentValidationService(String content) {
        this.content = content;
    }


    @Override
    public Validation[] validate(ValidationStrategy[] strategies) {
        return new Validation[0];
    }
}
