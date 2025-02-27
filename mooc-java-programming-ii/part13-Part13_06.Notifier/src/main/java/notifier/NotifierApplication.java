package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{
    
    public void start(Stage window){
        TextField input = new TextField();
        Button btn = new Button("Update");
        Label label = new Label();
        
        btn.setOnAction((event) -> {
            label.setText(input.getText());
        });
        VBox layout = new VBox();
        layout.setSpacing(10);
        layout.getChildren().addAll(input, btn, label);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
