package com.tanks.baseobjects.wall;

import com.tanks.baseobjects.CoordinatedObject;
import com.tanks.map.Point;

public final class MetalWallUnit implements CoordinatedObject {

    private final Point point;

    public MetalWallUnit(int x, int y) {
        this.point = new Point(x, y);
    }

    @Override
    public Point coordinate() {
        return this.point;
    }
}
