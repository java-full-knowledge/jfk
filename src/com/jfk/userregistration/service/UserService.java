package com.jfk.userregistration.service;

import com.jfk.userregistration.domain.Domain;
import com.jfk.userregistration.domain.User;
import com.jfk.userregistration.dto.DomainCreationResponse;
import com.jfk.userregistration.dto.UserCreateRequestDto;
import com.jfk.userregistration.validators.domainvalidator.ValidatesDomain;
import com.jfk.userregistration.validators.result.ValidationResult;

public class UserService implements CrudService {

    private final ValidatesDomain domainValidator;

    public UserService(ValidatesDomain validatesDomain) {
        this.domainValidator = validatesDomain;
    }

    @Override
    public DomainCreationResponse create(Object createParameters) {

        UserCreateRequestDto u = (UserCreateRequestDto) createParameters;

        ValidationResult[] validationResults = domainValidator.doValidate(createParameters);
        ValidationResult[] notValidResults = new ValidationResult[validationResults.length];
        int k = 0;
        boolean hasInvalidResult = false;
        for (ValidationResult validationResult : validationResults) {
            if (!validationResult.isValid()) {
                notValidResults[k] = validationResult;
                hasInvalidResult = true;
                k++;
            }
        }

        if (hasInvalidResult) {
            return new DomainCreationResponse(null, notValidResults);
        }
        User user = new User(
                u.getName(),
                u.getUsername(),
                u.getPassword(),
                u.getEmail()
        );
        ValidationResult [] success = new ValidationResult[1];
        success[0] = new ValidationResult(true, "Success");
        return new DomainCreationResponse(user, success);
    }

    @Override
    public Domain read(int id) {
        return null;
    }

    @Override
    public Domain update(Object updateParameters) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}




















