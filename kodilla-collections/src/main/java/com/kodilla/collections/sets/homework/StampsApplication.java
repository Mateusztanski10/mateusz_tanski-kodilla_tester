package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Paris", 4.5, 10.5, true));
        stamps.add(new Stamp("London", 1.4, 14.9, false));
        stamps.add(new Stamp("Warsaw", 2.5, 11.2, true));
        stamps.add(new Stamp("Madrid", 8.5, 19.0, false));
        stamps.add(new Stamp("Paris", 4.5, 10.5, true));
        stamps.add(new Stamp("Paris", 4.5, 10.5, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
