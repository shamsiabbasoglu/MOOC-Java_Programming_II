package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
    
    @Override
    public void start(Stage stage) {
        BorderPane border = new BorderPane();
        
        TextArea area = new TextArea();
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is:");
        
        HBox texts = new HBox();
        texts.setSpacing(15);
        texts.getChildren().addAll(letters, words, longest);
        area.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int wordLength = parts.length;
            String longestString = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            letters.setText("Letters: " + characters);
            words.setText("Words: " + wordLength);
            longest.setText("The longest word is: " + longestString);
        });
        
        border.setCenter(area);
        border.setBottom(texts);
        
        Scene view = new Scene(border);
        
        stage.setScene(view);
        stage.show();
    }
}
