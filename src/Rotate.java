import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Rotate extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();

        Rectangle rectangle = new Rectangle(100, 100, Color.GREEN);
        rectangle.setTranslateX(100);
        rectangle.setTranslateY(100);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(3);

        rectangle.setOnMouseClicked(event -> {
            RotateTransition rt = new RotateTransition(Duration.seconds(1), rectangle);
            rt.setByAngle(180);
            rt.setCycleCount(1);
            rt.setAutoReverse(true);
            rt.play();

            ScaleTransition st = new ScaleTransition(Duration.seconds(1), rectangle);
            st.setToX(2);
            st.setToY(2);
            st.play();

            StrokeTransition borderColor = new StrokeTransition(Duration.seconds(1), rectangle);
            borderColor.setFromValue(Color.BLACK);
            borderColor.setToValue(Color.BLUE);
            borderColor.play();

            FillTransition ft = new FillTransition(Duration.seconds(1), rectangle);
            ft.setFromValue(Color.GREEN);
            ft.setToValue(Color.RED);
            ft.play();
        });

        root.getChildren().addAll(rectangle);
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
