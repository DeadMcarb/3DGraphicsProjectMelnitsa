package com.example.zero;

import Components.CasePC;
import Components.Motherboard;
import Components.Radiator;
import Components.VideoCard;
import RadioComponents.Chip;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GroupExtended mainGroup = new GroupExtended();

//        VideoCard videoCard = new VideoCard(0, 0, 0, 10, 0, 0, 0, mainGroup, true);
//        videoCard.init();

        Chip chipset = new Chip(0, 0, 0, 40, 80, 0, 0, 0, mainGroup);
        chipset.init();



//        CasePC case_PC = new CasePC(mainGroup, true);
//        case_PC.init();


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