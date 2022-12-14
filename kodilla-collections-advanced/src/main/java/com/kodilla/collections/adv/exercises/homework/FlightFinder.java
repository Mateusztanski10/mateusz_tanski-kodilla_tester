package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    List<Flight> listOfFlights = FlightRepository.getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> resultsList = new ArrayList<>();

        for(Flight flight : listOfFlights) {
            if(flight.getDeparture() == departure){
                resultsList.add(flight);
            }
        }

        return resultsList;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> resultsList = new ArrayList<>();

        for(Flight flight : listOfFlights) {
            if(flight.getArrival() == arrival){
                resultsList.add(flight);
            }
        }

        return resultsList;
    }
}

