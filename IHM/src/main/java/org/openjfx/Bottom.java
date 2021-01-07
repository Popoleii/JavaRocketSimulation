package org.openjfx;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class Bottom {
    public static int nbFuseesUtilisees;
    public static Label nbFuseesUtiliseeslabel;
    public static int oneRocketCost;
    public static Label oneRocketCostlabel;
    private int stop = 0;
    public static int averageCost;
    public static Label averageCostlabel;
    int nbierations;
    Label nbiterationslabel;
    Label resultatslabel;


    int averageLifeLost = 10;
    Label averageLifeLostlabel;


    public VBox bottom(){

        VBox root = new VBox();
        root.setPadding(new Insets(0, 400, 300, 400));
        root.setSpacing(10);

        resultatslabel = new Label("3.Résultats numériques de la simulation:");
        resultatslabel.setFont(Font.font("Cambria", 25));
        resultatslabel.setTextFill(Color.web("#0076a3"));
        nbiterationslabel = new Label("Nombre d'itérations effectuées: " + nbierations);
        oneRocketCostlabel = new Label("Prix unitaire des fusées utilisées: " + oneRocketCost );

        nbFuseesUtiliseeslabel = new Label("Nombre de fusées utilisées: " +nbFuseesUtilisees);
        averageCostlabel = new Label("Prix moyen de la mission: " +averageCost);
        averageLifeLostlabel = new Label("Cout moyen en vies humaines: " +averageLifeLost);




            root.getChildren().addAll(resultatslabel);
            root.getChildren().addAll(nbiterationslabel);
            root.getChildren().addAll(oneRocketCostlabel);
            root.getChildren().addAll(nbFuseesUtiliseeslabel);
            root.getChildren().addAll(averageCostlabel);
            root.getChildren().addAll(averageLifeLostlabel);
            PauseTransition pause = new PauseTransition(Duration.seconds(1));



        return root;
    }

}
