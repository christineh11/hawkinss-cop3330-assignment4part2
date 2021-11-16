package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Christine Hawkins
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.util.Objects;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;


import java.util.Objects;
import java.util.ResourceBundle;

public class Applications extends javafx.application.Application {


    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("FXML TableView Example");

        Pane myPane = (Pane)FXMLLoader.load(getClass().getResource
                ("/ucf.assignments/TodoL.fxml"));


        Scene myScene = new Scene(myPane);
        stage.setScene(myScene);
        stage.show();

     //   Parent root = FXMLLoader.load(Applications.class.getResource("/ucf.assignments/TodoL.fxml"));
    //    Scene scene = new Scene(root, 450, 450);
     //   stage.setScene(scene);
       // stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }


}

