package com.jfk;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
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

    public void setXY(float x, float y) {
        this.y = y;
        this.x = x;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
class Point3D extends Point2D{
    private float z= 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){
}
public float getZ(){
        return z;
}
public void setZ(float z){
        this.z = z;
}
public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.z= z;
}
    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
class Main_Point2D{
    public static void main(String[] args) {
        Point2D Test= new Point2D(12.1f, 1.1f);
        System.out.println(Test);
        Point3D test = new Point3D(2.1f, 3.2f, 4.5f);
        System.out.println(test);
    }
}


