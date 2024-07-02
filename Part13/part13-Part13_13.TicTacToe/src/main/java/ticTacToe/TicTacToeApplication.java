package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    
    private boolean xTurn = true; // Track whose turn it is
    private final Button[][] buttons = new Button[3][3]; // 3x3 grif of buttons

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Tic-tac-toe");
        
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        Font font = Font.font("Monospaced", 40);
        
        HBox box = new HBox();
        box.setPadding(new Insets(20, 20, 20, 20));
        box.setSpacing(20);
        
        Label turn = new Label("Turn: X");
        turn.setFont(font);
        
        box.getChildren().add(turn);
        
        layout.setTop(turn);
        
        GridPane game = new GridPane();
        game.setHgap(10);
        game.setVgap(10);
        
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j] = new Button();
                buttons[i][j].setFont(font);
                buttons[i][j].setPrefSize(80, 80);
                game.add(buttons[i][j], i, j);

                // Add action listener to the button
                buttons[i][j].setOnAction(e -> handleButtonClick((Button) e.getSource(), turn));
            }
        }
        
        layout.setCenter(game);
        
        Scene view = new Scene(layout, 280, 330);
        
        stage.setScene(view);
        stage.show();
    }
    
    private void handleButtonClick(Button button, Label turn) {
        if (!button.getText().isEmpty()) {
            return;
        }
        
        if (xTurn) {
            button.setText("X");
            turn.setText("Turn: O");
        } else {
            button.setText("O");
            turn.setText("Turn: X");
        }
        
        xTurn = !xTurn;

        // Checks if the game is over
        if (checkForWinner()) {
            turn.setText("The end!");
            disableButtons();
        } else if (isBoardFull()) {
            turn.setText("The end!");
        }
    }
    
    private boolean checkForWinner() {
        // Checks rows and columns
        for (int i = 0; i < 3; i++) {
            if (checkLine(buttons[i][0], buttons[i][1], buttons[i][2])
                    || checkLine(buttons[0][i], buttons[1][i], buttons[2][i])) {
                return true;
            }
        }

        // Checks diagonals
        return checkLine(buttons[0][0], buttons[1][1], buttons[2][2])
                || checkLine(buttons[0][2], buttons[1][1], buttons[2][0]);
    }
    
    private boolean checkLine(Button b1, Button b2, Button b3) {
        return !b1.getText().isEmpty()
                && b1.getText().equals(b2.getText())
                && b2.getText().equals(b3.getText());
    }
    
    private void disableButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setDisable(true);
            }
        }
    }
    
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }
}
