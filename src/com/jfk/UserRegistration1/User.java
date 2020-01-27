package com.jfk.UserRegistration1;

public class User {
    String firstname;
    String lastname;
    String username;
    String password;
    String confirmPassword;
    String phonenumber;

    public User(String firstname, String password, String confirmPassword) {
        this.firstname = firstname;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public User(String firstname, String lastname, String username, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.phonenumber = phonenumber;
    }
}
