package Task_15_11_19;

class Manager extends Employee {

    private String enterprises;

    public Manager(int id, String firstName, String lastName, int salary, String enterprises) {
        super(id, firstName, lastName, salary);
        this.enterprises = enterprises;
    }

    public String getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(String enterprises) {
        this.enterprises = enterprises;
    }

    @Override
    void getAnnulaSalary() {
        System.out.println("Manager Annul Salary:" + (12 * getSalary()));
    }

    @Override
    public String toString() {
        return "Manager\n" + super.toString() +
                "\nenterprises='" + enterprises + '\'';
    }
}
