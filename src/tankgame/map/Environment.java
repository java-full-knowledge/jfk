package tankgame.map;

import tankgame.baseobjects.CoordinatedObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Environment {

    private Map<Integer, CoordinatedObject> map;
    private int mapSize;

    public Environment(int initialCapacity) {
        if (initialCapacity % 2 != 0) {
            throw new RuntimeException("size should be odd number ...");
        }
        this.mapSize = initialCapacity;
        this.map = new HashMap<>(initialCapacity);

       /* int x = -1;
        int y = -1;
        int key;
        for (; x <= initialCapacity; x++) {
            key = y * mapSize + x;
            map.put(key, new MetalWallUnit(x, y));
        }
        y++;
        for (; y <= initialCapacity; y++) {
            key = y * mapSize + x;
            map.put(key, new MetalWallUnit(x, y));
        }
        x--;
        for (; x >= -1; x--) {
            key = y * mapSize + x;
            map.put(key, new MetalWallUnit(x, y));
        }
        y--;
        for (; y > -1; y--) {
            key = y * mapSize + x;
            map.put(key, new MetalWallUnit(x, y));
        }

*/
    }

    public <T extends CoordinatedObject> T getCoordinatedObject(Point point) {
        int x = point.X;
        int y = point.Y;
        return (T) map.get(y * mapSize + x);
    }

    public void setCoordinatedObject(Point point, CoordinatedObject object) {
        int x = point.X;
        int y = point.Y;
        map.put((y * mapSize + x), object);
    }

    public void setCoordinatedObject(CoordinatedObject object) {
        Point point = object.coordinate();
        int x = point.X;
        int y = point.Y;
        map.put((y * mapSize + x), object);
    }

    public int getMapSize() {
        return mapSize;
    }

    @Override
    public String toString() {
        String temp = "";
        CoordinatedObject[][] arr = new CoordinatedObject[mapSize ][];
        for (int i = 0; i < arr.length; i++)
            arr[i] = new CoordinatedObject[mapSize];
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer ptr = iterator.next();
            int x = ptr % mapSize;
            int y = ptr / mapSize;
            arr[y][x] = map.get(ptr);
        }
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]!=null)
                temp+=arr[i][j];
                else
                    temp+=" _ ";
            }
            temp+="\n";
        }

        return temp;
    }


}

