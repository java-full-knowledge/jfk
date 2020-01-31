package tankgame.baseobjects.wall;

import tankgame.baseobjects.CoordinatedObject;
import tankgame.map.Point;

public abstract class Wall implements CoordinatedObject {

    private Point point;

    protected Wall(int x, int y) {
        point = new Point(x, y);
    }

    @Override
    public Point coordinate() {
        return point;
    }
}
