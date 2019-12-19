package tcheck.registry;

import java.util.Date;

public class EmployeeMonthlyCheck {

    private int date;
    private final EmployeeDailyRegistry dailyRegistry;

    public EmployeeMonthlyCheck( ) {
        Date dat=new Date();
        this.date = dat.getDate();
        this.dailyRegistry = new EmployeeDailyRegistry();
    }

    public int getDate() {
        return date;
    }

    public EmployeeDailyRegistry getDailyRegistry() {
        return dailyRegistry;
    }

}
