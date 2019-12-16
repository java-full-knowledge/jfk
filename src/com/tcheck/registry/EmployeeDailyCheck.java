package com.tcheck.registry;

import com.tcheck.employee.Employee;

import java.time.LocalDateTime;

public class EmployeeDailyCheck {

    private Action action;
    private LocalDateTime dateTime;
    private Employee employee;

    public EmployeeDailyCheck(Action action, LocalDateTime dateTime, Employee employee) {
        this.action = action;
        this.dateTime = dateTime;
        this.employee = employee;
    }
}
