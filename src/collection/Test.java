package collection;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
       /* WArrayList<Integer> integers = new WArrayList<>();
        integers.add(2);
        integers.add(5);
        integers.add(7);
        integers.add(9);
        List<Integer> list=integers.subList(1,2);
        System.out.println("integers = "+integers);
        System.out.println("list = "+list);
        System.out.println( integers.retainAll(list));
        ListIterator<Integer> iterator=integers.listIterator(2);
        iterator.next();
        iterator.previous();
        list.set(1,0);
        System.out.println(integers);

        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
       integers.remove((Object)9);
          System.out.println(integers.indexOf(90));
        WArrayList<Integer> integers1 = new WArrayList<>();
        integers1.add(0);
        integers1.add(6);*/

        Map<Person, String> map = new MyHashMap<>();
        Person a = new Person(2);
        Person b = new Person(3);
        Person d = new Person(4);
        long t1 = System.currentTimeMillis();
        map.put(a, "arman");
        map.put(b, "karen");
        map.put(d, "sss");
        map.put(null, "Bbbbo");
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        System.out.println(map);

        //  System.out.println(a.hashCode());
        //  System.out.println(b.hashCode());
        //System.out.println(d.hashCode());
        // System.out.println(map.get(null));
        /*  System.out.println(map);
         *//*  Set<person> h=map.keySet();
        System.out.println(h);*//*

        Map<person, String> map2 = new MyHashMap<>(map);

        System.out.println(map2);*/
    }
}

class Person {
    int id;

    Person(int i) {
        this.id = i;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return false;
    }*/

    @Override
    public int hashCode() {
        return 12;
    }

    @Override
    public String toString() {
        return "" + id;
    }
}

