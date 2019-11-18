package Homework_15_11_19;

abstract class Employee extends Person {

    private int id;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.id = id;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    abstract void getAnnulaSalary();

    @Override
    public String toString() {
        return  super.toString()+"\nid=" + id +
                ",\nsalary=" + salary ;
    }
}
