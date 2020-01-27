package com.tanks.baseobjects.tankbase;

import com.tanks.baseobjects.tank.Tank;
import com.tanks.baseobjects.tank.TankType;
import com.tanks.util.ColorUtil;

import java.awt.*;
import java.util.Random;

public final class EnemyTankBase implements TankBase {

    private int enumElementCount;
    private Random random = new Random();
    private ColorUtil colors;

    public EnemyTankBase() {
        this.enumElementCount = TankType.values().length;
        this.colors = new ColorUtil();
    }

    public EnemyTankBase(Color... enemyColors) {
        this.enumElementCount = TankType.values().length;
        this.colors = new ColorUtil(enemyColors);
    }

    @Override
    public Tank create() {
        return new Tank(
                TankType.values()[random.nextInt() - 1], this.colors.getRandomColor()
        );
    }
}
