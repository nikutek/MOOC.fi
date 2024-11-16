package FlightControl;

import java.util.Scanner;
import logic.AssetControl;
import logic.FlightControl;
import ui.TextUI;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        AssetControl assetControl = new AssetControl();
        FlightControl flightControl = new FlightControl(scanner, assetControl);
        TextUI ui = new TextUI(scanner, assetControl, flightControl);
        
        ui.startAssetControl();
        ui.startFlightControl();
    }
}
