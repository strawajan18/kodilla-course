package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("JFK", false);
        airports.put("LAX", true);
        airports.put("Heathrow", true);
        airports.put("WAR", true);
        airports.put("POZ", false);

        String aa = flight.getArrivalAirport();
        String da = flight.getDepartureAirport();

        Iterator<Map.Entry<String, Boolean>> iterator = airports.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Boolean> entry = iterator.next();

            if (aa == entry.getKey() && da == entry.getKey()) {
                if (airports.get(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport())) {
                    System.out.println("Flight from : " + flight.getDepartureAirport() + " to : " + flight.getArrivalAirport() + " has been found.");
                } else {
                    System.out.println("Sorry you can't go there. Choose another connection.");
                }
            } else {
                throw new RouteNotFoundException();
            }
        }
    }


    public static void main(String[] args) {
        FindFlight flightFinder = new FindFlight();

        try {
            flightFinder.findFlight(new Flight("PZZ", "WAR"));
        } catch (RouteNotFoundException e) {
            System.out.println("Our service doesn't inlcude this Airport");
        }
    }
}
