package Registrations_forma;

public interface CrudService {


    public User read(String username);

    public void delete(User user);
}
