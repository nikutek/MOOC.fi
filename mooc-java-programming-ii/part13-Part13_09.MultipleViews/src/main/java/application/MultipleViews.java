package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public void start(Stage window) {

        BorderPane firstLayout = new BorderPane();
        VBox secondLayout = new VBox();
        GridPane thirdLayout = new GridPane();

        Scene first = new Scene(firstLayout, 300, 300);
        Scene second = new Scene(secondLayout, 300, 300);
        Scene third = new Scene(thirdLayout, 300, 300);

        Label firstText = new Label("First view!");
        Button firstButton = new Button("To the second view!");
        firstButton.setOnAction((event) -> {
            window.setScene(second);
        });
        firstLayout.setTop(firstText);
        firstLayout.setCenter(firstButton);

        Button secondButton = new Button("To the third view!");
        secondButton.setOnAction((event) -> {
            window.setScene(third);
        });
        Label secondText = new Label("Second view!");
        secondLayout.getChildren().addAll(secondButton, secondText);

        Label thirdText = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        thirdButton.setOnAction((event) -> {
            window.setScene(first);
        });
        thirdLayout.add(thirdText, 0, 0);
        thirdLayout.add(thirdButton, 1, 1);

        window.setScene(first);
        window.show();

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }

}
