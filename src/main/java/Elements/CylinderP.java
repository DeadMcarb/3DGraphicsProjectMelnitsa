package Elements;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;

public class CylinderP {
    private Cylinder cylinder;
    public CylinderP(double radius, double height, Color color){
        cylinder = new Cylinder(radius, height);
        PhongMaterial material = new PhongMaterial(color);
        material.setSpecularColor(Color.BLACK);
        cylinder.setMaterial(material);
    }

    public Cylinder getCylinder(){
        return cylinder;
    }
    public Cylinder setPosition(double x, double y, double z) {
        cylinder.translateXProperty().set(x);
        cylinder.translateYProperty().set(y);
        cylinder.translateZProperty().set(z);

        return cylinder;
    }

    public Cylinder setRotate(double xAngle, double yAngle, double zAngle){
        cylinder.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        cylinder.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        cylinder.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        return cylinder;
    }
}
