package Registrations_forma;

import java.util.Arrays;
import java.util.Random;

public  class User {

    private String firstname;
    private String lastname;
    private String userName;
    private String password;
    private String [] phonenumbers;

    public User(String firstname, String lastname,  String password, String[] phonenumbers) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.userName = usernamegenerator();
        this.password = password;
        this.phonenumbers = phonenumbers;
    }
    private String usernamegenerator(){
        String temp="";
        Random r=new Random();
        return temp+=(firstname+lastname+r.nextInt(9)+r.nextInt(9));
    }
    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phonenumbers=" + Arrays.toString(phonenumbers) +
                '}';
    }
}
