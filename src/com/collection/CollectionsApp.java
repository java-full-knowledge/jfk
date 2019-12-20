package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsApp {

    public static void main(String[] args) {

        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(6);
        integers.add(7);
        integers.add(2);

        System.out.println(integers);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer element : integers) {
            System.out.println(element);
        }
//        Person p = new Person();
//        for (Object o : p) {
//            System.out.println(o);
//        }
    }
}

class Person implements Iterable<Integer>{

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return 100;
            }
        };
    }
}























