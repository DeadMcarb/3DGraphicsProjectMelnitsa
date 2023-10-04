package com.example.zero;

import javafx.application.Application;
import javafx.scene.Camera;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
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

        Cylinder center = new Cylinder(20, 35);
        PhongMaterial material4 = new PhongMaterial(Color.SADDLEBROWN);
        material4.setSpecularColor(Color.SADDLEBROWN);
        center.setMaterial(material4);
        Rotate rotate = new Rotate(90, Rotate.X_AXIS);
        center.getTransforms().add(rotate);




        GroupExtended group = new GroupExtended();
        group.getChildren().add(center);
//        group.getChildren().add(box2);
        drawCircle(100, 35, group);
//        drawBlade(100, 90, group);
        drawBlade(100, 0, group);

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

    public static void drawCircle(int radius, int height, GroupExtended group) {
        //        box2.translateXProperty().set();
        //        box2.translateYProperty().set();

        int n = (int) Math.ceil(10 * radius);
        double angleStep = 360.0 / n;

        for (int i = 0; i < n; i++) {
            double angle = i * angleStep;
            int x = (int) (radius * Math.cos(Math.toRadians(angle)));
            int y = (int) (radius * Math.sin(Math.toRadians(angle)));

            Box box;

            if(!((angle == 0)||(angle==90)||(angle==180)||(angle==270))) {
                box = new Box(15, 20, height); // Задайте ширину, высоту и длину как нужно
            } else {
                box = new Box(16, radius * 2 + 16, height); // Задайте ширину, высоту и длину как нужно
            }

            PhongMaterial material = new PhongMaterial(Color.BEIGE);
            material.setSpecularColor(Color.ROYALBLUE);
            box.setMaterial(material);
            box.translateXProperty().set(x);
            box.translateYProperty().set(y);
            box.setRotate(angle);
            group.getChildren().add(box);
        }
    }

    public static void drawBlade(int radius, int rotate, GroupExtended group){
        int width = 1;
        //max - 50
        //min will be 25
        double height = 25;
        int length = radius - 25;   //blade length
        int n = length / width;     //get polygon amount
        double angle = -35;            //start angle
        double angleStep = (double) 60 / n; //get angle step
        int x = 10;
        int y = 0;
        double heightStep = 30.0 / n;
        System.out.println(angleStep);

        for (int i = 0; i < n; i++) {
            Box box = new Box(height, width, 1);
            x+=width;
            box.translateYProperty().set(x);
            angle += angleStep;
//            box.getTransforms().add();
            box.getTransforms().addAll(new Rotate(-angle, Rotate.Y_AXIS));
            PhongMaterial material = new PhongMaterial(Color.SADDLEBROWN);
            material.setSpecularColor(Color.BLACK);
            box.setMaterial(material);
            box.setRotate(-rotate);
            group.getChildren().add(box);
            height += heightStep;
        }

        group.setRotate(rotate);
    }

    public static void main(String[] args) {
        launch();
    }
}