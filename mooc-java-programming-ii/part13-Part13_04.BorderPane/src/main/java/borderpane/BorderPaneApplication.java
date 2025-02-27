package borderpane;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application{


    public void start (Stage window){
        Button button = new Button("Button");
        Label north= new Label("NORTH");
        Label east= new Label("EAST");
        Label south= new Label("SOUTH");
        
        
        BorderPane layout = new BorderPane();
        layout.setTop(north);
        layout.setRight(east);
        layout.setBottom(south);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
    }

}
