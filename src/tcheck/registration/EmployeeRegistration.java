package tcheck.registration;

import tcheck.employee.Departament;
import tcheck.employee.Employee;
import tcheck.exeption.InvalidDepartamentExeption;
import tcheck.exeption.InvalidIdExeption;
import tcheck.parameters.EmployeeParameters;

public final class EmployeeRegistration {

    private Employee[] employees = new Employee[100];
    private int currentemployee = 0;

    public Employee register(EmployeeParameters parameters) throws InvalidDepartamentExeption {
        //create and save employee corresponding parameters.
        Employee employee = new Employee();
        employee.setId(currentemployee);
        employee.setName(parameters.getName());
        employee.setSalary(parameters.getSalary());
        employee.setSecondName(parameters.getSecondName());

        Departament[] departaments = Departament.values();
        boolean t = false;
        for (Departament dep : departaments)
            if (dep.getDepartmentName().equalsIgnoreCase(parameters.getDepartament())) {
                employee.setDepartament(dep);
                t = true;
            }
        if (t == false)
            throw new InvalidDepartamentExeption();
        employees[currentemployee++] = employee;
        return employee;

    }

    public Employee findById(int id) throws InvalidIdExeption {

        for (Employee employee : employees)
            if (employee != null && employee.getId() == id)
                return employee;
        throw new InvalidIdExeption();
    }
}
