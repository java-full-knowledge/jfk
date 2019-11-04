package Homework_01_11_19;

import Homework_28_10_19.InvoiceItem;

public class Account {
    private  Homework_28_10_19.Employee employee;
    private InvoiceItem [] invoiceItems;

    public Account( Homework_28_10_19.Employee employee, InvoiceItem[] invoiceItems) {
        this.employee = employee;
        this.invoiceItems = invoiceItems;
    }

    public  Homework_28_10_19.Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee( Homework_28_10_19.Employee employee) {
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
        String temp="",ptr="";
        temp+=employee.toString()+"\n"+"\n";
        for(InvoiceItem in:invoiceItems)
            temp+=in.toString()+"\n";
        return  temp;
    }
}
