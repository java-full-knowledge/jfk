package com.jfk.generics;

import com.jfk.userregistration.domain.PhoneNumber;
import com.jfk.userregistration.domain.User;

public class GenericApplication {

    public static void main(String[] args) {
        DataHolder<PhoneNumber> holder = new DataHolder<>(new PhoneNumber("dd"));
        DataHolder<User> userHolder = new DataHolder<>(new User());
        UserDataHolder userDataHolder = new UserDataHolder(new User());
    }
}
