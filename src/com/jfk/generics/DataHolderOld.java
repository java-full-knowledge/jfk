package com.jfk.generics;

import com.jfk.userregistration.domain.PhoneNumber;
import com.jfk.userregistration.domain.User;

public class DataHolderOld {

    private Object data;

    public DataHolderOld(Object ob) {
        data = ob;
    }

    public Object getData() {
        return data;
    }

    public static void main(String[] args) {
        DataHolderOld instance = new DataHolderOld(new PhoneNumber("sss"));
        Object data = instance.getData();
        PhoneNumber phoneNumber = (PhoneNumber) data;
        phoneNumber.getNumber();
    }

}
