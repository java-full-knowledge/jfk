package Homework_01_11_19;

import Homework_28_10_19.Rectangle;

public class Volume {
    private int height;
    private Rectangle rectangle;

    Volume(int height, Rectangle rectangle) {
        this.height = height;
        this.rectangle = rectangle;
    }
    //caval
    public double vol() {
        return rectangle.getArea() * height * (1 / 3);
    }

    @Override
    public String toString() {
        return "Volume:["+rectangle.toString()+"height"+height;
    }
}
