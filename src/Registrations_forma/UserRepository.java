package Registrations_forma;

public class UserRepository implements Repository {

    private int userSize;

    protected User[] users;

    public UserRepository(int size) {
        this.userSize = 0;
        users = new User[size];
    }

    @Override
    public void delete(String username) {
        if (users.length == 0) {
            System.out.println("Repository is empty...");
            return;
        }
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserName().equals(username)) {

                for (int j = i; j < users.length - 1; j++)
                    users[j] = users[j + 1];
                userSize--;
                return;
            }
        }
    }

    @Override
    public void save(User user) {
        if (userSize == users.length) {
            System.out.println("Repository is full...");
            return;
        }
        users[userSize++] = user;
    }

    @Override
    public User get() {
        return users[userSize];
    }

    @Override
    public int getUserSize() {
        return userSize;
    }

    @Override
    public String toString() {
        String  temp="";
        for (int i = 0; i <getUserSize() ; i++) {
            temp+=users[i].toString()+"\n";
        }
        return temp;
    }
}
