package com.jfk.bankaccountsystem;

import java.util.function.Predicate;

public class AgePredicate implements Predicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.age < 50;
    }
}
