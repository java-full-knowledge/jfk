package UserRegistration.service;

import UserRegistration.domein.Domain;
import UserRegistration.domein.Phonenumber;
import UserRegistration.dto.DomainCreationResponse;
import UserRegistration.dto.PhonenumberCreateRequestDto;
import UserRegistration.validators.domainvalidator.ValidatesDomayn;
import UserRegistration.validators.result.ValidationResult;

public class PhonenumberService extends Service implements CrudeService{


    public PhonenumberService(ValidatesDomayn validatesDomayn) {
        super(validatesDomayn);
    }

    @Override
    public Object create(Object creatparametrs){

        PhonenumberCreateRequestDto ptr=(PhonenumberCreateRequestDto) creatparametrs;
        ValidationResult [] validationResults= validatesDomayn.doValidate(ptr);
        ValidationResult[] notValidResults = new ValidationResult[validationResults.length];
        int k = 0;
        boolean hasInvalidResult = false;
        for (ValidationResult val : validationResults) {
            if (!val.isResul()) {
                notValidResults[k] = val;
                hasInvalidResult = true;
                k++;
            }
        }
        if (hasInvalidResult == false) {
            Phonenumber  phonenumber = ptr.getPhonenumber();
            ValidationResult [] succes=new ValidationResult[]{new ValidationResult(true,"Succes")};
            return new DomainCreationResponse(phonenumber, succes);
        }
        else
            return new DomainCreationResponse(null,notValidResults);
    }

    @Override
    public Domain read(int id) {
        return null;
    }

    @Override
    public Domain update(Object updateParametrs) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
