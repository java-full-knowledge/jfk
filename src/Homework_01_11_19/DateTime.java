package Homework_01_11_19;

import Homework_28_10_19.Date;
import Homework_28_10_19.Time;

public class DateTime {
    private Date date;
    private Time time;

    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public Date getDate() {
        return this.date;
    }

    public Time getTime() {
        return this.time;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return date.toString() + "  " + time.toString();
    }
}
