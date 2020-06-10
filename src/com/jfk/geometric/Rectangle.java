package src.com.jfk.geometric;

public class Rectangle {

    private int length;
    private int width;
    private Coordinate coordinate;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.coordinate = new Coordinate(10, 20);
    }

    public int length() {
        return this.length;
    }

    public int width() {
        return this.width;
    }

    public Coordinate coordinate() {
        return new Coordinate(this.coordinate.getX(), this.coordinate.getY());
    }

    static long calculate(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(1,2);
        System.out.println(rectangle.coordinate().getX());
        rectangle.coordinate().setX(200);
        System.out.println(rectangle.coordinate().getX());

    }

    public String toString() {
        return "{length = " + this.length + ", width = " + this.width + "}";
    }
}
