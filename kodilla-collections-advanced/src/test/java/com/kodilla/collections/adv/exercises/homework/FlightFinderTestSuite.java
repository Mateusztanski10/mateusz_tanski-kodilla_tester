package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    static FlightFinder flightFinder;

    @BeforeAll

    public static void setUp() {
        flightFinder = new FlightFinder();
    }

    @Test

    public void testFindFlightsFrom() {
        assertEquals(2, flightFinder.findFlightsFrom("London").size());
    }

    @Test

    public void testFindFlightsTo() {
        assertEquals(3, flightFinder.findFlightsTo("Paris").size());
    }
}
