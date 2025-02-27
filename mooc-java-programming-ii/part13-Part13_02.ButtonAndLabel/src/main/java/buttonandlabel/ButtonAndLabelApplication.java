package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {

    public void start (Stage window){
        Button button = new Button("Button");
        Label label = new Label("Label");
        
        FlowPane comps = new FlowPane();
        comps.getChildren().add(button);
        comps.getChildren().add(label);
        
        Scene view = new Scene(comps);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndLabelApplication.class);
    }

}
