package com.jfk.userregistration.service;

import com.jfk.userregistration.dto.DomainCreationResponse;
import com.jfk.userregistration.dto.UserCreateRequestDto;
import com.jfk.userregistration.validators.domainvalidator.ValidatesDomain;

public class UserService implements CrudService<UserCreateRequestDto, DomainCreationResponse> {

    private final ValidatesDomain<UserCreateRequestDto> domainValidator;

    public UserService(ValidatesDomain<UserCreateRequestDto> validatesDomain) {
        this.domainValidator = validatesDomain;
    }

    @Override
    public DomainCreationResponse create(UserCreateRequestDto userCreateRequestDto) {
        return null;
    }

    @Override
    public DomainCreationResponse read(int id) {
        return null;
    }

    @Override
    public DomainCreationResponse update(UserCreateRequestDto userCreateRequestDto) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }


//    @Override
//    public DomainCreationResponse create(UserCreateRequestDto createParameters) {
//
//        ValidationResult[] validationResults = domainValidator.doValidate(createParameters);
//        ValidationResult[] notValidResults = new ValidationResult[validationResults.length];
//        int k = 0;
//        boolean hasInvalidResult = false;
//        for (ValidationResult validationResult : validationResults) {
//            if (!validationResult.isValid()) {
//                notValidResults[k] = validationResult;
//                hasInvalidResult = true;
//                k++;
//            }
//        }
//
//        if (hasInvalidResult) {
//            return new DomainCreationResponse(null, notValidResults);
//        }
//        User user = new User(
//                u.getName(),
//                u.getUsername(),
//                u.getPassword(),
//                u.getEmail()
//        );
//        ValidationResult [] success = new ValidationResult[1];
//        success[0] = new ValidationResult(true, "Success");
//        return new DomainCreationResponse(user, success);
//    }
//
//    @Override
//    public DomainCreationResponse create(UserCreateRequestDto createParameters) {
//        return null;
//    }
//
//    @Override
//    public User read(int id) {
//        return null;
//    }
//
//    @Override
//    public User update(UserCreateRequestDto updateParameters) {
//        return null;
//    }
//
//    @Override
//    public Domain update(Object updateParameters) {
//        return null;
//    }
//
//    @Override
//    public boolean delete(int id) {
//        return false;
//    }
}




















