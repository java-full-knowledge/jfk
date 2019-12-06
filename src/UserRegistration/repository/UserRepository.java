package UserRegistration.repository;

import UserRegistration.checks.CheckUsername;
import UserRegistration.domein.User;
import UserRegistration.dto.DomainCreationResponse;

public class UserRepository implements Repository<User> {

    private int user_index;
    private User[] users;

    public UserRepository(int size) {
        this.users = new User[size];
        user_index = 0;
    }

    public User[] getUsers() {
        return users;
    }


    @Override
    public User save(DomainCreationResponse domain) {
        if (user_index == users.length) {
            System.out.println("Repository is full...");
            return null;
        }


       /* ValidatesDomayn userValidator = new UserValidator(validators1);
        CrudeService userCrudService = new UserService(userValidator,this);

        UserCreateRequestDto dto = (UserCreateRequestDto) user;
        DomainCreationResponse domainCreationResponse = (DomainCreationResponse) userCrudService.create(dto);

        //stugume e,vor repository-um ka nman usernamne-ov User*/
        CheckUsername u=new CheckUsername(this);

        if (domain.getDomain() != null && !u.uniqueUsername((User) domain.getDomain())) {
            domain.getDomain().setId(user_index);
            users[user_index] = (User) domain.getDomain();
            user_index++;
        }
        return  (User)domain.getDomain();
    }
    @Override
    public User delete(int id) {
        User us=null;
        for (int i = 0; i < user_index; i++) {
            if (users[i].getId() == id) {
                us=users[i];
                for (int j = 0; j < user_index - 1; j++) {
                    users[j] = users[j + 1];
                }
            }
            users[--user_index] = null;
        }
        return us;
    }

    @Override
    public User get() {
       return users[user_index-1];
    }

    @Override
    public int getUserSize() {
        return user_index;
    }

    /*public User[] getDomains() {
        return users;
    }

    @Override
    public User delete(int id) {
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
    public User save(User user) {
        if (user_index == users.length) {
            System.out.println("Is Full");
            return;
        }
        Validator[] validators1 = new Validator[2];
        validators1[0] = new EmailValidator();
        validators1[1] = new PasswordValidator();


        ValidatesDomayn userValidator = new UserValidator(validators1);
        CrudeService userCrudService = new UserService(userValidator,this);

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
    }*/
}
