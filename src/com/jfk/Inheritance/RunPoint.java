package com.jfk.Inheritance;

public class RunPoint {
    public static void main(String[] args) {
        Point point=new Point(10,30);
        System.out.println(point);

        MovablePoint movablePoint=new MovablePoint(33,50,40,45);
        System.out.println(movablePoint);
        System.out.println((movablePoint.movie()));

    }
}
