package com.jfk.class;

public class Rectangle {

    private float length = 1.0f;
    private float width = 1.0f;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.5f, 8.5f);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }

    public Rectangle(){}

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getlength(){
        return this.length;
    }

    public void setLenght(float length){
        this.length = length;
    }

    public float getWidth(){
        return this.width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }

    public String toString(){
        return "Rectangle[lenght = " + this.length + ", width = " + this.width + "]";
    }
}