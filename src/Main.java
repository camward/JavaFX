import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
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

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.setItems(FXCollections.observableArrayList(
                "Red", "Green", "Blue"
        ));
        choiceBox.setTranslateX(260);

        Color[] colors = new Color[]{Color.RED, Color.GREEN, Color.BLUE};

        Rectangle rect = new Rectangle(100, 100, Color.BLACK);
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

        // смена цвета
        choiceBox.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    rect.setFill(colors[new_val.intValue()]);
                }
        );

        // добавляем элементы на панель
        root.getChildren().addAll(scrollX, scrollY, scrollOpacity, rect, choiceBox);

        primaryStage.setTitle("ScrollBar");
        primaryStage.setScene(new Scene(root, 450, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
