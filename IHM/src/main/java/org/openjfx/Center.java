package org.openjfx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.LinkedList;
import java.util.List;

public class Center {
    public VBox center(){
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(100));
        root.setSpacing(50);
            // Création des séries.
            final List<LineChart.Series> seriesList = new LinkedList<>();
            final int maxN = 3;
            final int minX = 0;
            final int maxX = 5;
            double minY = Double.MAX_VALUE;
            double maxY = -Double.MAX_VALUE;
            for (int n = 0 ; n <= maxN ; n++) {
                final LineChart.Series series  = new LineChart.Series<>();
                series.setName(String.format("n = %d", n));
                for (int x = minX ; x <= maxX ; x++) {
                    final double value = Math.pow(x, n);
                    minY = Math.min(minY, value);
                    maxY = Math.max(maxY, value);
                    final LineChart.Data data = new LineChart.Data(x, value);
                    series.getData().add(data);
                }
                seriesList.add(series);
            }
            // Création du graphique.
            final NumberAxis xAxis = new NumberAxis(minX, maxX, 1);
            xAxis.setLabel("x");
            final NumberAxis yAxis = new NumberAxis(minY, maxY, 50);
            yAxis.setLabel("y = Math.pow(x, n)");
            final LineChart chart = new LineChart(xAxis, yAxis);
            chart.setTitle("Fonction puissance");
            chart.getData().setAll(seriesList);
            // Montage de l'IU.
            root.getChildren().add(chart);



        return root;
    }
}
