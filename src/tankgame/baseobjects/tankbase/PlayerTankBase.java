package tankgame.baseobjects.tankbase;

import tankgame.baseobjects.tank.Tank;
import tankgame.baseobjects.tank.TankType;
import tankgame.map.Point;
import tankgame.util.ColorUtil;

public final class PlayerTankBase implements TankBase {

    private static final Tank tank = new Tank(TankType.ARMATA, new ColorUtil().playerColor(),new Point(5,0));

    @Override
    public Tank create() {
        return tank;
    }
}
