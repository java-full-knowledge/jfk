package com.jfk.mapimpl;

import java.util.*;

public class MapW {

    private Element[] keyArray;
    private Object[] valueArray;
    private int lastIndex = 0;

    public MapW() {
        this.keyArray = new Element[10];
        this.valueArray = new Object[10];
    }

    class Element {
        int valueIndex;
        Object key;
        Element(int index, Object key) {
            this.valueIndex = index;
            this.key = key;
        }
    }

    public void put(Object key, Object value) {
        keyArray[lastIndex] = new Element(lastIndex, key);
        this.valueArray[lastIndex] = value;
        lastIndex++;
    }

    public Object get(Object key) {
        int foundIndex = -1;
        for (int i = 0; i < this.lastIndex; i++) {
            if (this.keyArray[i].key.equals(key)) {
                foundIndex = this.keyArray[i].valueIndex;
                break;
            }
        }
        if (foundIndex != -1) {
            return this.valueArray[foundIndex];
        }
        return null;
    }


    public static void main(String[] args) {


        Map<String, String> nameSurnameMap = new HashMap<>();
        nameSurnameMap.put("william", "arustamyan");
        nameSurnameMap.put("test", "test surname");
        nameSurnameMap.put(null, "text");
        nameSurnameMap.put(null, "tegt");



//        System.out.println(nameSurnameMap);

        System.out.println(nameSurnameMap.get(null));

        MapW map = new MapW();
        map.put("william", "arustamyan");
        map.put("1", "1 value");
        map.put("2", "2 value");
        System.out.println(map.get("william"));


    }
}
