package Registrations_forma;

public class UserService implements CrudService {

    private UserRepository userRepository;

    public UserService(int size) {
        this.userRepository = new UserRepository(size);
    }


    private boolean validationPassword(User user) {
        if (this.userRepository.getUserSize() == 0)
            return false;
        for (int i = 0; i < this.userRepository.getUserSize() ; i++) {
            if (userRepository.users[i].getPassword().equals(user.getPassword()))
                return true;
        }
        return false;
    }

    public void save(User user) {
        if (validationPassword(user)==false)
            this.userRepository.save(user);
        else
            System.out.println("validationPassword");
    }

    @Override
    public String toString() {
        return userRepository.toString();
    }

    @Override
    public User read(String username) {
        for(User us : userRepository.users){
            if(us.getUserName().equals(username))
                return us;
        }
        return null;
    }

    @Override
    public void delete(User user) {
       this.userRepository.delete(user.getUserName());
    }
}
