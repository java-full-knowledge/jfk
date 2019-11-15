package Task_11_11_19;

class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ')';
    }
}

class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;


    }

    @Override
    public String toString() {
        return "(" +getX()+
                "," + getY()+","+z +
                ')';
    }
}

public class Main_Point2D {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(3,5);
        System.out.println(point2D);
        Point3D point3D=new Point3D(2,3,5);
        System.out.println(point3D);
    }
}
