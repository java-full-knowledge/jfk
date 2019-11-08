package Task_01_11_19;

class Bank {
    private String name;

    Bank(String name) {
        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

public class Association {
    public static void main(String[] args) {
        Bank bank = new Bank("INECOBANK");
        Employee emp = new Employee("MARINA");

        System.out.println(emp.getEmployeeName() +
                " is employee off " + bank.getBankName());
    }
}