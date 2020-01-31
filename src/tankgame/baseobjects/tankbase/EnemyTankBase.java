package tankgame.baseobjects.tankbase;


import tankgame.baseobjects.tank.Tank;
import tankgame.baseobjects.tank.TankType;
import tankgame.map.Point;
import tankgame.util.ColorUtil;

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

    public EnemyTankBase(Color[] colors) {
        enumElementCount = TankType.values().length;
        this.colors = new ColorUtil(colors);
    }

    @Override
    public Tank create() {
        int i = random.nextInt(TankType.values().length) ;
        return new Tank(TankType.values()[i], colors.getRandomColor(),new Point(0,9));
    }
}
