import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create UI elements
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button button = new Button("Greet");
        Label greetingLabel = new Label();

        // Button action
        button.setOnAction(e -> {
            String name = textField.getText();
            greetingLabel.setText("Hello, " + name + "!");
        });
j
        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, textField, button, greetingLabel);

        // Scene and stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("Simple JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
