package Interface;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import logic.RoundVolume;
import logic.YourWood;
import lombok.Getter;

import java.util.ArrayList;

public class WoodTable {

    private static final double TABLEHEIGHT = 500;
    private static final double TABLEWIDTH = 400;
    private static final double DIFFERENCE = 10;
    private static final double HEIGHT = 30;

    private TableView<RoundVolume> table;
    private Button lengthSort;
    private Button diameterSort;
    @Getter
    private YourWood wood;

    WoodTable(YourWood wood) {
        this.wood = wood;
        table = new TableView<>();
        lengthSort = new Button("Сортувати за довжиною");
        diameterSort = new Button("Сортувати за діаметром");
        tableInit();
    }

    private void tableInit() {
        table.setEditable(true);
        table.setPrefWidth(TABLEWIDTH);
        table.setPrefHeight(TABLEHEIGHT);
        TableColumn<RoundVolume,Double> lengthCol = new TableColumn<RoundVolume, Double>(" Довжина");
        lengthCol.setPrefWidth(table.getPrefWidth() / 3);
        lengthCol.setResizable(false);
        TableColumn<RoundVolume,Integer> diameterCol = new TableColumn<RoundVolume,Integer>("Діаметр");
        diameterCol.setPrefWidth(table.getPrefWidth() / 3);
        diameterCol.setResizable(false);
        TableColumn<RoundVolume,Double> volumeCol = new TableColumn<RoundVolume,Double>("Об'єм");
        volumeCol.setPrefWidth(table.getPrefWidth() / 3);
        volumeCol.setResizable(false);
        lengthCol.setCellValueFactory(
                new PropertyValueFactory<RoundVolume,Double>("length")
        );
        diameterCol.setCellValueFactory(
                new PropertyValueFactory<RoundVolume,Integer>("diameter")
        );
        volumeCol.setCellValueFactory(
                new PropertyValueFactory<RoundVolume,Double>("volume")
        );
        table.getColumns().addAll(lengthCol, diameterCol,volumeCol);

        diameterSort.setOnAction(e -> {
            wood.diameterFirstSortWood();
            table.setItems(FXCollections.observableArrayList(wood.getWood()));
        });
        diameterSort.setPrefHeight(HEIGHT);
        lengthSort.setOnAction(event -> {
            wood.lengthFirstSortWood();
            table.setItems(FXCollections.observableArrayList(wood.getWood()));
        });
        lengthSort.setPrefHeight(HEIGHT);
        table.setItems(FXCollections.observableArrayList(wood.getWood()));
    }

    public ArrayList<Node> getAll() {
        ArrayList<Node> nodeArrayList = new ArrayList<>();
        nodeArrayList.add(table);
        nodeArrayList.add(diameterSort);
        nodeArrayList.add(lengthSort);
        return nodeArrayList;
    }

    public void setItems(ObservableList<RoundVolume> roundVolumes) {
        table.setItems(roundVolumes);
    }

    public void redraw(double x, double y) {
        table.setLayoutX(x);
        table.setLayoutY(y);

        lengthSort.setLayoutX(x);
        diameterSort.setLayoutX(x);

        lengthSort.setLayoutY(y + table.getPrefHeight() + DIFFERENCE);
        diameterSort.setLayoutY(lengthSort.getLayoutY() + lengthSort.getPrefHeight() + DIFFERENCE);
    }

    public double getX() {
        return table.getLayoutX() + table.getPrefWidth();
    }

    public double getY() {
        return table.getLayoutX();
    }

    public double getTotalVolume() {
        double woodVolume = 0;
        for (RoundVolume rv: wood.getWood()) {
            woodVolume += rv.getVolume();
        }
        return woodVolume;
    }
}
