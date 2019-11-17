package com.jfk;

public class App_employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;

    public App_employee(int ID, String firstName, String lastName, int salary) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

public String getName(){
        return firstName + " "+ lastName;
}
public int getSalary(){
        return salary;
}
public void setSalary(int Salary){
        this.salary = salary;
}
public int getAnnualSalary(){
        return 12 * salary;
}
public int raiseSalary(int percent){
    return salary+=(salary*percent)/100;
}

    @Override
    public String toString() {
        return "Employee [id="+ID+",name="+firstName+" "+lastName+",salary="+salary+"]";
    }
}
