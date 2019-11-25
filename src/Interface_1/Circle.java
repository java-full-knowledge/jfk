package Interface_1;

public class Circle implements GeometricObject {

    protected double radius = 1.0;

    protected Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return (2 * Math.PI * radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
