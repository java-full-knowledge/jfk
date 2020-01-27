package com.tanks.map;

public class Point {

    public static Point START_POINT = new Point(0, 0);

    public int x;
    public int y;

    public Point(int x, int y) {
        if (x == 0 && y == 0) {
            throw new InvalidPointException("0:0 point already allocated...");
        }
        this.x = x;
        this.y = y;
    }
}
