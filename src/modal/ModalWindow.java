package modal;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ModalWindow {
    public static void newWindow(String title){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        Pane pane = new Pane();

        Button btn = new Button("Close");
        btn.setTranslateX(20);
        btn.setTranslateY(20);
        btn.setOnAction(event -> window.close());

        pane.getChildren().add(btn);
        Scene scene = new Scene(pane, 100, 100);
        window.setScene(scene);
        window.setTitle(title);
        window.show();
    }
}
