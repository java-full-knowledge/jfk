package tcheck.parameters;

public class EmployeeParameters {

    private String name;
    private String secondName;
    private String departament;
    private int salary;

    public EmployeeParameters(String name, String secondName, String departament, int salary) {
        this.name = name;
        this.secondName = secondName;
        this.departament = departament;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }


}

