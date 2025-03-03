package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private String turn;
    private String[][] board;
    private Button[][] buttons;
    private Label turnLabel;

    public TicTacToeApplication() {
        this.turn = "X";
        this.board = new String[3][3];
        this.buttons = new Button[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "";
            }
        }
    }

    public boolean checkHorizontalWin() {
        for (int i = 0; i < 3; i++) {
            String flag = board[i][0];

            if (flag == null || flag.isBlank()) {
                continue;
            }
            boolean win = true;
            for (int j = 1; j < 3; j++) {
                if (!board[i][j].equals(flag)) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    public boolean checkVerticalWin() {
        for (int j = 0; j < 3; j++) {
            String flag = board[0][j];

            if (flag == null || flag.isBlank()) {
                continue;
            }

            boolean win = true;
            for (int i = 1; i < 3; i++) {
                if (!board[i][j].equals(flag)) {
                    win = false;
                    break;
                }
            }

            if (win) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalWin() {
        String center = board[1][1];

        if (center != null && !center.isBlank()) {

            if (board[0][0] != null && board[0][0].equals(center) && board[2][2] != null && board[2][2].equals(center)) {
                return true;
            }

            if (board[0][2] != null && board[0][2].equals(center) && board[2][0] != null && board[2][0].equals(center)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWin() {
        return checkHorizontalWin() || checkVerticalWin() || checkDiagonalWin();
    }

    public void changeTurn() {
        this.turn = this.turn.equals("X") ? "O" : "X";
    }

    public void endGame(String message) {
        turnLabel.setText(message);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col].setDisable(true);
            }
        }
    }

    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        turnLabel = new Label("Turn: X");
        GridPane grid = new GridPane();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button(" ");
                button.setMinSize(50, 50);
                buttons[row][col] = button;

                int currentRow = row;
                int currentCol = col;

                button.setOnAction((event) -> {
                    if (button.getText().equals(" ")) {
                        button.setText(turn);
                        board[currentRow][currentCol] = turn;

                        if (checkWin()) {
                            endGame("The end!");
                        } else {
                            changeTurn();
                            turnLabel.setText("Turn: " + turn);
                        }
                    }
                });

                grid.add(button, col, row);
            }
        }

        layout.setPrefSize(300, 300);
        layout.setTop(turnLabel);
        layout.setCenter(grid);
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
