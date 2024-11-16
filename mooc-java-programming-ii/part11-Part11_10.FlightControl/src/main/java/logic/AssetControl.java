/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Airplane;
import domain.Flight;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AssetControl {

    private ArrayList<Airplane> planes;
    private ArrayList<Flight> flights;

    public AssetControl() {
        this.planes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }

    public void addPlane(String id, int capacity) {
        Airplane plane = new Airplane(id, capacity);
        if (!planes.contains(plane)) {
            planes.add(plane);
        }
    }
    
    public void addFlight(Airplane plane, String departureID, String targetID){
        Flight flight = new Flight(plane, departureID, targetID);
        if (!flights.contains(flight)){
            flights.add(flight);
        }
    }

    public ArrayList<Airplane> getPlanes() {
        return planes;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }
    
    public Airplane getPlane(String id){
        for (Airplane plane : planes){
            if(plane.getId().equals(id)){
                return plane;
            }
        }
        return null;
    }
}
