package com.jfk.classesuml;

public class Date_test {
    public static void main(String[] args) {
        Date testDate=new Date(5,11,2019);
        System.out.println(testDate);

        testDate.setDate(9,2,2020);
        System.out.println(testDate);
    }
}
