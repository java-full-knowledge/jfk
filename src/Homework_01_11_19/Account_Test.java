package Homework_01_11_19;

import Homework_28_10_19.InvoiceItem;

public class Account_Test {
    public static void main(String[] args) {
        Homework_28_10_19.Employee employee = new Homework_28_10_19.Employee(214567, "Arman", "Torosyan", 100000);
        InvoiceItem invoiceItem1 = new InvoiceItem("Ap236578", "nuum1", 20, 410);
        InvoiceItem invoiceItem2 = new InvoiceItem("Ap568809", "nuum2", 15, 350);
        InvoiceItem invoiceItem3 = new InvoiceItem("An900012", "nuum3", 28, 255.5);
        InvoiceItem invoiceItem4 = new InvoiceItem("Ne002133", "nuum4", 2, 1500);

        InvoiceItem[] invoiceItems_arr = new InvoiceItem[]{invoiceItem1, invoiceItem2, invoiceItem3, invoiceItem4};

        Account account = new Account(employee, invoiceItems_arr);

        System.out.println(account);
    }


}
