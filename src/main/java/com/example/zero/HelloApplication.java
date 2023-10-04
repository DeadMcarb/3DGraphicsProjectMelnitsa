package com.example.zero;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point3D;
import javafx.scene.Camera;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Box box = new Box(200, 20, 50);
        GroupExtended group = new GroupExtended();
        group.getChildren().add(box);

        Camera camera = new PerspectiveCamera(true);
        Scene scene = new Scene(group, 1440, 800);
        scene.setFill(Color.SILVER);
        scene.setCamera(camera);
        camera.translateXProperty().set(0);
        camera.translateYProperty().set(0);
        camera.translateZProperty().set(-500);

        camera.setNearClip(1);
        camera.setFarClip(1000);

        group.rotateByX(15);
        group.rotateByY(15);
        Control control = new Control(scene, stage, camera, group);
        control.EventHandler();
        control.mouseEventHandler();

        stage.setTitle("3D PC!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}