/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author user
 */
public class Flight {
    private Airplane plane;
    private String departureID;
    private String targetID;

    public Flight(Airplane plane, String departureID, String targetID) {
        this.plane = plane;
        this.departureID = departureID;
        this.targetID = targetID;
    }

    public Airplane getPlane() {
        return plane;
    }

    public String getDepartureID() {
        return departureID;
    }

    public String getTargetID() {
        return targetID;
    }

    @Override
    public String toString() {
        return plane.toString() + " ("+departureID+"-"+targetID+")";
    }
    
    
}
