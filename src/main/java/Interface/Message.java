package Interface;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Message {

    private static final int WINDOWWIDTH = 200;
    private static final int WINDOWHEIGHT = 100;

    private Group layout;
    private Scene scene;
    private Stage window;
    private Label answer;

    public Message() {
        window = new Stage();
        layout = new Group();
        scene = new Scene(layout, WINDOWWIDTH, WINDOWHEIGHT);
        answer = new Label();
    }

    public void show(String translated) {
        layout.getChildren().addAll(answer);
        answer.setText(translated);
        window.setScene(scene);
        window.show();
    }
}
