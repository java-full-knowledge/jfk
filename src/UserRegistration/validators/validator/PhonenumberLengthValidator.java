package UserRegistration.validators.validator;

import UserRegistration.Message.ValidationMessage;
import UserRegistration.dto.PhonenumberCreateRequestDto;
import UserRegistration.validators.result.ValidationResult;

public class PhonenumberLengthValidator implements Validator {
    @Override
    public ValidationResult validate(Object instance) {
        PhonenumberCreateRequestDto phonDto = (PhonenumberCreateRequestDto) instance;
            if (phonDto.getPhonenumber().getPhonenumber().length() != 9 ) {
                System.out.println(ValidationMessage.phonenumber.getMessage());
                return new ValidationResult(false, ValidationMessage.phonenumber.getMessage());
            }
        return success;

    }
}
