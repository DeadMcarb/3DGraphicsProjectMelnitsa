package com.example.zero;

import javafx.scene.Camera;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Control {
    Stage stage;
    Camera camera;
    GroupExtended group;

    public Control(Stage stage, Camera camera, GroupExtended group){
        this.stage = stage;
        this.camera = camera;
        this.group = group;
    }

    void EventHandler() {
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
