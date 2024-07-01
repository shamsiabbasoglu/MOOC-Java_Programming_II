package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage stage) {
        Button button = new Button("This is a button");
        TextField field = new TextField("Text field");

        FlowPane component = new FlowPane();
        component.getChildren().add(button);
        component.getChildren().add(field);

        Scene view = new Scene(component);

        stage.setScene(view);
        stage.show();
    }
}
