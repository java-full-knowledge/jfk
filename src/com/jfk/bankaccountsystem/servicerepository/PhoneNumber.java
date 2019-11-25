package com.jfk.bankaccountsystem.servicerepository;

public class PhoneNumber extends Entity {

    private String number;

    public PhoneNumber(int id, String number) {
        super(id);
        this.number = number;
    }

    @Override
    public String tableName() {
        return "phone_numer";
    }

    @Override
    public int id() {
        return super.id;
    }
}
