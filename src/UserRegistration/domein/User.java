package UserRegistration.domein;

public class User extends Domain {

    private String firstname;
    private String lastname;
    private String email;
    private String userName;
    private String password;


    public User(String firstname, String lastname, String email, String userName, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.removetime = null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id= '" + id + '\'' +
                ",firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", removetime=" + removetime +
                '}';
    }
}
