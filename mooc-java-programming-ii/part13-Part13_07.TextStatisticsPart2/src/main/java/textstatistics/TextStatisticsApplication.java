package textstatistics;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {

        Label letterCount = new Label("");
        Label wordCount = new Label("");
        Label longestWord = new Label("");

        TextArea textArea = new TextArea();
        textArea.textProperty().addListener(new ChangeListener<String>() {

            public void changed(ObservableValue<? extends String> change, String oldValue, String newValue) {
                System.out.println(oldValue + " -> " + newValue);
                int letters = newValue.length();
                String[] words = newValue.split(" ");
                String longest = words[0];
                for (String word : words) {
                    if (word.length() > longest.length()) {
                        longest = word;
                    }
                }

                letterCount.setText("Letters: " + letters);
                wordCount.setText("Words: " + words.length);
                longestWord.setText("The longest word is: " + longest);
            }
        });

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
