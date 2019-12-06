package UserRegistration.validators.validator;

import UserRegistration.enums.Message.ValidationMessage;
import UserRegistration.dto.UserCreateRequestDto;
import UserRegistration.validators.result.ValidationResult;

public class PasswordValidator implements Validator<UserCreateRequestDto> {

    @Override
    public ValidationResult validate(UserCreateRequestDto instance) {

       if(!instance.getPassword1().equals(instance.getPassword2())) {
            System.out.println(ValidationMessage.password.getMessage());
            return new ValidationResult(false, ValidationMessage.password.getMessage());
        }
        return success;
    }


}
