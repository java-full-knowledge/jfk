package com.jfk.UserRegistration1;

public interface CrudeService {

    User create(User user) ;
    User read(String password);
    void update(User user);
    boolean delete(User user);

}
