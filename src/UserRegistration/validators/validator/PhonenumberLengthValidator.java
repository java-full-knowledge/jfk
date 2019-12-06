package UserRegistration.validators.validator;

import UserRegistration.enums.Message.ValidationMessage;
import UserRegistration.dto.PhonenumberCreateRequestDto;
import UserRegistration.validators.result.ValidationResult;

public class PhonenumberLengthValidator implements Validator<PhonenumberCreateRequestDto> {
    @Override
    public ValidationResult validate(PhonenumberCreateRequestDto instance) {

            if (instance.getPhonenumber().getPhonenumber().length() != 9 ) {
                System.out.println(ValidationMessage.phonenumber.getMessage());
                return new ValidationResult(false, ValidationMessage.phonenumber.getMessage());
            }
        return success;

    }
}
