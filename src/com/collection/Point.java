package src.com.collection;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point copyOf) {
        this.x = copyOf.x;
        this.y = copyOf.y;
    }

    public double distance(Point point) {
        return this.x + point.x;
    }

    public String toString() {
        return "x : " + x + " - y : " + y;
    }
}
