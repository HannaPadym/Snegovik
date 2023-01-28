package com.example.kvadro;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;

public class Kvadratn extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image image = new Image(new FileInputStream("src/main/java/com/example/kvadro/cats.png"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        Path path = new Path();
        path.getElements().add(new MoveTo(20, 20));
        path.getElements().add(new LineTo(500, 20));
        path.getElements().add(new LineTo(500, 400));
        path.getElements().add(new LineTo(20, 400));
        path.getElements().add(new LineTo(20, 30));
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setPath(path);
        pathTransition.setNode(imageView);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
       // pathTransition.setAutoReverse(true);
        pathTransition.play();



        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);
        root.getChildren().add(imageView);
        stage.setTitle("Kvadro");
        stage.setScene(scene);
        stage.show();
    }
}
