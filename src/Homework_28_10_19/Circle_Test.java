package Homework_28_10_19;
import static java.lang.System.*;
public class Circle_Test {
    public static  void main(String [] args)
    {
        Circle circle1=new Circle();
        Circle circle2=new Circle(4);
        Circle circle3=new Circle(3,"green");
        out.println(circle1);
        out.println(circle2);
        out.println(circle3);
        circle1.setRadius(2);
        circle2.setColor("yellow");
        out.println(circle1);
        out.println(circle2);
        out.println(circle3);
        out.println("circle1 Area="+circle1.getArea());
        out.println("circle2 Area="+circle2.getArea());
        out.println("circle3 Area="+circle3.getArea());
        out.println("circle1 Circumference="+circle1.getArea());
        out.println("circle2 Circumference="+circle2.getArea());
        out.println("circle3 Circumference="+circle3.getArea());

    }
}
