package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> airportLondon = new ArrayList<>();
        airportLondon.add(new Flight("London", "Paris"));
        airportLondon.add(new Flight("Kiev", "Warsaw"));
        airportLondon.add(new Flight("Osaka", "Tokio"));
        airportLondon.add(new Flight("Melbourne", "New York"));
        airportLondon.add(new Flight("Mexico City", "Lima"));
        airportLondon.add(new Flight("Boston", "Sydney"));
        airportLondon.add(new Flight("Warsaw", "Boston"));
        airportLondon.add(new Flight("Tokio", "Sydney"));
        airportLondon.add(new Flight("Melbourne", "Paris"));
        airportLondon.add(new Flight("Kiev", "Osaka"));
        airportLondon.add(new Flight("Osaka", "London"));
        airportLondon.add(new Flight("Mexico City", "Melbourne"));
        airportLondon.add(new Flight("Lima", "Kiev"));
        airportLondon.add(new Flight("New York", "Mexico City"));
        airportLondon.add(new Flight("London", "Warsaw"));
        airportLondon.add(new Flight("Warsaw", "Paris"));
        return airportLondon;
    }
}
