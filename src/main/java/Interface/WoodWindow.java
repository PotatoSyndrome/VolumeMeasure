package Interface;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.YourWood;

import java.awt.*;


public class WoodWindow {

    private static int WINDOWWIDTH = 1000;
    private static int WINDOWHEIGHT = 700;

    private Group layout;
    private Scene scene;
    private Stage window;
    private WoodTable table;
    private YourWood wood;
    private AddWood addWood;
    private WoodTotalValues totalValues;

    public WoodWindow() {
        window = new Stage();
        layout = new Group();
        scene = new Scene(layout, WINDOWWIDTH, WINDOWHEIGHT);

        wood = new YourWood();

        table = new WoodTable(wood);
        totalValues = new WoodTotalValues(table);
        addWood = new AddWood(table, totalValues);

        scene.heightProperty().addListener(e -> redraw());
        scene.widthProperty().addListener(e -> redraw());


        layout.getChildren().addAll(table.getAll());
        layout.getChildren().addAll(addWood.getAll());
        layout.getChildren().addAll(totalValues.getAll());
        window.setScene(scene);

        table.getDelete().setOnAction(event -> {
            table.delete();
            totalValues.renew();
        });
    }

    public void show() {
        window.show();
        redraw();
    }

    private void redraw() {
        double height;
        double width;
        if (window.isMaximized()) {
            Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();
            height = sSize.height;
            width = sSize.width;
        }
        else {
            height = scene.getHeight();
            width = scene.getWidth();
        }

        table.redraw(width / 20, height / 10);
        addWood.redraw(table.getX() + width / 20, height / 10);
        totalValues.redraw(table.getX() + width / 20,height / 2);
    }

}
