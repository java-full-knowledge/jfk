package Task_04_11_19;

class Shape {
    private double volume;

    Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return "Volume:" + getVolume() + ";";
    }
}

class SolidOFRevolution extends Shape {
    private double radius;

    SolidOFRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius:" + getRadius();
    }
}

class Pyramid extends Shape {
    private double s = 1;
    private double h = 1;

    Pyramid(double s, double h) {
        super((s * h) / 3);
        this.s = s;
        this.h = h;
    }

    @Override
    public String toString() {
        return "It's a Pyramid:\n" + "V = 1 / 3 * s * h ;\n" + super.toString();
    }
}

/*xoranard*/
class Square extends Shape {
    private double length;

    Square(double length) {
        super(Math.pow(length, 3));
        this.length = length;
    }

    @Override
    public String toString() {
        return "It's a Square:\n" + "V = a * a * a ;\n" + super.toString();
    }
}

class Cylinder extends SolidOFRevolution {
    private double height;

    Cylinder(double radius, double height) {
        super(Math.PI * Math.pow(radius, 2) * height, radius);
        this.height = height;
    }

    @Override
    public String toString() {
        return "It's a Cylinder:\n" + "V = PI * R ^ 2 * h\n" + super.toString();
    }
}

class Ball extends SolidOFRevolution {

    Ball(double radius) {
        super((4 / 3) * Math.PI * Math.pow(radius, 3), radius);
    }

    @Override
    public String toString() {
        return "It's a Ball:\n" + "V = 4/3 * PI * R ^ 3;\n" + super.toString();
    }
}

class Box extends Shape {
    private Shape[] arr = new Shape[50];
    private int index = 0;
    private double available;

    public Box(double available) {
        super(available);
        this.available = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            arr[index] = shape;
            index++;
            available -= shape.getVolume();
            return true;
        }
        return false;
    }

    public void print() {
        for (Shape in : arr)
            if (in != null)
                System.out.println(in);
    }
}

public class Volume {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 4);
        Pyramid pyramid = new Pyramid(12, 4);
        Square square = new Square(4);
        Ball ball = new Ball(3);
        Box box = new Box(260);
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(square));
        System.out.println(box.add(ball));
        box.print();
    }
}