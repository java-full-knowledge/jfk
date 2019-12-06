package UserRegistration.checks;

import UserRegistration.domein.User;
import UserRegistration.enums.Message.ValidationMessage;
import UserRegistration.repository.UserRepository;

public class CheckUsername {

    private UserRepository userRepository;

    public CheckUsername(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    //stugume e,vor repository-um ka nman usernamne-ov User
    public boolean uniqueUsername(User user) {
        for (User dom : userRepository.getUsers()) {
            if (dom != null)
                if (user.getUserName().equals(dom.getUserName())) {
                    System.out.println(ValidationMessage.username.getMessage());
                    return true;
                }
        }
        return false;
    }
}
