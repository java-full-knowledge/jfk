package com.jfk.inheritance;

public class Employee {

    protected float salary;

    public Employee(float salary) {
        this.salary = salary;
    }
    public Employee() {

    }
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
