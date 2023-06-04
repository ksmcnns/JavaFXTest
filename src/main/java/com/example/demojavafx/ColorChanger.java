package com.example.demojavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ColorChanger extends Application {

    Label lbl;
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.TOP_CENTER);

        lbl = new Label("BZ2014 Visual Programming");
        lbl.setFont(Font.font(20));

        Button btn = new Button("Random Color");
        btn.setOnAction((ActionEvent event)  -> { //Lambda Expression
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            Color color = Color.rgb(red, green, blue);
            lbl.setTextFill(color);
        });
       /* btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int red = (int)(Math.random()*256);
                int green = (int)(Math.random()*256);
                int blue = (int)(Math.random()*256);
                Color color = Color.rgb(red,green,blue);
                lbl.setTextFill(color);
            }
        });*/

        root.getChildren().addAll(lbl, btn);
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Color Changer");
        stage.show();
    }
       /* class ClickHandler implements EventHandler<ActionEvent>{ Inner Class
            @Override
            public void handle(ActionEvent actionEvent) {
                int red = (int)(Math.random()*256);
                int green = (int)(Math.random()*256);
                int blue = (int)(Math.random()*256);
                Color color = Color.rgb(red,green,blue);
                lbl.setTextFill(color);
            }
        }*/
}

/*class ClickHandler implements EventHandler<ActionEvent> {
    private  Label Lbl;
    public ClickHandler(Label lbl){
        Lbl = lbl;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        Color color = Color.rgb(red,green,blue);
        Lbl.setTextFill(color);
    }
}*/