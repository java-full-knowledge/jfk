package com.jfk.inheritance;

public class Manager extends Employee {

    private String responsibilities;


    public Manager(String responsibilities, float salary) {
        super(salary);
        this.responsibilities = responsibilities;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public float getSalary() {
        if (super.salary > 1_00_000f) {
            return 1_00_000f;
        }
        return super.salary;
    }
}
