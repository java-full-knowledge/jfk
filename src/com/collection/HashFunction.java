package src.com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashFunction {



    public static void main(String [] args) {
        Set<Element> elements = new HashSet<>();
        final Element first  = new Element("first");
        final Element second = new Element("second");

        elements.add(first);
        elements.add(second);
        elements.add(new Element("first"));
        System.out.println("elements = " + elements);

        System.out.println(elements.contains(new Element("first")));
        MapElement ff = new MapElement("first");
        Map<MapElement, String> map = new HashMap<>();
        map.put(ff, "first");
        map.put(new MapElement("first"), "second");

        System.out.println(map);

    }
}
