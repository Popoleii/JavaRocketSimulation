package org.openjfx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Center {
    public static ArrayList x = new ArrayList();
    public static ArrayList y = new ArrayList();

    public VBox center(){
        int i;
        for (i=0;i<25;i++){
            x.add(i);
            y.add(0);
        }
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(100));
        root.setSpacing(50);
        // Création des séries.
        final List<LineChart.Series> seriesList = new LinkedList<>();
        final int maxN = 1;
        final int minX = 0;
        final int maxX = 24;
        double minY = 0;
        double maxY = 0;
        for (int n = 0 ; n <= maxN ; n++) {
            final LineChart.Series series  = new LineChart.Series<>();
            series.setName(String.format("n = %d", n));
            for (int x = 0 ; x <= maxX ; x++) {
                final int value = (int)y.get(x)/1000;
                minY = Math.min(minY, value);
                maxY = Math.max(maxY, value);
                final LineChart.Data data = new LineChart.Data(x*100, value);
                series.getData().add(data);
            }
            seriesList.add(series);
        }
        // Création du graphique.
        final NumberAxis xAxis = new NumberAxis(0, 2500,100 );
        xAxis.setLabel("x");
        final NumberAxis yAxis = new NumberAxis(0, 100, 5);
        yAxis.setLabel("y = Math.pow(x, n)");
        final LineChart chart = new LineChart(xAxis, yAxis);
        chart.setTitle("Fonction puissance");
        chart.getData().setAll(seriesList);
            // Montage de l'IU.
            root.getChildren().add(chart);
            Left.pass --;
        }


        return root;
    }
}
