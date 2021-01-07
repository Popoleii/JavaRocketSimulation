package org.openjfx;
import com.company.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class Right {
    public VBox right() {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(100));
        root.setSpacing(50);
        ArrayList<Item> items = new ArrayList();
        items = Simulation.loadItems(Left.monFichier);
        int n = items.size();
        for (int i=0; i<n; i++){
            Label currentlabel = new Label("Item"+i+":" + items.get(i));
            root.getChildren().addAll(currentlabel);

        }

        return root;
    }
}
