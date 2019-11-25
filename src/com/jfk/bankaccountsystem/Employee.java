package com.jfk.bankaccountsystem;

public class Employee extends AbstractBankEntity {

    public Employee(int age) {
        this.age = age;
    }
    @Override
    public String tableName() {
        return "EMPLOYEE_TABLE";
    }
}
