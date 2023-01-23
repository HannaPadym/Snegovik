package com.example.studyfx;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;

public class ImageStudion extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image image = new Image(new FileInputStream("src/img.png"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);
        KeyValue xValue = new KeyValue(imageView.xProperty(), 600);
        KeyValue yValue = new KeyValue(imageView.yProperty(), 600);
        KeyFrame keyFrame = new KeyFrame(Duration.millis(3000), xValue, yValue);
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();


        Group group = new Group();
        group.getChildren().add(imageView);
        Scene scene = new Scene(group, 600, 600);
        stage.setScene(scene);
        stage.setTitle("ImageStudy");
        stage.show();

    }
}
