package com.json.validator;

public interface ValidationService<S extends ValidationStrategy<?, ?>> {

    Validation[] validate(S[] strategies);
}
