package Task_01_11_19;

import ExerciseClasses.InvoiceItem;

public class Account {
    private ExerciseClasses.Employee employee;
    private InvoiceItem[] invoiceItems;

    public Account(ExerciseClasses.Employee employee, InvoiceItem[] invoiceItems) {
        this.employee = employee;
        this.invoiceItems = invoiceItems;
    }

    public ExerciseClasses.Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(ExerciseClasses.Employee employee) {
        this.employee = employee;
    }

    public InvoiceItem[] getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(InvoiceItem[] invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    @Override
    public String toString() {
        String temp = "", ptr = "";
        temp += employee.toString() + "\n" + "\n";
        for (InvoiceItem in : invoiceItems) {
            temp += in.toString() + "\n";
        }
        return temp;
    }
}
