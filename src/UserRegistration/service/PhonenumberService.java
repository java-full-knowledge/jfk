package UserRegistration.service;

import UserRegistration.domein.Phonenumber;
import UserRegistration.dto.DomainCreationResponse;
import UserRegistration.dto.PhonenumberCreateRequestDto;
import UserRegistration.repository.PhonenumberRepository;
import UserRegistration.validators.domainvalidator.ValidatesDomayn;
import UserRegistration.validators.result.ValidationResult;

public class PhonenumberService extends Service<PhonenumberRepository> implements CrudeService<PhonenumberCreateRequestDto, DomainCreationResponse> {


    public PhonenumberService(ValidatesDomayn validatesDomayn, PhonenumberRepository repository) {
        super(validatesDomayn, repository);
    }

    @Override
    public DomainCreationResponse create(PhonenumberCreateRequestDto creatparametrs) {


        ValidationResult[] validationResults = validatesDomayn.doValidate(creatparametrs);
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
            Phonenumber phonenumber = creatparametrs.getPhonenumber();
            ValidationResult[] succes = new ValidationResult[]{new ValidationResult(true, "Succes")};
            return new DomainCreationResponse(phonenumber, succes);
        } else
            return new DomainCreationResponse(null, notValidResults);
    }

    @Override
    public DomainCreationResponse read(int id) {
        DomainCreationResponse dom = null;
        for (Phonenumber phonenumber : repository.getPhonenumbers())
            if (phonenumber.getId() == id) {
                ValidationResult[] validationResults = validatesDomayn.doValidate(phonenumber);
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
                    ValidationResult[] succes = new ValidationResult[]{new ValidationResult(true, "Succes")};
                    dom = new DomainCreationResponse(phonenumber, succes);
                    break;
                } else {
                    dom = new DomainCreationResponse(null, notValidResults);
                    break;
                }
            }
        return dom;
    }

    @Override
    public DomainCreationResponse update(PhonenumberCreateRequestDto updateParametrs) {
        ValidationResult[] validatorResults = validatesDomayn.doValidate(updateParametrs);

        ValidationResult[] notValidResults = new ValidationResult[validatorResults.length];
        int k = 0;
        boolean hasInvalidResult = false;
        for (ValidationResult val : validatorResults) {
            if (!val.isResul()) {
                notValidResults[k] = val;
                hasInvalidResult = true;
                k++;
            }
        }
        if (hasInvalidResult == false) {
            for (Phonenumber phonenumber : repository.getPhonenumbers()) {
                if (phonenumber.getUserId()==updateParametrs.getUserId()) {
                  phonenumber.setPhonenumber(updateParametrs.getPhonenumber().getPhonenumber());
                    ValidationResult[] succes = new ValidationResult[]{new ValidationResult(true, "Succes")};
                    return new DomainCreationResponse(phonenumber,succes);
                }
            }
        }
        return new DomainCreationResponse(null,notValidResults);
    }

    @Override
    public boolean delete(int id) {
        if (this.repository.getUserSize() == 0) {
            System.out.printf("Repository is empty...");
            return false;
        }
        boolean t = false;
        for (Phonenumber phonenumber : this.repository.getPhonenumbers())
            if (phonenumber!=null && phonenumber.getUserId() == id) {
                t = true;
                repository.delete(phonenumber.getId());
            }
        return t;
    }
}
