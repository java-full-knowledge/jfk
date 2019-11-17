package com.jfk;

public class Account_test {

        public static void main(String [] args) {
Account test1 = new Account("dhdh","ssjjs");
            System.out.println(test1);
Account test2 = new Account("ddhhs", "dhdhd",12);
            System.out.println(test2);
            System.out.println(test1.GetID());
            System.out.println(test1.GetBalanc());
            System.out.println(test1.GetName());
        }

}
