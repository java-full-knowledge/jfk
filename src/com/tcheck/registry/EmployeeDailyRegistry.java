package com.tcheck.registry;

import com.tcheck.employee.Employee;

import java.time.LocalDateTime;

public class EmployeeDailyRegistry {


    private EmployeeDailyCheck[] checkIns = new EmployeeDailyCheck[100];
    private int currentCheckInNumber = 0;
    private EmployeeDailyCheck[] checkOuts = new EmployeeDailyCheck[100];
    private int currentCheckOutNumber = 0;

    public void checkIn(Employee employee) {
        checkIns[currentCheckInNumber] = new EmployeeDailyCheck(Action.CHECK_IN, LocalDateTime.now(), employee);
        currentCheckInNumber++;
    }

    public void checkOut(Employee employee) {
        checkIns[currentCheckOutNumber] = new EmployeeDailyCheck(Action.CHECK_OUT, LocalDateTime.now(), employee);
        currentCheckOutNumber++;
    }

}
