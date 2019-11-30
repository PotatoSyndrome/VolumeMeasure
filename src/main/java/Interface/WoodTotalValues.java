package Interface;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class WoodTotalValues {

    private static final String VOLUME = "Об'єм:";
    private static final String PRICE = "Ціна:";
    private static final double DIFFERENCE = 20;
    private static final double HEIGHT = 30;

    private WoodTable table;

    private Label totalVolume;
    private Label addPrice;
    private TextField price;
    private Button calculate;
    private Label totalPrice;

    WoodTotalValues(WoodTable table) {
        this.table = table;

        totalVolume = new Label(VOLUME + 0);
        totalVolume.setPrefHeight(HEIGHT);
        addPrice = new Label("Введіть ціну");
        addPrice.setPrefHeight(HEIGHT);
        price = new TextField();
        price.setPrefHeight(HEIGHT);
        calculate = new Button("Обрахувати");
        calculate.setPrefHeight(HEIGHT);
        totalPrice = new Label(PRICE + 0);
        totalPrice.setPrefHeight(HEIGHT);

        calculate.setOnAction(e -> renew());
    }

    public void renew() {
        double woodVolume = table.getTotalVolume();
        double woodPrice;
        try {
            woodPrice = Double.parseDouble(price.getText());
        }
        catch (Throwable e) {
            woodPrice = 0;
        }
        totalVolume.setText(VOLUME + woodVolume);
        totalPrice.setText(PRICE + woodPrice * woodVolume);
    }

    public void redraw(double x, double y) {
        totalVolume.setLayoutX(x);
        totalVolume.setLayoutY(y);

        addPrice.setLayoutX(x);
        addPrice.setLayoutY(totalVolume.getLayoutY() + totalVolume.getPrefHeight() + DIFFERENCE);

        price.setLayoutX(x);
        price.setLayoutY(addPrice.getLayoutY() + addPrice.getPrefHeight() + DIFFERENCE);

        calculate.setLayoutX(x);
        calculate.setLayoutY(price.getLayoutY() + price.getPrefHeight() + DIFFERENCE);

        totalPrice.setLayoutX(x);
        totalPrice.setLayoutY(calculate.getLayoutY() + calculate.getPrefHeight() + DIFFERENCE);
    }



    public ArrayList<Node> getAll() {
        ArrayList<Node> nodeArrayList = new ArrayList<>();
        nodeArrayList.add(totalVolume);
        nodeArrayList.add(addPrice);
        nodeArrayList.add(price);
        nodeArrayList.add(calculate);
        nodeArrayList.add(totalPrice);
        return nodeArrayList;
    }
}
