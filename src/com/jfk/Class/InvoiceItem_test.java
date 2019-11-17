package com.jfk.Class;

import com.jfk.InvoiceItem;

public class InvoiceItem_test {


    public static void main(String[] args) {
        InvoiceItem per = new InvoiceItem("dhdjs","ddghs", 12,2.0);
        System.out.println(per);
        System.out.println(per.getDesc());
        System.out.println(per.getId());
        System.out.println(per.getTotal());
        System.out.println(per.getqty());
    }
}
