package com.jfk.inheritance;

import java.util.Arrays;
import java.util.Enumeration;

public class Application {


    public static void main(String[] args) throws InterruptedException {
        /*Employee employee = new Employee();
        Programmer programmer = new Programmer();
        Manager manager = new Manager();

        Employee[] objects = new Employee[3];

        objects[0] = employee;
        objects[1] = programmer;
        objects[2] = manager;

        for (int i = 0; i < 3; i++) {
            System.out.println(objects[i].getSalary());
        }*/
        ApiRequestService [] requestServices = new ApiRequestService[2];

        requestServices[0] = new DatabaseContentRequestService();
        requestServices[1] = new FileSystemContentRequestService();
        requestServices[1].send();
        WeekDays day = WeekDays.SUN;

        System.out.println(WeekDays.SUN.name());
        System.out.println(Arrays.toString(WeekDays.values()));
        System.out.println(Arrays.toString(WeekDay.values()));

        System.out.println(WeekDay.MON.name());
        PhoneCodes found = PhoneCodes.findByCountryName("georgia");
        if (found != null) {
            System.out.println(found.getCountryCode());
        } else {
            System.out.println("NOT FOUND");
        }
    }
}


























