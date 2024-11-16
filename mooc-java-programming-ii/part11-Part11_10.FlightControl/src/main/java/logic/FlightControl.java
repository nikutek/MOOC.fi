/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Airplane;
import domain.Flight;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FlightControl {

    private Scanner scanner;
    private AssetControl assetControl;

    public FlightControl(Scanner scanner, AssetControl assetControl) {
        this.scanner = scanner;
        this.assetControl = assetControl;
    }

    public void printPlanes() {
        for (Airplane plane : assetControl.getPlanes()) {
            System.out.println(plane);
        }
    }

    public void printFlights() {
        for (Flight flight : assetControl.getFlights()) {
            System.out.println(flight);
        }
    }
}
