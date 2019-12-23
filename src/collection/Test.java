package collection;

import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        WArrayList<Integer> integers = new WArrayList<>();
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
        integers1.add(6);
    }
}
