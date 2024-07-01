package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage stage){
        Label label = new Label("This is a label");
        Button button = new Button("This is a button");
        
        FlowPane component = new FlowPane();
        component.getChildren().add(label);
        component.getChildren().add(button);
        
        Scene view = new Scene(component);
        
        stage.setScene(view);
        stage.show();
    }
}
