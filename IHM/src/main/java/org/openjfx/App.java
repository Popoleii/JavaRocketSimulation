package org.openjfx;
package com.company;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane border = new BorderPane();
        Top vboxtop = new Top();
        Right vboxright = new Right();
        Center vboxcenter = new Center();
        Left vboxleft = new Left();
        Bottom vboxbottom = new Bottom();

        border.setTop(vboxtop.top());
        border.setRight(vboxright.right());
        border.setCenter(vboxcenter.center());
        border.setLeft(vboxleft.left());
        border.setBottom(vboxbottom.bottom());

        //addStackPane(hbox);         // Add stack to HBox in top region

        Scene scene =  new Scene(border, 1920, 1080);
        stage.setTitle("Mission To Mars Decision Tool");
        stage.setScene(scene);
        stage.show();
    }





    public static void main(String[] args) {
        launch();
    }

}