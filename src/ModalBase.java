import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ModalBase extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        Button btn = new Button("New Window");
        btn.setTranslateX(20);
        btn.setTranslateY(20);
        btn.setOnAction(event -> ModalWindow.newWindow("Modal Window"));

        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Base Window");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
