package com.tanks.baseobjects.tankbase;

import java.util.concurrent.TimeUnit;

public final class ScheduledEnemyTankCreator {

    private int interval;
    private TimeUnit unit;

    public ScheduledEnemyTankCreator(int interval, TimeUnit unit) {
        this.interval = interval;
        this.unit = unit;
    }


}
