package UserRegistration.validators.validator;

import UserRegistration.enums.Message.ValidationMessage;
import UserRegistration.dto.UserCreateRequestDto;
import UserRegistration.validators.result.ValidationResult;

public class EmailValidator implements Validator<UserCreateRequestDto> {

    @Override
    public ValidationResult validate(UserCreateRequestDto instance) {

        UserCreateRequestDto userCreateRequestDto = instance;
        if (!userCreateRequestDto.getEmail().contains("@")) {
            System.out.println(ValidationMessage.email.getMessage());
            return new ValidationResult(false, ValidationMessage.email.getMessage());
        }
        return success;
    }
}
