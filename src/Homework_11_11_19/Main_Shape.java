package Homework_11_11_19;

class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}

class Circle1 extends Shape {
    private double radius = 1.0;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                "radius=" + radius +
                '}';
    }
}

class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
    public  double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +"color='" + getColor() + '\'' +
                ", filled=" + isFilled()+
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }

    public Square(String color, boolean filled,double side) {
        super(color, filled,side,side);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class Main_Shape {
    public static void main(String[] args) {

    Shape shape=new Shape("fff",true);
        System.out.println(shape);
        Circle1 circle1=new Circle1("adsd",false,3);
        System.out.println(circle1);
        Rectangle rectangle=new Rectangle("hhh",true,2,4);
        System.out.println(rectangle);
        Square square=new Square("sd",false,5);
        System.out.println(square);
    }
}
