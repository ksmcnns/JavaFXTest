package com.example.demojavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BallAnimation extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BallPane ball = new BallPane();

        Scene scene = new Scene(ball,400,300);
        stage.setScene(scene);
        stage.show();
    }
}
