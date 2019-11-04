package Homework_01_11_19;

import Homework_28_10_19.Date;
import Homework_28_10_19.Time;

public class DateTime_Test {
    public static void main(String[] args) {

        DateTime date = new DateTime(Date.newDate(17, 2, 1993), Time.newTime(2, 4, 12));
        System.out.println(date);
    }
}
