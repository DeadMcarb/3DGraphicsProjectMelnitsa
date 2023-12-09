package com.example.zero;

import Components.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GroupExtended mainGroup = new GroupExtended();

        Airplane case_PC = new Airplane(0,0,0,mainGroup, true);
        case_PC.init();



        Camera camera = new PerspectiveCamera(true);
        Scene scene = new Scene(mainGroup, 1440, 800, true);
        scene.setFill(Color.DEEPSKYBLUE);
        scene.setCamera(camera);
        camera.translateXProperty().set(0);
        camera.translateYProperty().set(0);
        camera.translateZProperty().set(-2500);

        camera.setNearClip(1);
        camera.setFarClip(10000);

        mainGroup.rotateByX(15);
        mainGroup.rotateByY(125);
        Control control = new Control(scene, stage, camera, mainGroup, case_PC);
        control.EventHandler();

        stage.setTitle("airplane");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch();
    }
}