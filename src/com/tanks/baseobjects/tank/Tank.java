package com.tanks.baseobjects.tank;

import com.tanks.baseobjects.CoordinatedObject;
import com.tanks.map.Point;

import java.awt.*;

public final class Tank implements CoordinatedObject {
    public static final Tank DEFAULT = new Tank(TankType.PT_76, Color.GREEN);
    private TankType type;
    private Color color;

    public Tank(TankType type, Color color) {
        this.type = type;
        this.color = color;
    }

    public TankType getType() {
        return this.type;
    }

    public Color color() {
        return this.color;
    }

    @Override
    public Point coordinate() {
        return null;
    }
}
