package UserRegistration.dto;

public final class UserCreateRequestDto {

    private String firstname;
    private String lastname;
    private String email;
    private String userName;
    private String password1;
    private String password2;

    public UserCreateRequestDto(String firstname, String lastname,String email, String userName, String password1, String password2) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email=email;
        this.userName = userName;
        this.password1 = password1;
        this.password2 = password2;
    }

    public UserCreateRequestDto(){};

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
}
