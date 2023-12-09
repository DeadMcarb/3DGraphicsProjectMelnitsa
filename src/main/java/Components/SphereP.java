package Components;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;

public class SphereP {
    private Sphere sphere;
    private PhongMaterial material;

    public SphereP(double radius, Color color, boolean wireframe) {
        sphere = new Sphere(radius);
        material = new PhongMaterial(color);
        material.setSpecularColor(Color.BLACK);
        sphere.setMaterial(material);

        if (wireframe) {
            sphere.setDrawMode(DrawMode.LINE);
        }
    }

    public void setSpecular(Color color) {
        material.setSpecularColor(color);
    }

    public Sphere getSphere() {
        return sphere;
    }

    public Sphere setPosition(double x, double y, double z) {
        sphere.translateXProperty().set(x);
        sphere.translateYProperty().set(y);
        sphere.translateZProperty().set(z);

        return sphere;
    }

    public Sphere setRotate(double xAngle, double yAngle, double zAngle) {
        sphere.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        sphere.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        sphere.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        return sphere;
    }
}
