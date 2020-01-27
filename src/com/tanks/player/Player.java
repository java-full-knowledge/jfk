package com.tanks.player;

import com.tanks.baseobjects.tank.Tank;
import com.tanks.baseobjects.tankbase.PlayerTankBase;
import com.tanks.util.SequenceGenerator;

public final class Player {

    private int id;
    private String name;
    private Tank tank;

    public Player(String name) {
        this.name = name;
        this.tank = new PlayerTankBase().create();
        this.id = SequenceGenerator.getNext();
    }

    public Player(String name, Tank tank) {
        this.name = name;
        this.tank = tank;
        this.id = SequenceGenerator.getNext();
    }
}
