package UserRegistration.validators.validator;

import UserRegistration.Message.ValidationMessage;
import UserRegistration.dto.PhonenumberCreateRequestDto;
import UserRegistration.validators.result.ValidationResult;

public class PhonebumberCorrectValidator implements Validator {

    public static void main(String[] args) {
        String a="077";
        String p="";
        p+=((char)a.charAt(0));
        System.out.println((char)48);
    }
    @Override
    public ValidationResult validate(Object instance) {
        boolean truenumber;
        Phonetypes [] arr=Phonetypes.values();
        String temp;
        PhonenumberCreateRequestDto ptr=(PhonenumberCreateRequestDto) instance;
            temp="";
            truenumber=false;
            temp+=((char)ptr.getPhonenumber().getPhonenumber().charAt(0));
            temp+=((char)ptr.getPhonenumber().getPhonenumber().charAt(1));
            temp+=((char)ptr.getPhonenumber().getPhonenumber().charAt(2));
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
