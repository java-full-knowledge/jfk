package com.jfk.InterfacesOthers.Movable;

public class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint topleft;
    private MovablePoint bottomright;


    public MovableRectangle(int x1, int y1, int xSpeed, int ySpeed) {
        super(x1, y1, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
