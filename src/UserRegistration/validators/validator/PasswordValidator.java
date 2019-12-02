package UserRegistration.validators.validator;

import UserRegistration.Message.ValidationMessage;
import UserRegistration.dto.UserCreateRequestDto;
import UserRegistration.validators.result.ValidationResult;

public class PasswordValidator implements Validator {

    @Override
    public ValidationResult validate(Object instance) {

        UserCreateRequestDto userCreateRequestDto = (UserCreateRequestDto) instance;
        if(!userCreateRequestDto.getPassword1().equals(userCreateRequestDto.getPassword2())) {
            System.out.println(ValidationMessage.password.getMessage());
            return new ValidationResult(false, ValidationMessage.password.getMessage());
        }
        return success;
    }


}
