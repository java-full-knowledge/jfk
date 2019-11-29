package com.jfk.generics;

import com.jfk.userregistration.domain.User;

public class UserDataHolder extends DataHolder<User> {

    public UserDataHolder(User data) {
        super(data);
    }
}
