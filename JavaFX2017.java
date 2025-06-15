import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class JavaFX2017 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Labels
        Label lblFirstName = new Label("First Name:");
        Label lblFatherName = new Label("Father Name:");
        Label lblColor = new Label("RGB Color:");
        Label lblProgramming = new Label("Programming");

        // TextFields with prompts
        TextField tfFirstName = new TextField();
        tfFirstName.setPromptText("Enter your Name");

        TextField tfFatherName = new TextField();
        tfFatherName.setPromptText("Enter Father's Name");

        // Color Picker
        ColorPicker colorPicker = new ColorPicker();

        // Buttons
        Button btnLogin = new Button("Log In");
        Button btnReset = new Button("Reset");

        // Checkboxes
        CheckBox cbCpp = new CheckBox("C++");
        CheckBox cbJava = new CheckBox("Java");
        VBox programmingBox = new VBox(5);
        programmingBox.getChildren().addAll(cbCpp, cbJava);

        // ChoiceBox with type safety
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Green", "Red", "Blue");

        // Event handlers
        btnLogin.setOnAction(e -> {
            btnLogin.setStyle("-fx-background-color: red");
            System.out.println("Your Name: " + tfFirstName.getText());
            System.out.println("Father Name: " + tfFatherName.getText());
        });

        btnReset.setOnAction(e -> {
            tfFirstName.clear();
            tfFatherName.clear();
            btnLogin.setStyle(""); // reset button style
        });

        colorPicker.setOnAction(e -> {
            System.out.println("Selected Color: " + colorPicker.getValue());
        });

        // Layout
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15));
        
        // Add components to GridPane
        grid.add(lblFirstName, 0, 0);
        grid.add(tfFirstName, 1, 0);

        grid.add(lblFatherName, 0, 1);
        grid.add(tfFatherName, 1, 1);

        grid.add(btnLogin, 0, 2);
        grid.add(btnReset, 1, 2);

        grid.add(lblColor, 0, 3);
        grid.add(colorPicker, 1, 3);

        grid.add(lblProgramming, 0, 4);
        grid.add(programmingBox, 1, 4);

        grid.add(new Label("Favorite Color:"), 0, 5);
        grid.add(choiceBox, 1, 5);

        // Scene and Stage
        Scene scene = new Scene(grid, 500, 400);
        primaryStage.setTitle("JavaFX Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
