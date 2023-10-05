package com.example.zero;

import Components.CasePC;
import Components.Cooler;
import Components.VideoCard;
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

//        VideoCard videoCard = new VideoCard(0, 0, 0, 10, 0, 0, 0, mainGroup, true);
//        videoCard.init();

        CasePC case_PC = new CasePC(mainGroup, true);
        case_PC.init();


        Camera camera = new PerspectiveCamera(true);
        Scene scene = new Scene(mainGroup, 1440, 800, true);
        scene.setFill(Color.LIGHTPINK);
        scene.setCamera(camera);
        camera.translateXProperty().set(0);
        camera.translateYProperty().set(0);
        camera.translateZProperty().set(-2500);

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