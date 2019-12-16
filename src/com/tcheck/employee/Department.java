package com.tcheck.employee;

public enum Department {

    DEVELOPMENT("development"), MARKETING("marketing"), HR("human resource");

    private String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String departmentName() {
        return this.departmentName;
    }
}
