package com.example.dateandtime;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloController {
    @FXML
    private Label timeLabel;
    @FXML
    void initialize(){
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timeLabel.setText(getCurrentDateTime());
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
    private String getCurrentDateTime()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("| HH:mm:ss | dd.MM.yyyy |");
        return dtf.format(LocalDateTime.now());
    }
}