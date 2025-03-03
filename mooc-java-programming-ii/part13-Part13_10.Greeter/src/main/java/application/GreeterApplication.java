package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application{


    @Override
    public void start(Stage window) throws Exception {

        // 1. Creating the view for asking a password
        // 1.1 Creating components to be used
        Label instructionText = new Label("Enter your name and start.");
        TextField nameArea = new TextField();
        Button startButton = new Button("Start");
        String name;
        

        // 1.2 creating layout and adding components to it
        VBox layout = new VBox();

        layout.getChildren().add(instructionText);
        layout.getChildren().add(nameArea);
        layout.getChildren().add(startButton);

        // 1.3 styling the layout
        layout.setPrefSize(300, 180);
        layout.setSpacing(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        // 1.4 creating the view itself and setting it to use the layout
        Scene homeView = new Scene(layout);

        // 2. Creating a view for showing the welcome message
        Label welcomeText = new Label();

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);
       

        Scene welcomeView = new Scene(welcomeLayout);

        // 3. Adding an event handler to the welcome button.
        startButton.setOnAction((event) -> {
            welcomeText.setText("Welcome "+ nameArea.getText()+"!");
            window.setScene(welcomeView);
        });

        window.setScene(homeView);
        window.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}
