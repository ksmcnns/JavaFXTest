package com.example.demojavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayClock extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ClockPane clock = new ClockPane();

        BorderPane root = new BorderPane();
        root.setCenter(clock);

        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("Analog Clock");
        stage.show();

    }
}
