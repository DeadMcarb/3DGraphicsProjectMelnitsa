package com.example.zero;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Camera;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Control {

    private double anchorX, anchorY;
    private double anchorAngleX = 0;
    private double anchorAngleY = 0;
    private final DoubleProperty angleX = new SimpleDoubleProperty(0);
    private final DoubleProperty angleY = new SimpleDoubleProperty(0);
    Scene scene;
    Stage stage;
    Camera camera;
    GroupExtended group;

    public Control(Scene scene, Stage stage, Camera camera, GroupExtended group){
        this.scene = scene;
        this.stage = stage;
        this.camera = camera;
        this.group = group;
    }

    public void EventHandler() {
        mouseEventHandler();
        keyboardEventHandler();
    }


    private void mouseEventHandler(){
        Rotate xRotate;
        Rotate yRotate;
        group.getTransforms().addAll(
                xRotate = new Rotate(0, Rotate.X_AXIS),
                yRotate = new Rotate(0, Rotate.Y_AXIS)
        );
        xRotate.angleProperty().bind(angleX);
        yRotate.angleProperty().bind(angleY);

        scene.setOnMousePressed(event -> {
            anchorX = event.getSceneX();
            anchorY = event.getSceneY();
            anchorAngleX = angleX.get();
            anchorAngleY = angleY.get();
        });

        scene.setOnMouseDragged(event -> {
            angleX.set(anchorAngleX - (anchorY - event.getSceneY()));
            angleY.set(anchorAngleY + anchorX - event.getSceneX());
        });
    }

    private void scrollZoomHandler(){
        stage.addEventHandler(ScrollEvent.SCROLL, event -> {
            //Get how much scroll was done in Y axis.
            double delta = event.getDeltaY();
            //Add it to the Z-axis location.
            group.translateZProperty().set(group.getTranslateZ() + delta);
        });
    }

     private void keyboardEventHandler() {
        stage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            switch (event.getCode()) {
                case W -> {
                    camera.translateZProperty().set(camera.getTranslateZ() + 100);
                }
                case S -> {
                    camera.translateZProperty().set(camera.getTranslateZ() - 100);
                }
                case A -> {
                    camera.translateXProperty().set(camera.getTranslateX() + 10);
                }
                case D -> {
                    camera.translateXProperty().set(camera.getTranslateX() - 10);
                }
                case LEFT -> {
                    group.rotateByY(15);
                }
                case RIGHT -> {
                    group.rotateByY(-15);
                }
                case UP -> {
                    group.rotateByX(-15);
                }
                case DOWN -> {
                    group.rotateByX(15);
                }
            }
        });
    }
}
