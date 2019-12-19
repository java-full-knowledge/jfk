package tcheck.employee;

public enum Departament {

    DEVELOPMENT("development"), MARKETING("marketing"), HR("human resource");
    private String departmentName;

    private Departament(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
