
package src.com.jfk.character;

public abstract class Man {

    String name;
    int age;
    String designation;
    double salary;

    public Man(String name) {
        this.name = name;
    }

    public void ManAge(int ManAge) {
        age = ManAge;
    }

    public void ManDesignation(String ManDesig) {
        designation = ManDesig;
    }

    public void ManSalary(double ManSalary) {
        salary = ManSalary;
    }

    public void printMan() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);
    }
}



