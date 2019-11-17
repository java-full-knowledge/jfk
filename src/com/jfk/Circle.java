package com.jfk;
import static java.lang.Math.PI;
public class Circle {
    private double radius =1.0;
    private String color = "Red";
public Circle(){
}
public Circle( double radius){
    this.radius = radius;

}
public Circle( double radius, String color){
    this.radius= radius;
    this.color = color;
}
public double getRadius( ){

    return radius;
}
public String getColor(){
    return color;

}
public void setRadius( double radius){
   this.radius = radius;
}
public void  setColor(String color){
    this.color = color;
}


    @Override
    public String toString() {
        return " Circle[ radius = +circle ]";
    }
    public double getArea(){
return radius * radius * PI;
    }
}

