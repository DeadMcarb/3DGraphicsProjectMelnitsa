package com.example.zero;

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

        Box box = new Box(200, 20, 50);
        PhongMaterial material = new PhongMaterial(Color.ROYALBLUE);
        material.setSpecularColor(Color.ROYALBLUE);
        box.setMaterial(material);

        Box box2 = new Box(20, 50, 200);
        box2.setMaterial(material);

        Cylinder cylinder = new Cylinder(20, 35);
        PhongMaterial material4 = new PhongMaterial(Color.SADDLEBROWN);
        material4.setSpecularColor(Color.SADDLEBROWN);
        cylinder.setMaterial(material4);
        Rotate rotate = new Rotate(90, Rotate.X_AXIS);
        cylinder.getTransforms().add(rotate);


        GroupExtended cooler = new GroupExtended();
        drawCircle(100, 35, cooler);
        drawBlade(100,1, 0, cooler);
        drawBlade(100,1, 60, cooler);
        drawBlade(100,1, 120, cooler);
        drawBlade(100,1, 180, cooler);
        drawBlade(100,-1, 60, cooler);
        drawBlade(100,-1, 120, cooler);



        GroupExtended group = new GroupExtended();
        group.getChildren().add(cylinder);

        Camera camera = new PerspectiveCamera(true);
        Scene scene = new Scene(group, 1440, 800, true);
        scene.setFill(Color.LIGHTPINK);
        scene.setCamera(camera);
        camera.translateXProperty().set(0);
        camera.translateYProperty().set(0);
        camera.translateZProperty().set(-750);

        camera.setNearClip(1);
        camera.setFarClip(10000);

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


    public static void drawBlade(int radius, int ox, int rAngle, GroupExtended group){
        Group blade = new Group();
        int width = Math.abs(ox);
        //max - 50
        //min will be 25
        double height = 25;
        int length = radius - 25;   //blade length
        int n = length / Math.abs(width);     //get polygon amount
        double angle = -35;            //start angle
        double angleStep = (double) 60 / n; //get angle step
        int x = ox*10;
        double heightStep = 30.0 / n;

        for (int i = 0; i < n; i++) {
            Box box = new Box(height, width, 1);
            x+=ox;
            box.translateYProperty().set(x);
            angle += angleStep;
            box.getTransforms().add(new Rotate(-angle, Rotate.Y_AXIS));
            PhongMaterial material = new PhongMaterial(Color.SADDLEBROWN);
            material.setSpecularColor(Color.BLACK);
            box.setMaterial(material);
            blade.getChildren().add(box);
            height += heightStep;
        }

        if (rAngle > 0) blade.getTransforms().add(new Rotate(rAngle + 360, Rotate.Z_AXIS));
        if(ox < 0) {
            //prepareAnimation(blade, rAngle);
        }
        group.getChildren().add(blade);

    }

    private static void prepareAnimation(Node obj, int rAngle) {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                obj.getTransforms().add(new Rotate(obj.getRotate()+0.1, Rotate.Y_AXIS));

            }
        };
        timer.start();
    }


    public static void main(String[] args) {
        launch();
    }
}