package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");

        menu.getChildren().addAll(joke, answer, explanation);

        layout.setTop(menu);

        StackPane first = createView("What do you call a bear with no teeth?");
        StackPane second = createView("A gummy bear.");
        StackPane third = createView("The humor comes from combining "
                + "these two ideas: a bear with no teeth (gummy) "
                + "and a popular candy (gummy bear).");

        joke.setOnAction((event) -> {
            layout.setCenter(first);
        });
        answer.setOnAction((event) -> {
            layout.setCenter(second);
        });
        explanation.setOnAction((event) -> {
            layout.setCenter(third);
        });
        
        layout.setCenter(first);
        
        Scene scene = new Scene(layout);
        
        stage.setScene(scene);
        stage.show();
    }

    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(750, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
