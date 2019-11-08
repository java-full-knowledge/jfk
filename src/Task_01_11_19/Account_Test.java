package Task_01_11_19;

import ExerciseClasses.InvoiceItem;

public class Account_Test {
    public static void main(String[] args) {
        ExerciseClasses.Employee employee = new ExerciseClasses.Employee(123456, "ANNA", "SAHAKYAN", 500);
        InvoiceItem invoiceItem1 = new InvoiceItem("AA1111", "nuum1", 15, 500);
        InvoiceItem invoiceItem2 = new InvoiceItem("AA2222", "nuum2", 10, 700);
        InvoiceItem invoiceItem3 = new InvoiceItem("AA3333", "nuum3", 20, 800);

        InvoiceItem[] invoiceItemsArray = new InvoiceItem[]{invoiceItem1, invoiceItem2, invoiceItem3};

        Account account = new Account(employee, invoiceItemsArray);

        System.out.println(account);
    }


}
