package com.jeka.lab9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculator extends Application{
    @Override
    public void start(Stage stage) {
        stage.setTitle("Cambur Dumitru - Lab 9");

        TextField numberOneField = new TextField();
        TextField numberTwoField = new TextField();
        TextField resultField = new TextField();

        numberOneField.setPromptText("Enter First Number");
        numberTwoField.setPromptText("Enter Second Number");

        resultField.setEditable(false);
        resultField.setPromptText("Result");

        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");
        Button buttonMultiply = new Button("*");
        Button buttonDivide = new Button("/");

        GridPane grid = new GridPane();

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(15);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.getColumnConstraints().add(new ColumnConstraints());
        grid.getColumnConstraints().add(new ColumnConstraints());
        grid.getRowConstraints().add(new RowConstraints());
        grid.getRowConstraints().add(new RowConstraints());
        grid.getColumnConstraints().get(0).setPercentWidth(40);
        grid.getColumnConstraints().get(1).setHgrow(Priority.SOMETIMES);
        grid.getColumnConstraints().get(1).setPercentWidth(40);
        grid.getColumnConstraints().get(1).setHgrow(Priority.SOMETIMES);
        grid.getRowConstraints().get(0).setPercentHeight(20);
        grid.getRowConstraints().get(0).setVgrow(Priority.SOMETIMES);
        grid.getRowConstraints().get(1).setPercentHeight(5);
        grid.getRowConstraints().get(1).setVgrow(Priority.SOMETIMES);

        grid.add(numberOneField, 0, 0);
        grid.add(numberTwoField, 1, 0);
        grid.add(resultField, 0, 1, 2, 1);


        grid.add(buttonDivide, 3 , 1);

        Calculate.onActionShortener(numberOneField, numberTwoField, resultField, buttonDivide);

        Scene scene = new Scene(grid, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
