package com.tcheck;

import com.tcheck.employee.Employee;
import com.tcheck.registry.EmployeeDailyRegistry;

import java.time.LocalDateTime;

public final class TCheck {

    private EmployeeDailyRegistry[] dailyRegistry = new EmployeeDailyRegistry[31];
    private int currentDateIndex = 0;

    public void checkIn(Employee employee) {
        dailyRegistry[currentDateIndex].checkIn(employee);
    }


    public void checkOut(Employee employee) {
        dailyRegistry[currentDateIndex].checkOut(employee);
    }

    private void updateDate() {
        dailyRegistry[LocalDateTime.now().getDayOfMonth()] = new EmployeeDailyRegistry();
    }
}
