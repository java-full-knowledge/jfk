package UserRegistration.validators.validator;

import UserRegistration.Message.ValidationMessage;
import UserRegistration.dto.UserCreateRequestDto;
import UserRegistration.validators.result.ValidationResult;

public class EmailValidator implements Validator {

    @Override
    public ValidationResult validate(Object instance) {

        UserCreateRequestDto userCreateRequestDto = (UserCreateRequestDto) instance;
        if (!userCreateRequestDto.getEmail().contains("@")) {
            System.out.println(ValidationMessage.email.getMessage());
            return new ValidationResult(false, ValidationMessage.email.getMessage());
        }
        return success;
    }
}
