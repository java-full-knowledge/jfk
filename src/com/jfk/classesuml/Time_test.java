package com.jfk.classesuml;

public class Time_test {
    public static void main(String[] args) {
        Time jam=new Time(2,4,23);
        System.out.println(jam);

        jam.setTime(1,5,3);
        System.out.println(jam);

        jam=jam.nexSecond();
        System.out.println(jam);
        jam=jam.previousSecond();
        System.out.println(jam);
    }
}
