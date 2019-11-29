package com.jfk.userregistration.validators.domainvalidator;

import com.jfk.userregistration.validators.result.ValidationResult;

public interface ValidatesDomain {

    ValidationResult[] doValidate(Object domain);
}
