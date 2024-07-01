package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) {
        TextField field = new TextField();
        Button button = new Button("Update");
        Label label = new Label();

        button.setOnAction((event) -> {
            label.setText(field.getText());
        });

        VBox box = new VBox();
        box.getChildren().addAll(field, button, label);

        Scene view = new Scene(box);
        
        stage.setScene(view);
        stage.show();
    }
}
