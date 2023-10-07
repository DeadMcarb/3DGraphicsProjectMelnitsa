package Components;

import Elements.CylinderP;
import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class Capacitor {

    int x, y, z, xAngle, yAngle, zAngle;
    GroupExtended group;

    public Capacitor(int x, int y, int z, int xAngle, int yAngle, int zAngle, GroupExtended group) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
        this.group = group;
    }

    public void init(){
        GroupExtended capacitor = new GroupExtended();

        CylinderP el_1 = new CylinderP(4.6, 15, Color.SILVER);
        el_1.setSpecular(Color.WHITE);
        el_1.setRotate(0, 0, 90);
        capacitor.getChildren().add(el_1.getCylinder());

        CylinderP el_2 = new CylinderP(6, 14.6, Color.BLACK);
        el_2.setRotate(0, 0, 90);
        el_2.setSpecular(Color.WHITE);
        capacitor.getChildren().add(el_2.getCylinder());

        Panel el_3 = new Panel(2, 14.7, 2, Color.SILVER);
        el_3.setPosition(0, 5.07, 0);
        el_3.setRotate(0, 0, 90);
        el_3.setSpecular(Color.WHITE);
        capacitor.getChildren().add(el_3.getPanel());

        capacitor.translateXProperty().set(x);
        capacitor.translateYProperty().set(y);
        capacitor.translateZProperty().set(z);

        capacitor.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        capacitor.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        capacitor.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(capacitor);
    }
}
