/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domain.Airplane;
import java.util.Scanner;
import logic.AssetControl;
import logic.FlightControl;

/**
 *
 * @author user
 */
public class TextUI {

    private Scanner scanner;
    private AssetControl assetControl;
    private FlightControl flightControl;

    public TextUI(Scanner scanner, AssetControl assetControl, FlightControl flightControl) {
        this.scanner = scanner;
        this.assetControl = assetControl;
        this.flightControl = flightControl;
    }

    public void startAssetControl() {
        while (true) {
            System.out.println("Choose an action: \n"
                    + "[1] Add an airplane\n"
                    + "[2] Add a flight\n"
                    + "[x] Exit Airport Asset Control");
            String action = scanner.nextLine();
            if (action.equals("1")) {
//                ADD PLANE
                System.out.println("Give the airplane id: ");
                String planeID = scanner.nextLine();
                System.out.println("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());
                assetControl.addPlane(planeID, capacity);
            } else if (action.equals("2")) {
//                ADD FLIGHT
                System.out.println("Give the airplane id: ");
                String planeID = scanner.nextLine();
                System.out.println("Give the departure airport id: ");
                String departureID = scanner.nextLine();
                System.out.println("Give the target airport id: ");
                String targetID = scanner.nextLine();
                Airplane plane = assetControl.getPlane(planeID);
                assetControl.addFlight(plane, departureID, targetID);
            } else if (action.equals("x")) {
//                EXIT
                break;
            }
        }
    }

    public void startFlightControl() {
        while (true) {
            System.out.println("Choose an action:\n"
                    + "[1] Print airplanes\n"
                    + "[2] Print flights\n"
                    + "[3] Print airplane details\n"
                    + "[x] Quit");
            String action = scanner.nextLine();

            if (action.equals("1")) {
//                PRINT AIRPLANES
                flightControl.printPlanes();
            } else if (action.equals("2")) {
//                PRINT FLIGHTS
                flightControl.printFlights();
            } else if (action.equals("3")) {
//                PRINT PLANE DETAILS
                System.out.println("Give the airplane id: ");
                String planeID = scanner.nextLine();
                Airplane plane = assetControl.getPlane(planeID);
                System.out.println(plane);
            } else if (action.equals("x")) {
//                QUIT
                break;
            }
        }
    }
}
