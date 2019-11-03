package date_time;

public class time {
    private int hour;
    private int minute;
    private int second;

    public time(int hour , int minute , int second) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
    }
        public int gethour() {
            return hour;
        }

    public int getminute() {
        return minute;
    }

    public int getsecond() {
        return second;
    }

    public void sethour(int hour) {
        if (hour >= 0 && hour <= 23)
        this.hour = hour;
    }

    public void setminute(int minute) {
        if (minute >= 0 && minute <= 59)
        this.minute = minute;
    }

    public void setsecond(int second) {
        if (second >= 0 && second <= 59)
        this.second = second;
    }

    public void settime(int hour , int minute , int second) {
        if (hour >= 0 && hour <= 23)
            this.hour = hour;
        if (minute >= 0 && minute <= 59)
            this.minute = minute;
        if (second >= 0 && second <= 59)
            this.second = second;
    }
    public String toString() {
        String Minute="",Second="",Hour="";
        if(minute<10)
            Minute+=("0"+minute);
        else
            Minute+=minute;
        if(second<10)
            Second+=("0"+second);
        else
            Second+=second;
        if(hour<10)
            Hour+=("0"+hour);
        else
            Hour+=hour;
        return (Hour+":"+Minute+":"+Second);
    }
    public time nextSecond()
    {
        time time1;
        if(second+1<=59)
            time1=new time(hour,minute,second+1);
        else
        if(minute+1<=59)
            time1=new time(hour,minute+1,0);
        else
            time1=new time(hour+1,0,0);
        return time1;

    }
    public time previousSecond()
    {
        time time1;
        if(second-1>=0)
            time1=new time(hour,minute,second-1);
        else
        if(minute-1>=0)
            time1=new time(hour,minute-1,59);
        else
        if(hour!=0)
            time1=new time(hour-1,59,59);
        else
            time1=new time(23,59,59);
        return time1;
    }
}


