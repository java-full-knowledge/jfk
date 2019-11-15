package Task_11_11_19;

class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}

class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" +getRadius()+",height="+height+",color="+getColor()+"]";
    }
}

public class Main_Circle {
    public static void main(String[] args) {

        Circle circle=new Circle(4,"sgdh");
        System.out.println(circle);
        Circle circle1=new Cylinder(3,"xfsfd",4);
        System.out.println(circle1);
    }
}
