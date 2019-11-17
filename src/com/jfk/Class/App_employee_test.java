package com.jfk.Class;

        import com.jfk.App_employee;

public class App_employee_test {

    public static void main(String[] args) {
        App_employee person = new App_employee(12,"dhdg", "dhdj",15);
        System.out.println(person);
        System.out.println(person.getID());
        System.out.println(person.getName());

    }
}
