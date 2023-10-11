package Elements;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.scene.transform.Rotate;

public class Panel {
    private Box box;
    PhongMaterial material;
    public Panel(double width, double height, double depth, Color color, Boolean line){
        box = new Box(width, height, depth);
        material = new PhongMaterial(color);
        material.setSpecularColor(Color.BLACK);
        box.setMaterial(material);
        if (line) box.setDrawMode(DrawMode.LINE);
    }

    public void setSpecular(Color color){
        material.setSpecularColor(color);
    }

    public Box getPanel(){
        return box;
    }
    public void setPosition(double x, double y, double z) {
        box.translateXProperty().set(x);
        box.translateYProperty().set(y);
        box.translateZProperty().set(z);
    }

    public void setRotate(double xAngle, double yAngle, double zAngle){
        box.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        box.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        box.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));
    }
}
