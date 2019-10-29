package Homework_28_10_19;

import static java.lang.System.out;

public class Time_Test {
    public static void main(String [] args)
    {
        Time time1=new Time(12,24,36);
        out.println(time1);
        time1.setTime(23,59,59);
        out.println(time1);
        time1=time1.nextSecond();
        out.println(time1);
        time1=time1.previousSecond();
        out.println(time1);
        time1=time1.previousSecond();
        out.println(time1);
    }
}
