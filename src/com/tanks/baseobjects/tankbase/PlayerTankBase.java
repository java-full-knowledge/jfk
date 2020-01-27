package com.tanks.baseobjects.tankbase;

import com.tanks.baseobjects.tank.Tank;
import com.tanks.baseobjects.tank.TankType;
import com.tanks.util.ColorUtil;

public final class PlayerTankBase implements TankBase {

    private static final Tank tank = new Tank(
            TankType.PT_76, new ColorUtil().playerColor()
    );

    @Override
    public Tank create() {
        return tank;
    }
}
