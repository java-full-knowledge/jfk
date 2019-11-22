package src.com.jfk.geometric;

public class GeometricManipulations {


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(100, 200);
        Volume volume = new Volume(30, rectangle);
//        Volume second = new Volume(30, 10, 20);
//        Rectangle top = second.topRectangle();
//        System.out.println(top);
        System.out.println(volume.topRectangle());
        System.out.println(volume.topRectangle());

    }
}
