package ExerciseClasses;


public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this(radius);
        this.color = color;
    }

    public double getRadius() {

        return (double) radius;
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

        return "Circle[radius = " + radius + ",color = " + color + "]";
    }

    public double getArea() {

        return radius * Math.PI;
    }

    public double Circumference() {

        return 2 * radius * Math.PI;
    }
}
