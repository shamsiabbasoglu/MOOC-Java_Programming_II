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

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        Label textFirst = new Label("First view!");
        Button toTheSecond = new Button("To the second view!");

        layout.setTop(textFirst);
        layout.setCenter(toTheSecond);

        Scene first = new Scene(layout);

        VBox box = new VBox();
        box.setSpacing(10);
        Button toTheThird = new Button("To the third view!");
        box.getChildren().add(toTheThird);
        box.getChildren().add(new Label("Second view!"));

        Scene second = new Scene(box);

        GridPane grid = new GridPane();
        Button toTheFirst = new Button("To the first view!");

        grid.add(new Label("Third view!"), 0, 0);
        grid.add(toTheFirst, 1, 1);

        Scene third = new Scene(grid);

        toTheSecond.setOnAction((event) -> {
            stage.setScene(second);
        });

        toTheThird.setOnAction((event) -> {
            stage.setScene(third);
        });

        toTheFirst.setOnAction((event) -> {
            stage.setScene(first);
        });

        stage.setScene(first);
        stage.show();
    }
}
