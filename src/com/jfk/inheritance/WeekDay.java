package com.jfk.inheritance;

public final class WeekDay {
    private final int ordinal;
    private final String name;

    public static WeekDay SUN = new WeekDay(0, "SUN");
    public static WeekDay MON = new WeekDay(1, "MON");
    public static WeekDay THU = new WeekDay(2, "THU");
    public static WeekDay WEN = new WeekDay(3, "WEN");

    private WeekDay(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }

    public int getOrdinal() {
        return this.ordinal;
    }

    public String name() {
        return this.name;
    }

    public static WeekDay[] values() {
        WeekDay [] days = new WeekDay[4];
        days[0] = SUN;
        days[1] = MON;
        days[2] = THU;
        days[3] = WEN;
        return days;
    }

    public String toString() {
        return name;
    }
}
