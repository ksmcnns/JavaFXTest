package com.example.demojavafx;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.time.LocalDateTime;

public class ClockPane extends Pane {
    private  int Hour;
    private  int Min;
    private int Sec;

    public  ClockPane(){
        setCurrentTime();
    }
    void setCurrentTime(){
        LocalDateTime now = LocalDateTime.now();
        Hour = now.getHour();
        Min = now.getMinute();
        Sec = now.getSecond();
        paintClock();
    }
    public void paintClock(){
        double centerX = getWidth() * 0.5;
        double centerY = getHeight() * 0.5;
        double radius = Math.min(getWidth(),getHeight()) * 0.5 *0.8;

        Circle circle = new Circle(centerX,centerY,radius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLUE);
        circle.setStrokeWidth(5);

        double secLenght = radius * 0.9;
        double secX = centerX + secLenght * Math.sin(Sec * 2.0 * Math.PI / 60.0);
        double secY = centerX - secLenght * Math.cos(Sec * 2.0 * Math.PI / 60.0);
        Line secLine = new Line(centerX, centerY, secX, secY);
        secLine.setStroke(Color.GREEN);
        secLine.setStrokeWidth(2);

        double minLenght = radius * 0.75;
        double minX = centerX + minLenght * Math.sin(Min * 2.0 * Math.PI / 60.0);
        double minY = centerX - minLenght * Math.cos(Min * 2.0 * Math.PI / 60.0);
        Line minLine = new Line(centerX, centerY, minX, minY);
        minLine.setStroke(Color.RED);
        minLine.setStrokeWidth(4);

        double hourLenght = radius * 0.6;
        double hourX = centerX + hourLenght * Math.sin((Hour % 12 + Min/60.0) * 2 * Math.PI / 12);
        double hourY = centerX - hourLenght * Math.cos((Hour % 12 + Min/60.0) * 2 * Math.PI / 12);
        Line hourLine = new Line(centerX, centerY, hourX, hourY);
        hourLine.setStroke(Color.BLACK);
        hourLine.setStrokeWidth(6);


        getChildren().clear();
        getChildren().addAll(circle,secLine,minLine,hourLine);

    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        paintClock();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        paintClock();
    }
}
