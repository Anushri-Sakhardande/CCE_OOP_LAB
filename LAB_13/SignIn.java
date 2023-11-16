package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SignIn extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label welcomeLabel = new Label("Welcome");
        Label nameLabel = new Label("Username:");
        TextField nameTextField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button signInButton = new Button("Sign In");
        Label HelloLabel = new Label();

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        //gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.add(welcomeLabel,1,0);
        gridPane.add(nameLabel, 0, 1);
        gridPane.add(nameTextField,1, 1);
        gridPane.add(passwordLabel, 0, 2);
        gridPane.add(passwordField, 1, 2);
        gridPane.add(signInButton, 0, 3);
        gridPane.add(HelloLabel, 0, 4);

        signInButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    String out = "Hello " + nameTextField.getText();
                    HelloLabel.setText(out);
                } catch (IllegalArgumentException ex) {
                    HelloLabel.setText("Please enter a valid string");
                }
            }
        });


        Scene scene = new Scene(gridPane, 300, 200);

        // Set the title of the Stage
        primaryStage.setTitle("JavaFX Welcome");

        // Set the Scene to the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
