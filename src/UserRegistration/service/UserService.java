package UserRegistration.service;

import UserRegistration.domein.User;
import UserRegistration.dto.DomainCreationResponse;
import UserRegistration.dto.UserCreateRequestDto;
import UserRegistration.repository.UserRepository;
import UserRegistration.validators.domainvalidator.ValidatesDomayn;
import UserRegistration.validators.result.ValidationResult;

import java.util.Date;

public class UserService extends Service<UserRepository> implements CrudeService<UserCreateRequestDto, DomainCreationResponse> {

    public UserService(ValidatesDomayn validatesDomayn, UserRepository repository) {
        super(validatesDomayn, repository);
    }

    @Override
    public DomainCreationResponse create(UserCreateRequestDto creatparametrs) {


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
            user.setFirstname(creatparametrs.getFirstname());
            user.setLastname(creatparametrs.getLastname());
            user.setUserName(creatparametrs.getUserName());
            user.setPassword((creatparametrs.getPassword2()));
            user.setEmail(creatparametrs.getEmail());
            ValidationResult[] succes = new ValidationResult[]{new ValidationResult(true, "Succes")};
            return new DomainCreationResponse(user, succes);
        } else
            return new DomainCreationResponse(null, notValidResults);


    }

    @Override
    public DomainCreationResponse read(int id) {
        DomainCreationResponse dom = null;
        for (User user : repository.getUsers())
            if (user.getId() == id) {
                ValidationResult[] validationResults = validatesDomayn.doValidate(user);
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
                    dom = new DomainCreationResponse(user, succes);
                    break;
                } else {
                    dom = new DomainCreationResponse(null, notValidResults);
                    break;
                }
            }
        return dom;
    }

    @Override
    public DomainCreationResponse update(UserCreateRequestDto updateParametrs) {
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
            for (User user : repository.getUsers()) {
                if (user.getUserName().equals(updateParametrs.getUserName())) {
                    user.setFirstname(updateParametrs.getFirstname());
                    user.setLastname(updateParametrs.getLastname());
                    user.setPassword(updateParametrs.getPassword1());
                    user.setEmail(updateParametrs.getEmail());
                    ValidationResult[] succes = new ValidationResult[]{new ValidationResult(true, "Succes")};
                    return new DomainCreationResponse(user,succes);
                }
            }
        }
        return new DomainCreationResponse(null,notValidResults);
    }

    @Override
    public boolean delete(int id) {
        if (repository.getUserSize() == 0) {
            System.out.println("Repository is empty...");
            return false;
        }
        for (User user : repository.getUsers())
            if (user.getId() == id)
                if (user.getRemovetime() == null) {
                    user.setRemovetime(new Date());
                    return false;
                } else {
                    if (user.getRemovetime().getYear() - (new Date().getYear()) > 1)
                        repository.delete(id);
                }
        return true;

    }


}
