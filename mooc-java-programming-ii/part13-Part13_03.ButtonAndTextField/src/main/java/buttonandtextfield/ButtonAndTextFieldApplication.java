package buttonandtextfield;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{

    


    public void start (Stage window){
        Button button = new Button("Button");
        TextField textField= new TextField("Label");
        
        FlowPane comps = new FlowPane();
        comps.getChildren().add(button);
        comps.getChildren().add(textField);
        
        Scene view = new Scene(comps);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

}
