package UserRegistration.validators.domainvalidator;

import UserRegistration.validators.result.ValidationResult;
import UserRegistration.validators.validator.Validator;

public class UserValidator implements ValidatesDomayn {

    private final Validator[] validators;

    public UserValidator(Validator[] validators) {
        this.validators = validators;
    }

    @Override
    public ValidationResult[] doValidate(Object domain) {
        ValidationResult [] results=new ValidationResult[(validators.length)];
        int k=0;
        for(Validator val:validators){
            results[k]=val.validate(domain);
            k++;
        }
        return results;
    }
}
