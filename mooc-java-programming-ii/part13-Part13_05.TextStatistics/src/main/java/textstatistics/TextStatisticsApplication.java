package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {

        TextArea textArea = new TextArea();

        Label letterCount = new Label("Letters: 0");
        Label wordCount = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");


        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(letterCount, wordCount, longestWord);


        BorderPane layout = new BorderPane();
        layout.setCenter(textArea);
        layout.setBottom(hbox);

        Scene view = new Scene(layout, 400, 200);

        window.setScene(view);
        window.setTitle("Text Statistics");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
