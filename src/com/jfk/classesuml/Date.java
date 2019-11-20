package com.jfk.classesuml;

import com.sun.deploy.security.SelectableSecurityManager;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (day >= 1 && day <= 31)
            this.day = day;
        else
            this.day = 1;
        if (month >= 1 && month <= 12)
            this.month = month;
        else
            this.month = 1;
        if (year >= 1900 && year <= 9999)
            this.year = year;
        else
            this.year = 1900;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day>=1 && day<=31)
        this.day = day;
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12)
        this.month = month;

    }

    public void setYear(int year) {
        if(year>=1900 && year<=9999)
            this.year = year;

    }

    public void setDate(int day, int month, int year) {
        if(day>=1 && day<=31)
        this.day = day;
        if(month>=1 && month<=12)
        this.month = month;
        if(year>=1900 && year<=9999)
        this.year = year;

    }

    @Override
    public String toString() {
        String Day="", Month="";
        if(day<10)
          Day+=("0"+day);
        else
            Day+=day;
        if(month<10)
            Month+=("0"+month);
        else Month+=month;

        return Day+"/"+Month+"/"+year;



    }
}





