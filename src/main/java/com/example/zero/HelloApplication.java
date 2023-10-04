package com.example.zero;

import javafx.application.Application;
import javafx.scene.Camera;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Box box = new Box(200, 20, 50);
        PhongMaterial material = new PhongMaterial(Color.ROYALBLUE);
        material.setSpecularColor(Color.ROYALBLUE);
        box.setMaterial(material);

        Box box2 = new Box(20, 50, 200);
        box2.setMaterial(material);

        Cylinder outerCylinder = new Cylinder(25, 100);
        Cylinder innerCylinder = new Cylinder(20, 100);
        PhongMaterial material3 = new PhongMaterial(Color.GRAY);
        material3.setSpecularColor(Color.GRAY);
        PhongMaterial material4 = new PhongMaterial(Color.rgb(255,1,1,0));
        material4.setSpecularColor(Color.ROYALBLUE);
        outerCylinder.setMaterial(material3);
        innerCylinder.setMaterial(material4);




        GroupExtended group = new GroupExtended();
        group.getChildren().add(box);
        group.getChildren().add(box2);
        group.getChildren().addAll(outerCylinder, innerCylinder);

        Camera camera = new PerspectiveCamera(true);
        Scene scene = new Scene(group, 1440, 800, true);
        scene.setFill(Color.LIGHTPINK);
        scene.setCamera(camera);
        camera.translateXProperty().set(0);
        camera.translateYProperty().set(0);
        camera.translateZProperty().set(-500);

        camera.setNearClip(1);
        camera.setFarClip(1000);

        group.rotateByX(15);
        group.rotateByY(125);
        Control control = new Control(scene, stage, camera, group);
        control.EventHandler();

        stage.setTitle("3D PC!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}