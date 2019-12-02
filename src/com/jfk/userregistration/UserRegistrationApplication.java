package com.jfk.userregistration;

import com.jfk.userregistration.dto.DomainCreationResponse;
import com.jfk.userregistration.dto.UserCreateRequestDto;
import com.jfk.userregistration.service.CrudService;
import com.jfk.userregistration.service.UserService;
import com.jfk.userregistration.validators.result.ValidationResult;
import com.jfk.userregistration.validators.validator.PasswordValidator;
import com.jfk.userregistration.validators.domainvalidator.UserValidator;
import com.jfk.userregistration.validators.domainvalidator.ValidatesDomain;
import com.jfk.userregistration.validators.validator.Validator;

public class UserRegistrationApplication {

    public static void main(String[] args) {
        Validator[] validators = new Validator[1];
        validators[0] = new PasswordValidator();
        ValidatesDomain userValidator = new UserValidator(validators);


        CrudService userCrudService = new UserService(userValidator);

        UserCreateRequestDto dto = new UserCreateRequestDto();
        dto.setEmail("sss");
        dto.setName("test");
        dto.setPassword("123");
        dto.setRePassword("123");
        dto.setUsername("test username");
        DomainCreationResponse domainCreationResponse = (DomainCreationResponse)userCrudService.create(dto);

        for (ValidationResult validationResult : domainCreationResponse.getValidationResults()) {
            if (validationResult != null) {
                System.out.println(validationResult.message());
            }
        }
    }
}






















