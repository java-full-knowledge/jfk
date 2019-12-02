package UserRegistration.repository;

import UserRegistration.checks.CheckUsername;
import UserRegistration.domein.User;
import UserRegistration.dto.DomainCreationResponse;
import UserRegistration.dto.UserCreateRequestDto;
import UserRegistration.service.CrudeService;
import UserRegistration.service.UserService;
import UserRegistration.validators.domainvalidator.UserValidator;
import UserRegistration.validators.domainvalidator.ValidatesDomayn;
import UserRegistration.validators.validator.EmailValidator;
import UserRegistration.validators.validator.PasswordValidator;
import UserRegistration.validators.validator.Validator;

public class UserRepository implements Repository {

    private int user_index;
    private User[] users;

    public UserRepository(int size) {
        this.users = new User[size];
        user_index = 0;
    }

    public User[] getDomains() {
        return users;
    }

    @Override
    public void delete(int id) {
        int i = 0;
        while (users[i] != null) {
            if (users[i].getId() == id) {
                for (int j = i; j < users.length - 1; j++) {
                    users[j] = users[j + 1];
                }
                user_index--;
                return;
            }
            i++;
        }
    }

    @Override
    public void save(Object user) {
        if (user_index == users.length) {
            System.out.println("Is Full");
            return;
        }
        Validator[] validators1 = new Validator[2];
        validators1[0] = new EmailValidator();
        validators1[1] = new PasswordValidator();


        ValidatesDomayn userValidator = new UserValidator(validators1);
        CrudeService userCrudService = new UserService(userValidator);

        UserCreateRequestDto dto = (UserCreateRequestDto) user;
        DomainCreationResponse domainCreationResponse = (DomainCreationResponse) userCrudService.create(dto);

        //stugume e,vor repository-um ka nman usernamne-ov User
        CheckUsername u=new CheckUsername(this);

        if (domainCreationResponse.getDomain() != null && !u.uniqueUsername((User)domainCreationResponse.getDomain())) {
            domainCreationResponse.getDomain().setId(user_index);
            users[user_index] = (User) domainCreationResponse.getDomain();
            user_index++;
        }
    }

    @Override
    public User get() {
        return users[user_index - 1];
    }

    @Override
    public int getUserSize() {
        return user_index - 1;
    }
}
