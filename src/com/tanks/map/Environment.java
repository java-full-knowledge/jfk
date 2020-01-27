package com.tanks.map;

import com.tanks.baseobjects.CoordinatedObject;
import com.tanks.baseobjects.wall.MetalWallUnit;

import java.util.HashMap;
import java.util.Map;

public class Environment {

    private final Map<Integer, CoordinatedObject> map;

    public Environment(int mapSize) {
        if (mapSize % 2 != 0) {
            throw new RuntimeException("size should be odd number ...");
        }
        this.map = new HashMap<>();
        for (int i = -1; i < mapSize + 1; i++) {
            map.put(i, new MetalWallUnit(i, -1));
        }

//        for (int i = -1; i < mapSize + 1; i++) {
//            map.put(, new MetalWallUnit(i, -1));
//        }
    }

    @SuppressWarnings("unchecked")
    public <T extends CoordinatedObject> T getCoordinatedObject(int x, int y) {
        return (T) map.get(y * this.map.size() + x);
    }
}














