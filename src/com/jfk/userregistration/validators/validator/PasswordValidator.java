package com.jfk.userregistration.validators.validator;

import com.jfk.userregistration.dto.UserCreateRequestDto;
import com.jfk.userregistration.validators.result.ValidationResult;

public class PasswordValidator implements Validator {
    @Override
    public ValidationResult validate(Object instance) {

        UserCreateRequestDto userDto = (UserCreateRequestDto) instance;
        if (!userDto.getPassword().equals(userDto.getRePassword())) {
            return new ValidationResult(false, "Your passwords not match");
        }
        System.out.println("Password validation successfully ends");
        return success;
    }
}
