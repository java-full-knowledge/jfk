package Homework_28_10_19;

import static java.lang.System.out;

public class Rectangle_Test {
    public static void main(String [] args)
    {
        Rectangle rec = new Rectangle(3,4);
        out.println(rec);
        out.println("Area: "+rec.getArea());
        out.println("Perimeter: "+rec.getPerimeter());
    }
}
