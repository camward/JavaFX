import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = new Pane(); // создаем панель

        ScrollBar scrollX = new ScrollBar();
        scrollX.setMin(0);
        scrollX.setMax(300);
        scrollX.setValue(0);
        scrollX.setOrientation(Orientation.HORIZONTAL);
        scrollX.setTranslateX(20);

        ScrollBar scrollY = new ScrollBar();
        scrollY.setMin(0);
        scrollY.setMax(300);
        scrollY.setValue(0);
        scrollY.setOrientation(Orientation.VERTICAL);
        scrollY.setTranslateY(20);

        ScrollBar scrollOpacity = new ScrollBar();
        scrollOpacity.setMin(0);
        scrollOpacity.setMax(10);
        scrollOpacity.setValue(10);
        scrollOpacity.setTranslateX(140);

        Rectangle rect = new Rectangle(100, 100, Color.GREEN);
        rect.setTranslateX(20);
        rect.setTranslateY(20);

        scrollX.valueProperty().addListener(event -> {
            rect.setTranslateX(20 + scrollX.getValue());
        });

        scrollY.valueProperty().addListener(event -> {
            rect.setTranslateY(20 + scrollY.getValue());
        });

        scrollOpacity.valueProperty().addListener(event -> {
            rect.setOpacity(scrollOpacity.getValue()/10);
        });

        // добавляем элементы на панель
        root.getChildren().addAll(scrollX, scrollY, scrollOpacity, rect);

        primaryStage.setTitle("ScrollBar");
        primaryStage.setScene(new Scene(root, 450, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
