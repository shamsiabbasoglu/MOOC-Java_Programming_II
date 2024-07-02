package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Enter your name and start.");
        TextField area = new TextField();
        Button button = new Button("Start");

        GridPane grid = new GridPane();
        grid.add(label, 0, 0);
        grid.add(area, 0, 1);
        grid.add(button, 0, 2);

        grid.setPrefSize(450, 270);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Scene loginView = new Scene(grid);

        Label welcome = new Label();

        StackPane stack = new StackPane();
        stack.setPrefSize(450, 270);
        stack.getChildren().add(welcome);
        stack.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(stack);

        button.setOnAction((event) -> {
            String name = area.getText();
            welcome.setText("Welcome ".concat(name).concat("!"));
            stage.setScene(welcomeView);
        });

        stage.setScene(loginView);
        stage.show();
    }
}
