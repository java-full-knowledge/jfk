package UserRegistration.validators.validator;

import UserRegistration.enums.Message.ValidationMessage;
import UserRegistration.dto.PhonenumberCreateRequestDto;
import UserRegistration.enums.Phonetypes;
import UserRegistration.validators.result.ValidationResult;

public class PhonebumberCorrectValidator implements Validator<PhonenumberCreateRequestDto> {

    @Override
    public ValidationResult validate(PhonenumberCreateRequestDto instance) {
        boolean truenumber;
        Phonetypes[] arr=Phonetypes.values();
        String temp;
            temp="";
            truenumber=false;
            temp+=((char)instance.getPhonenumber().getPhonenumber().charAt(0));
            temp+=((char)instance.getPhonenumber().getPhonenumber().charAt(1));
            temp+=((char)instance.getPhonenumber().getPhonenumber().charAt(2));
            for(Phonetypes str:arr)
                if(str.getNum().equals(temp))
                    truenumber=true;
                if(!truenumber) {
                    System.out.println(ValidationMessage.phonenumber.getMessage());
                    return new ValidationResult(false, ValidationMessage.phonenumber.getMessage());
                }

        return success;
    }
}
