package com.jfk.classesuml;

import com.sun.org.apache.bcel.internal.generic.InstructionTargeter;

public class Time {
    private int hour;
    private int minute;
    private int second;


    public Time(int hour,int minute,int second){
        if(hour>=0 && hour <=23)
            this.hour=hour;
        else
            this.hour=0;
        if (minute >=0 && minute<=59)
            this.minute=minute;
        else
            this.minute=0;
        if (second>=0 && second<=59)
            this.second=second;
        else
            this.second=0;



    }
         public  int getHour(){
        return hour;
         }
         public  int getMinute(){
        return minute;
         }
         public int getSecond(){
        return second;
         }

     public  void  setHour(){
        this.hour=hour;
     }
     public  void setMinute(){
        this.minute=minute;
     }
     public void setSecond(){
        this.second=second;
     }
     public  void setTime(int hour,int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
     }

    @Override
    public String toString() {
     String HOUR="", MINUTE="", SECOND="";
     if (hour<10)
         HOUR+=("0"+hour);
     else
         HOUR+=hour;
        if (minute<10)
            MINUTE+=("0"+minute);
        else
            MINUTE+=minute;
        if (second<10)
            SECOND+=("0"+second);
        else
            SECOND+=second;
        return HOUR+":"+MINUTE+":"+SECOND;

    }
      public Time nexSecond(){
       Time t1;
       if (second+1<=59)
           t1=new Time (hour,minute,second+1);
       else
           if(minute+1<=59)
               t1=new Time (hour,minute+1,0);
           else
               t1=new Time (hour+1,0,0);
           return t1;
      }
    public Time previousSecond()
    {
        Time t1;
        if(second-1>=0)
            t1=new Time(hour,minute,second-1);
        else
        if(minute-1>=0)
            t1=new Time(hour,minute-1,59);
        else
        if(hour!=0)
            t1=new Time(hour-1,59,59);
        else
            t1=new Time(23,59,59);
        return t1;
    }


}
