package tankgame.player;

import tankgame.baseobjects.tankbase.PlayerTankBase;
import tankgame.util.SequenceGenerator;
import tankgame.baseobjects.tank.Tank;

public class Player {

    private int id;
    private String name;
    private Tank tank;

    public Player(String name) {
        this.name = name;
        tank= new PlayerTankBase().create();
        this.id = SequenceGenerator.getNext();
    }

    public Player(String name, Tank tank) {
        this.name = name;
        this.tank = tank;
        this.id = SequenceGenerator.getNext();
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
