package com.jfk.InterfacesOthers.Movable;

public class MovablePoint implements Movable {
    private  int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    @Override
    public void moveUp() {
        System.out.println("moving up");
    }

    @Override
    public void moveDown() {
        System.out.println("moving down");
    }

    @Override
    public void moveLeft() {
        System.out.println("moving left");

    }

    @Override
    public void moveRight() {
        System.out.println("moving right");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
