package tankgame.baseobjects.tank;

import tankgame.baseobjects.CoordinatedObject;
import tankgame.map.Point;

import java.awt.*;

public  class Tank implements CoordinatedObject {
    private TankType type;
    private Color color;
    private Point point;

    public Tank(TankType type, Color color,Point point) {
        this.type = type;
        this.color = color;
        this.point=point;
    }




    public TankType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }


    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public Point coordinate() {
        return point;
    }

    @Override
    public String toString() {
        return " T ";
    }
}
