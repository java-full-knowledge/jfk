package src.com.collection;

public class ApplicationClasses {


    public static void main(String[] args) {
        Point p1 = new Point(2,4);
        Point p2 = new Point(5, 6);
        Point copy = new Point(p1);
        System.out.println(p1.hashCode() + " : " + copy.hashCode());

    }


}
