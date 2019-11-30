package Interface;

import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class AddWood {

    private static final double DIFFERENCE = 10;
    private static final double WIDTH = 200;
    private static final double HEIGHT = 30;

    private TextField lengthField;
    private TextField diameterField;
    private Button addButton;
    private WoodTable table;
    private WoodTotalValues woodTotalValues;

    AddWood( WoodTable table, WoodTotalValues woodTotalValues) {
        this.table = table;
        this.woodTotalValues = woodTotalValues;

        lengthField = new TextField();
        lengthField.setPrefWidth(WIDTH);
        lengthField.setPrefHeight(HEIGHT);
        diameterField = new TextField();
        diameterField.setPrefWidth(WIDTH);
        diameterField.setPrefHeight(HEIGHT);
        addButton = new Button("Додати");

        addButton.setOnAction(e -> {
            try {
                table.getWood().addWood(Double.parseDouble(lengthField.getText()), Integer.parseInt(diameterField.getText()));
            }
            catch (NullPointerException exp) {
                new Message().show("Невірні дані");
            }
            this.woodTotalValues.renew();
            table.setItems(FXCollections.observableArrayList(table.getWood().getWood()));
        });
    }

    public ArrayList<Node> getAll() {
        ArrayList<Node> nodeArrayList = new ArrayList<>();
        nodeArrayList.add(lengthField);
        nodeArrayList.add(diameterField);
        nodeArrayList.add(addButton);
        return nodeArrayList;
    }

    public void redraw(double x, double y) {
        lengthField.setLayoutX(x);
        lengthField.setLayoutY(y);

        diameterField.setLayoutX(x + lengthField.getPrefWidth() + DIFFERENCE);
        diameterField.setLayoutY(y);

        addButton.setLayoutX(x);
        addButton.setLayoutY(y + lengthField.getPrefHeight() + DIFFERENCE);
    }
}
