package com.jfk;

import org.graalvm.compiler.replacements.JavacBug;

import java.time.Year;

public class Date_java {
    private int day;
    private int month;
    private int year;
    public Date_java( int day, int month, int year ) {
        if (day >= 1 && day <= 31)
            this.day = day;
        else {
            this.day = 1;

        }
        if (month >= 1 && month <= 12)
            this.month = month;
        else {
            this.month = 1;
        }
        if (year >= 1900 && year <= 9999)
            this.year = year;
        else {
            this.year = 1900;
        }
    }
        public int getDay(){
                return day;
        }
            public int getMonth(){
                return month;
        }
        public int getYear(){
        return year;
        }
        public void setDay( int day){
        this.day = day;
        }
        public void setMonth( int month){
        this.month = month;
        }
        public void setYear( int year){
        this.year = year;
        }
        public void setDate( int day, int month, int year){
            if (day >= 1 && day <= 31)
                this.day = day;
            if (month >= 1 && month <= 12)
                this.month = month;
            if (year >= 1900 && year <= 9999)
                this.year = year;

        }
    @JavacBug
        public  String toString(){

                String Day="",Month="";
                if(day<10)
                    Day+=("0"+day);
                else
                    Day+=day;
                if(month<10)
                    Month+=("0"+month);
                else
                    Month+=month;
                return (Day+"/"+Month+"/"+year);
            }
        }


