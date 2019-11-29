package Registrations_forma;

public interface Repository {

    public void delete(String username);

    public void save(User user);

    public User get();

    public int getUserSize();
}
