package com.algorithms;

import sun.net.spi.nameservice.dns.DNSNameService;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppComparable {


    public static void main(String[] args) throws Exception {
        Person first = new Person(12, "aaa");
        Person first_1 = new Person(12, "aaa");
        Person second = new Person(20, "ccc");
        Person last = new Person(2, "bbb");
        Set<Person> persons = new HashSet<>();
        persons.add(first);
        persons.add(first_1);
        persons.add(second);
        persons.add(last);
        System.out.println(persons);

        Set<Person> sorted = new TreeSet<>();
        sorted.add(first);
        sorted.add(first_1);
        sorted.add(second);
        sorted.add(last);

        System.out.println(sorted);


        Set<DNSNameService> services = new TreeSet<>(new Comparator<DNSNameService>() {
            @Override
            public int compare(DNSNameService o1, DNSNameService o2) {
                return 0;
            }
        });
        services.add(new DNSNameService());
        services.add(new DNSNameService());

        System.out.println(services);
    }

}
