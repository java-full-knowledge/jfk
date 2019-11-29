package com.jfk.userregistration.domain;

import java.util.Arrays;

public class User extends Domain {

    private String name;
    private String username;
    private String password;
    private String email;
    private PhoneNumber[] numbers;


    public User(String name, String username, String password, String email, PhoneNumber[] numbers) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.numbers = numbers;
    }
    public User(String name, String username, String password, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PhoneNumber[] getNumbers() {
        return numbers;
    }

    public void setNumbers(PhoneNumber[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
