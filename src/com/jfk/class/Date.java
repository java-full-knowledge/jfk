package com.jfk.class;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public static void main(String[] args) {
        Time time = new Time(23, 59, 59);
        System.out.println(time.toString());
        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());
    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        String hourWithZero = this.hour < 10 ? "0" + this.hour : "" + this.hour;
        String minuteWithZero = this.minute < 10 ? "0" + this.minute : "" + this.minute;
        String secondWithZero = this.second < 10 ? "0" + this.second : "" + this.second;

        return hourWithZero + ":" + minuteWithZero + ":" + secondWithZero;

    }

    public Time nextSecond(){
        this.second++;
        if (this.second > 59) {
            this.second = 0;
            this.minute++;
            if(this.minute > 59) {
                this.minute = 0;
                this.hour++;
                if(this.hour > 23) {
                    this.hour = 0;
                }
            }
        }

        return this;
    }

    public Time previousSecond(){
        this.second--;
        if(this.second < 0) {
            this.second = 59;
            this.minute--;
            if(this.minute < 0) {
                this.minute = 59;
                this.hour--;
                if(this.hour < 0) {
                    this.hour = 23;
                }
            }
        }

        return this;
    }
}