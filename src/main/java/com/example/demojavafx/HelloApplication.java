package com.example.demojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label lbl = new Label("Hello");
        lbl.setMinWidth(100);
        lbl.setFont(Font.font(25));

        TextField txtf = new TextField();
        txtf.setMinWidth(100);
        lbl.textProperty().bind(txtf.textProperty());

        Rectangle rec1 = new Rectangle(25,150,60,90);
        rec1.setFill(Color.NAVY);
        rec1.setStroke(Color.BROWN);

        Rectangle rec2 = new Rectangle(25,200,60,90);
        rec2.setFill(Color.RED);
        rec2.setStroke(Color.GREEN);
        rec2.setStrokeWidth(5);

        Rectangle rec3 = new Rectangle(25,250,60,90);
        rec3.setFill(Color.YELLOW);
        rec3.setStroke(Color.ORANGE);
        rec3.setArcHeight(10);

        Pane root = new Pane();
        root.getChildren().addAll(lbl,txtf,rec1,rec2,rec3);

        stage.setScene(new Scene(root,800,600));
        stage.show();

    }

    public static void main(String[] args)
    {
        launch();
    }
}