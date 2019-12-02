package com.jfk.generics;

import com.jfk.userregistration.domain.PhoneNumber;
import com.jfk.userregistration.domain.User;

import java.util.Arrays;

public class GenericApplication {

    public static void main(String[] args) {
        DataHolder<PhoneNumber> holder = new DataHolder<>(new PhoneNumber("dd"));
        holder.getData();
        DataHolder<User> userHolder = new DataHolder<>(new User());
        UserDataHolder userDataHolder = new UserDataHolder(new User());
        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 5;
        array[2] = 4;
        Integer[] sort = DataHolder.sort(array);
        System.out.println(Arrays.toString(sort));
    }
}
