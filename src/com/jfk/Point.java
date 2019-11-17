package com.jfk;

public class Point {
    private float x = 0.0f;
    private  float y = 0.0f;
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point(){

    }
    public float getX(){
        return x;
    }
    public void setX(float x){
       this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY(float x, float y){
        this.y = y;
        this.x = x;
    }
    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}
class MovablePoint extends Point {
private float xSpeed = 0.0f;
private float ySpeed = 0.0f;
public MovablePoint( float x, float y, float xSpeed, float ySpeed){
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
}
public MovablePoint( float xSpeed, float ySpeed){
    this.ySpeed = ySpeed;
    this.xSpeed = xSpeed;
}
public MovablePoint(){

}
public float getXSpeed(){
    return xSpeed;
}
public void setXSpeed( float xSpeed){
    this.xSpeed = xSpeed;
}
    public float getYSpeed(){
        return ySpeed;
    }
    public void setYSpeed( float ySpeed){
        this.xSpeed = ySpeed;
    }
    public void setSpeed (float xSpeed, float ySpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    public float[] getSpeed(){
    return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return "(" +getX()+','+getY()+')'+ " Speed=(" + xSpeed + "," + ySpeed + ')';
    }
    public MovablePoint move (){
        setXY(getX()+xSpeed,getY()+ySpeed);
        return this;
    }
}
class Main_Point{
    public static void main(String[] args) {
        Point Test22 = new Point(1.0f, 2.0f);
        System.out.println(Test22);

    MovablePoint Test33 = new MovablePoint(1.0f,2.0f, 3.0f, 4.0f);
        System.out.println(Test33);
    }
}