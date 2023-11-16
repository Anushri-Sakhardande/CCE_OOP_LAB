import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Label with the specified message
        Label label = new Label("Welcome to JavaFX programming");

        // Set the text color of the Label to Magenta
        label.setTextFill(Color.MAGENTA);

        // Create a FlowPane layout
        FlowPane flowPane = new FlowPane();
        // Set the hgap and vgap of the FlowPane to desired values
        flowPane.setHgap(10);
        flowPane.setVgap(10);

        // Add the Label to the FlowPane
        flowPane.getChildren().add(label);

        // Create a Scene with the FlowPane as the root
        Scene scene = new Scene(flowPane, 500, 200);

        // Set the title of the Stage
        primaryStage.setTitle("This is the first JavaFX Application");

        // Set the Scene to the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
