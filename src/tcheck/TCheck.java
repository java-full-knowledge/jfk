package tcheck;

import tcheck.employee.Employee;
import tcheck.registry.EmployeeDailyCheck;
import tcheck.registry.EmployeeDailyRegistry;
import tcheck.registry.EmployeeMonthlyCheck;
import tcheck.registry.EmployeeMonthlyRegistry;

import java.io.IOException;

public final class TCheck {

    private EmployeeMonthlyRegistry employeeMonthlyRegistry;

    public TCheck() {
        this.employeeMonthlyRegistry = new EmployeeMonthlyRegistry();
    }

    public void checkIn(Employee employee) throws IOException {
        employeeMonthlyRegistry.checkIn(employee);
    }

    public void checkOut(Employee employee) throws IOException {
        employeeMonthlyRegistry.checkOut(employee);
    }

    public void info(Employee employee) {
        System.out.println(employee.getName());
        EmployeeMonthlyCheck[] monthlyChecks = employeeMonthlyRegistry.getMonthlyChecks();
        for (EmployeeMonthlyCheck em : monthlyChecks) {
            if (em != null) {
                EmployeeDailyRegistry employeeDailyRegistry = em.getDailyRegistry();
                EmployeeDailyCheck[] checkIns = employeeDailyRegistry.getCheckIns();
                EmployeeDailyCheck[] checkOuts = employeeDailyRegistry.getCheckOuts();
                for (EmployeeDailyCheck dailyCheck : checkIns) {
                    if (dailyCheck != null && employee.getId() == dailyCheck.getEmployee().getId())
                        System.out.println(dailyCheck.getAction() + " " + dailyCheck.getDateTime());
                }
                for (EmployeeDailyCheck dailyCheck : checkOuts) {
                    if (dailyCheck != null && employee.getId() == dailyCheck.getEmployee().getId())
                        System.out.println(dailyCheck.getAction() + " " + dailyCheck.getDateTime());
                }
            }
        }
    }


}
