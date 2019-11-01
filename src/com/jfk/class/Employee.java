package com.jfk.class;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public static void main(String[] args) {
        Employee employee = new Employee(14, "Stepan", "Ohanyan", 50000);
        employee.raiseSalary(10);
        System.out.println(employee.toString());
    }

    public Main(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return this.salary * 12;
    }

    public int raiseSalary(int percent){
        int raisedSalary = this.salary + (this.salary * percent) / 100;
        this.salary = raisedSalary;

        return this.salary;
    }

    public String toString(){
        return "Employee[id = " + this.id + ", name = " + this.firstName + " " + this.lastName + ", salaray = " + this.salary + "]";
    }
}