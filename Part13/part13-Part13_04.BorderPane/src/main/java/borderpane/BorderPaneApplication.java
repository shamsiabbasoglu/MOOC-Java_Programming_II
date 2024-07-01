package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage stage) {
        Label north = new Label("NORTH");
        Label east = new Label("EAST");
        Label south = new Label("SOUTH");

        BorderPane border = new BorderPane();
        border.setTop(north);
        border.setRight(east);
        border.setBottom(south);

        Scene view = new Scene(border);

        stage.setScene(view);
        stage.show();
    }
}
