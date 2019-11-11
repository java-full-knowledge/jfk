package com.jfk.inheritance;

public class Application {


    public static void main(String[] args) throws InterruptedException {
        Employee employee = new Employee();
        Programmer programmer = new Programmer();
        Manager manager = new Manager();

        Employee[] objects = new Employee[3];

        objects[0] = employee;
        objects[1] = programmer;
        objects[2] = manager;

        for (int i = 0; i < 3; i++) {
            System.out.println(objects[i].getSalary());
        }
    }
}
