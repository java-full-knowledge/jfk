package com.jfk.UserRegistration1;

public class UserRepository implements Repository {

    User[] users= new User[10];

    public UserRepository(User[] users) {
        this.users = users;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void get(User user) {
    }

    @Override
    public boolean delete() {
        return false;
    }
}
