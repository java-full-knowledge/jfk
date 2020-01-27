package com.jfk.userregistration2.domain;

public class Phonenumber extends domain{
    private String number;

    public Phonenumber(String number) {

        this.number = number;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phonenumber="+number;
    }
}
