package UserRegistration.dto;

import UserRegistration.domein.Domain;
import UserRegistration.validators.result.ValidationResult;

public class DomainCreationResponse {

    private Domain domain;
    private ValidationResult[] validationResults;

    public DomainCreationResponse(Domain domain, ValidationResult[] validationResults) {
        this.domain = domain;
        this.validationResults = validationResults;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public ValidationResult[] getValidationResults() {
        return validationResults;
    }

    public void setValidationResults(ValidationResult[] validationResults) {
        this.validationResults = validationResults;
    }
}
