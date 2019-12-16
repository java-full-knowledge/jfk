package com.tcheck.employee;

public class Employee {

    private int id;
    private String name;
    private String secondName;
    private Department department;

    public Employee(String name, String secondName, Department department) {
        this.name = name;
        this.secondName = secondName;
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }
}
