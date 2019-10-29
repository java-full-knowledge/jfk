package Homework_28_10_19;

import static java.lang.System.out;

public class InvoiceItem_Test {
    public static void main(String [] args)
    {
        InvoiceItem ptr=new InvoiceItem("Ap123465","ssss",123,12.5);
        out.println(ptr);
        out.println("ptr Total: "+ptr.getTotal());
        ptr.setUnitPrice(3.4);
        out.println(ptr);
    }
}
