package com.json.validator;

public interface ValidationStrategy<Input, Output> {

    Output apply(Input input);
}
