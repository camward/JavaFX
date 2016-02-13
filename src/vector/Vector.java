package vector;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Vector extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 600, 600);
        Bullet bullet = new Bullet();
        root.getChildren().add(bullet);

        scene.setOnMouseMoved(event -> {
            bullet.setTarget(event.getSceneX(), event.getScreenY());
        });

        scene.setOnMouseClicked(event -> {
            bullet.velocity = new Point2D(0, 0);
        });

        primaryStage.setTitle("vector");
        primaryStage.setScene(scene);
        primaryStage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                bullet.move();
            }
        };
        timer.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
