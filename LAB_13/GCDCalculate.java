package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

class NegativeNumberException extends Exception{
    NegativeNumberException(){
    }
}

public class findGCD extends Application {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
    @Override
    public void start(Stage primaryStage) {
        Label promptLabel = new Label("Enter two positive numbers:");
        Label numLabel1 = new Label("Number 1:");
        Label numLabel2 = new Label("Number 2:");
        TextField numTextField1 = new TextField();
        TextField numTextField2 = new TextField();
        Button calculateButton = new Button("Calculate");
        Label gcdLabel = new Label();

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        //gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.add(promptLabel,1,0);
        gridPane.add(numLabel1, 0, 1);
        gridPane.add(numTextField1,1, 1);
        gridPane.add(numLabel2, 0, 2);
        gridPane.add(numTextField2, 1, 2);
        gridPane.add(calculateButton, 0, 3);
        gridPane.add(gcdLabel,0,4);

        calculateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    int number1 = Integer.parseInt(numTextField1.getText());
                    int number2 = Integer.parseInt(numTextField2.getText());
                    if(number1<0 || number2<0){
                        throw new NegativeNumberException();
                    }
                    int gcd = findGCD(number1,number2);
                    String result = "GCD of "+ number1 + " and "+number2+" : "+gcd;
                    gcdLabel.setText(result);
                } catch (NegativeNumberException |NumberFormatException e) {
                    gcdLabel.setText("Please enter a positve number");
                }
            }
        });


        Scene scene = new Scene(gridPane, 300, 200);

        // Set the title of the Stage
        primaryStage.setTitle("Sign In");

        // Set the Scene to the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
