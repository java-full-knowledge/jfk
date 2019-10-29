package Homework_28_10_19;
import static java.lang.Math.*;
public class Circle {
    private double radius=1;
    private String color="red";

    public Circle(){};
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius,String color)
    {
        this(radius);
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[radius="+radius+",color="+color+"]";
    }
    public double getArea()
    {
        return radius*radius*PI;
    }
    public double Circumference()
    {
        return 2*radius*PI;
    }
}
