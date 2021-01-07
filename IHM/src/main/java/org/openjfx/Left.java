package org.openjfx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Left {
    public int cargoWeight;
    Label cargoWeightlabel;
    Slider cargoWeightslider;

    private float launchCrashProbabily;
    Label launchCrashProbabilylabel;
    Slider launchCrashProbabilyslider;
    private float landCrashProbability;
    Label landCrashProbabilitylabel;
    Slider landCrashProbabilityslider;
    private float remplissage;
    Label remplissagelabel;
    Slider remplissageslider;


    private int cost = 1000;
    Label costlabel;

    Label general;
    Label chemintxt;
    TextField chemin;
    String monFichier;
    Label choixfusee;
    public VBox left(){
        Button buttonU1;
        Button buttonU2;
        Button buttonU3;

        VBox root = new VBox();
        //root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25, 0, 0, 25));
        root.setSpacing(10);

        general = new Label("1.Choix généraux:");
        general.setFont(Font.font("Cambria", 25));
        general.setTextFill(Color.web("#0076a3"));

        chemintxt = new Label("Chemin du fichier de chargement");
        chemin = new TextField("Copier le chemin complet ici");
        chemin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                monFichier = chemin.getAccessibleText();
            }
        });






        choixfusee = new Label("2.Choix de la fusée:");
        choixfusee.setFont(Font.font("Cambria", 15));
        choixfusee.setTextFill(Color.web("#0076a3"));
        /** Rocket u1 **/
        Label text1 = new Label("Simuler avec des fusée U1:");
        text1.setFont(Font.font("Cambria", 15));
        buttonU1 = new Button("Simuler avec U1");
        buttonU1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //lancer la simulattion et l'affichage des résultats avec des rockets U1
            }
        });

        /** Rocket U2 **/
        Label text2 = new Label("Simuler avec des fusée U2:");
        text2.setFont(Font.font("Cambria", 15));
        buttonU2 = new Button("Simuler avec U2");
        buttonU2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // lancer la simulattion et l'affichage des résultats avec des rockets U2
            }
        });

        /** Rocket U3 **/
        Label text3 = new Label("Simuler avec des fusée sur mesure U3:");
        text3.setFont(Font.font("Cambria", 15));
        buttonU3 = new Button("Simuler avec U3");




        costlabel = new Label("Prix d'une fusée: " + cost);
        // Cargo Weight
        cargoWeightlabel = new Label("Capacité de chargement souhaitée:");
        cargoWeightslider = new Slider(0, 100, 50);
        cargoWeightslider.setMin(0);
        cargoWeightslider.setMax(100);
        cargoWeightslider.setValue(50);
        cargoWeightslider.setShowTickLabels(true);
        cargoWeightslider.setShowTickMarks(true);
        cargoWeightslider.setMajorTickUnit(50);
        cargoWeightslider.setMinorTickCount(5);
        cargoWeightslider.setBlockIncrement(10);
        cargoWeightslider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, //
                                Number oldValue, Number capacitefusee) {
                cargoWeight = (int) cargoWeightslider.getValue();


            }
        });

        // launch Crash Probabily
        launchCrashProbabilylabel = new Label("Probabilité de crash au décollage souhaitée:");
        launchCrashProbabilyslider = new Slider(1, 50, 50);
        launchCrashProbabilyslider.setMin(1);
        launchCrashProbabilyslider.setMax(50);
        launchCrashProbabilyslider.setValue(25);
        launchCrashProbabilyslider.setShowTickLabels(true);
        launchCrashProbabilyslider.setShowTickMarks(true);
        launchCrashProbabilyslider.setMajorTickUnit(24);
        launchCrashProbabilyslider.setMinorTickCount(5);
        launchCrashProbabilyslider.setBlockIncrement(1);
        launchCrashProbabilyslider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, //
                                Number oldValue, Number probacrashdecollage) {
                launchCrashProbabily = (int) launchCrashProbabilyslider.getValue();

            }
        });

        // land Crash Probabily
        landCrashProbabilitylabel = new Label("Probabilité de crash au décollage souhaitée:");
        landCrashProbabilityslider = new Slider(1, 50, 50);
        landCrashProbabilityslider.setMin(1);
        landCrashProbabilityslider.setMax(50);
        landCrashProbabilityslider.setValue(25);
        landCrashProbabilityslider.setShowTickLabels(true);
        landCrashProbabilityslider.setShowTickMarks(true);
        landCrashProbabilityslider.setMajorTickUnit(24);
        landCrashProbabilityslider.setMinorTickCount(5);
        landCrashProbabilityslider.setBlockIncrement(1);
        landCrashProbabilityslider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, //
                                Number oldValue, Number probacrashdecollage) {
                landCrashProbability = (int) landCrashProbabilityslider.getValue();

            }

        });
        // remplissage
        remplissagelabel = new Label("Choix du poucentage de remplissage des fusées:");
        remplissageslider = new Slider(1, 50, 50);
        remplissageslider.setMin(1);
        remplissageslider.setMax(50);
        remplissageslider.setValue(25);
        remplissageslider.setShowTickLabels(true);
        remplissageslider.setShowTickMarks(true);
        remplissageslider.setMajorTickUnit(24);
        remplissageslider.setMinorTickCount(5);
        remplissageslider.setBlockIncrement(1);
        remplissageslider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, //
                                Number oldValue, Number probacrashdecollage) {
                remplissage = (int) remplissageslider.getValue();

            }

        });
        Label blanc1 = new Label("");
        Label blanc2 = new Label("");
        Label blanc3 = new Label("");


        root.getChildren().addAll(general);
        root.getChildren().addAll(remplissagelabel, remplissageslider);
        root.getChildren().addAll(chemintxt);
        root.getChildren().addAll(chemin);
        root.getChildren().addAll(blanc1);
        root.getChildren().addAll(choixfusee);
        root.getChildren().addAll(text1, buttonU1);
        root.getChildren().addAll(blanc2);
        root.getChildren().addAll(text2, buttonU2);
        root.getChildren().addAll(blanc3);
        root.getChildren().addAll(text3);
        root.getChildren().addAll(cargoWeightlabel, cargoWeightslider);
        root.getChildren().addAll(launchCrashProbabilylabel, launchCrashProbabilyslider);
        root.getChildren().addAll(landCrashProbabilitylabel, landCrashProbabilityslider);

        root.getChildren().addAll(costlabel);
        root.getChildren().addAll(buttonU3);

        return root;
    }
}
