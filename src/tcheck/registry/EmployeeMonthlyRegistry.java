package tcheck.registry;

import tcheck.employee.Employee;

import java.io.IOException;
import java.util.Date;

public final class EmployeeMonthlyRegistry {

    private final EmployeeMonthlyCheck[] monthlyChecks = new EmployeeMonthlyCheck[31];
    private int currentDateIndex = 0;


    public void checkIn(Employee employee) throws IOException {

        if (currentDateIndex != 0 && monthlyChecks[currentDateIndex].getDate() != new Date().getDay()) {

            if (currentDateIndex + 1 == 31) {
                for (EmployeeMonthlyCheck emp : monthlyChecks)
                    emp = null;
                currentDateIndex = 0;
            } else
                monthlyChecks[currentDateIndex++] = new EmployeeMonthlyCheck();
        }

        if (currentDateIndex == 0 && monthlyChecks[currentDateIndex] == null)
            monthlyChecks[currentDateIndex] = new EmployeeMonthlyCheck();
        monthlyChecks[currentDateIndex].getDailyRegistry().checkIn(employee);


    }

    public void checkOut(Employee employee) throws IOException {

        if (currentDateIndex != 0 && monthlyChecks[currentDateIndex].getDate() != new Date().getDay()) {

            if (currentDateIndex + 1 == 31) {
                for (EmployeeMonthlyCheck emp : monthlyChecks)
                    emp = null;
                currentDateIndex = 0;
                monthlyChecks[currentDateIndex] = new EmployeeMonthlyCheck();
            } else
                monthlyChecks[currentDateIndex++] = new EmployeeMonthlyCheck();
        }
        monthlyChecks[currentDateIndex].getDailyRegistry().checkOut(employee);


    }

    public EmployeeMonthlyCheck[] getMonthlyChecks() {
        return monthlyChecks;
    }
}
