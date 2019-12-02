package UserRegistration.service;

import UserRegistration.domein.Domain;
import UserRegistration.domein.User;
import UserRegistration.dto.DomainCreationResponse;
import UserRegistration.dto.DomainUpdationResponse;
import UserRegistration.dto.UserCreateRequestDto;
import UserRegistration.validators.domainvalidator.ValidatesDomayn;
import UserRegistration.validators.result.ValidationResult;

public class UserService extends Service implements CrudeService{


    public UserService(ValidatesDomayn validatesDomayn) {
        super(validatesDomayn);
    }

    @Override
    public DomainCreationResponse create(Object creatparametrs) {

        UserCreateRequestDto userCreateRequestDto = (UserCreateRequestDto) creatparametrs;

        ValidationResult[] validatorResults = validatesDomayn.doValidate(creatparametrs);

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
                User user = new User();
                user.setFirstname(userCreateRequestDto.getFirstname());
                user.setLastname(userCreateRequestDto.getLastname());
                user.setUserName(userCreateRequestDto.getUserName());
                user.setPassword((userCreateRequestDto.getPassword2()));
                user.setEmail(userCreateRequestDto.getEmail());
                ValidationResult [] succes=new ValidationResult[]{new ValidationResult(true,"Succes")};
                return new DomainCreationResponse(user, succes);
            }
            else
                return new DomainCreationResponse(null,notValidResults);


    }

    @Override
    public Domain read(int id) {
        return null;
    }

    @Override
    public DomainUpdationResponse update(Object updateParametrs) {

        DomainCreationResponse domainCreationResponse=create(updateParametrs);
        if(domainCreationResponse.getDomain()!=null)
            return new DomainUpdationResponse(domainCreationResponse.getDomain(),domainCreationResponse.getValidationResults());
        else
            return new DomainUpdationResponse(null,domainCreationResponse.getValidationResults());
    }

    @Override
    public boolean delete(int id) {
        return false;

    }


}
