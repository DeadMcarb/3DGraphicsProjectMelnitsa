package com.example.zero;

import Components.*;
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

        //вызывать в материнке
//        VideoCard videoCard = new VideoCard(10, 40, -140, 10, 270, 0, 90, mainGroup, true);
//        videoCard.init();
//
//        CasePC case_PC = new CasePC(0,0,0,0,0,0,mainGroup, true);
//        case_PC.init();

        Drive ssd = new Drive(0, 0, 0, 0,0 ,0, mainGroup);
        ssd.init();


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