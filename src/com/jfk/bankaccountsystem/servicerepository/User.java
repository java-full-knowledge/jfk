package com.jfk.bankaccountsystem.servicerepository;

public class User extends Entity {

    private String name;
    private PhoneNumber[] numbers;


    public User(int id, String name, PhoneNumber[] numbers) {
        super(id);
        this.name = name;
        this.numbers = numbers;
    }

    @Override
    public String tableName() {
        return "users";
    }

    @Override
    public int id() {
        return super.id;
    }
}
