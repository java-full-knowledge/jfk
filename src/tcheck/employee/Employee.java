package tcheck.employee;

public class Employee {

    private int id;
    private String name;
    private String secondName;
    private Departament departament;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String secondName, Departament departament, int salary) {
        this.name = name;
        this.secondName = secondName;
        this.departament = departament;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Departament getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", departament=" + departament +
                ", salary=" + salary +
                '}';
    }
}
