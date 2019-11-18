package Task_15_11_19;

class Programer extends Employee {

    private String languege;

    Programer(String firstName, String lastName, int id, int salary, String languege) {
        super(id, firstName, lastName, salary);
        this.languege = languege;
    }

    public String getLanguege() {
        return languege;
    }

    public void setLanguege(String languege) {
        this.languege = languege;
    }

    @Override
    public void getAnnulaSalary() {
        System.out.println("Programer Annul Salary:" + (12 * getSalary()));
    }

    @Override
    public String toString() {
        return "Programer\n" + super.toString() +
                "\nlanguege='" + languege + '\'';
    }
}
