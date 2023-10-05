package com.example.zero;

import Components.Cooler;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GroupExtended mainGroup = new GroupExtended();

        PhongMaterial material = new PhongMaterial(Color.ROYALBLUE);
        material.setSpecularColor(Color.ROYALBLUE);
        Box box = new Box(200, 20, 50);
        box.setMaterial(material);
        Box box2 = new Box(20, 50, 200);
        box2.setMaterial(material);

        Cooler cooler = new Cooler(0,0,0, 80, 1, 0,0,0, mainGroup, true);
        Cooler cooler2 = new Cooler(220,0,0, 100, 10, 0,0,0, mainGroup, false);
        cooler.init();
        cooler2.init();


        Camera camera = new PerspectiveCamera(true);
        Scene scene = new Scene(mainGroup, 1440, 800, true);
        scene.setFill(Color.LIGHTPINK);
        scene.setCamera(camera);
        camera.translateXProperty().set(0);
        camera.translateYProperty().set(0);
        camera.translateZProperty().set(-750);

        camera.setNearClip(1);
        camera.setFarClip(10000);

        mainGroup.rotateByX(15);
        mainGroup.rotateByY(125);
        Control control = new Control(scene, stage, camera, mainGroup);
        control.EventHandler();

        stage.setTitle("3D PC!");
        stage.setScene(scene);
        stage.show();
    }





    public static void main(String[] args) {
        launch();
    }
}