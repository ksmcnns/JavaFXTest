package com.example.demojavafx;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rec1 = new Rectangle(10,10,100,100);
        FadeTransition ft = new FadeTransition(Duration.millis(3000), rec1);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(2);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

        Pane root = new Pane();
        root.getChildren().addAll(rec1);
        stage.setScene(new Scene(root,600,600));
        stage.show();
    }
}
