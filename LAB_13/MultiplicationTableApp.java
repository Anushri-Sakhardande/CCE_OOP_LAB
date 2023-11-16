package LAB_13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MultiplicationTableApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label promptLabel = new Label("Enter a number:");
        TextField numberTextField = new TextField();
        Button showTableButton = new Button("Show Table");
        Label resultLabel = new Label();

        FlowPane flowPane = new FlowPane();
        flowPane.setVgap(10);
        flowPane.setHgap(10);

        showTableButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    int number = Integer.parseInt(numberTextField.getText());

                    // Generate and display the multiplication table
                    StringBuffer table = new StringBuffer("Multiplication Table for " + number + ":\n");
                    for (int i = 1; i <= 10; i++) {
                        int product = number * i;
                        table.append(number).append(" * ").append(i).append(" = ").append(product).append("\n");
                    }
                    resultLabel.setText(table.toString());
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid integer.");
                }
            }
        });


        // Add UI elements to the FlowPane
        flowPane.getChildren().addAll(promptLabel, numberTextField, showTableButton, resultLabel);

        // Create a Scene with the FlowPane as the root
        Scene scene = new Scene(flowPane, 300, 300);

        // Set the title of the Stage
        primaryStage.setTitle("Multiplication Table Application");

        // Set the Scene to the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
