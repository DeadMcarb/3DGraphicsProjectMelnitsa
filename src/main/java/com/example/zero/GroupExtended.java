package com.example.zero;

import javafx.scene.Group;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;

public class GroupExtended extends Group {
    Rotate rotate;
    Transform transform = new Rotate();

    void rotateByX(int angle) {
            rotate = new Rotate(angle, Rotate.X_AXIS);
            transform =transform.createConcatenation(rotate);
            this.getTransforms().clear();
            this.getTransforms().addAll(transform);
    }

    void rotateByY(int angle) {
        rotate = new Rotate(angle, Rotate.Y_AXIS);
        transform =transform.createConcatenation(rotate);
        this.getTransforms().clear();
        this.getTransforms().addAll(transform);
    }
}
