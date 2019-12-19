package tcheck.registry;

import tcheck.employee.Employee;

import java.util.Date;

public class EmployeeDailyCheck {

    private Action action;
    private Date dateTime;
    private Employee employee;

    public EmployeeDailyCheck(Action action, Date dateTime, Employee employee) {
        this.action = action;
        this.dateTime = dateTime;
        this.employee = employee;
        this.employee.setSecondName("" + dateTime);
    }

    public Date getDateTime() {
        return dateTime;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Action getAction() {
        return action;
    }
}
