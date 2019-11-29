package com.jfk.userregistration.validators.validator;

import com.jfk.userregistration.dto.UserCreateRequestDto;
import com.jfk.userregistration.validators.result.ValidationResult;

public class EmailValidator implements Validator {
    @Override
    public ValidationResult validate(Object instance) {
        UserCreateRequestDto userDto = (UserCreateRequestDto) instance;
        if (!userDto.getEmail().contains("@")) {
            return new ValidationResult(false, "Please provide valid email address");
        }
        return success;
    }
}
