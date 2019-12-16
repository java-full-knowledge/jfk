package com.tcheck.parameters;

public class EmployeeParameters {

    private String name;
    private String secondName;
    private String departmentName;

    public EmployeeParameters(String name, String secondName, String departmentName) {
        this.name = name;
        this.secondName = secondName;
        this.departmentName = departmentName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
