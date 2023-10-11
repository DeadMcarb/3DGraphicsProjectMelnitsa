package Components;

import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class RAM {
    int x, y, z, width, height, depth, xAngle, yAngle, zAngle;
    GroupExtended group;
    boolean on;

    public RAM(int x, int y, int z, int width, int height, int depth, int xAngle, int yAngle, int zAngle, GroupExtended group, boolean on) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.group = group;
        this.on = on;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
    }

    public void init() {
        GroupExtended ram = new GroupExtended();

        Panel raMpay = new Panel(height,depth,width,Color.BEIGE, on);
        raMpay.setPosition(100,0,90);
        ram.getChildren().add(raMpay.getPanel());

        Panel chip1 = new Panel(3, height, 15, Color.rgb(40, 40, 40), on);
        chip1.setPosition(100, -10, 90);
        chip1.setRotate(90,0,90);
        ram.getChildren().add(chip1.getPanel());

        Panel chip2 = new Panel(15, 15, width+2, Color.rgb(40, 40, 40), on);
        chip2.setPosition(100, 10, 90);
        ram.getChildren().add(chip2.getPanel());

        Panel chip3 = new Panel(15, 15, width+2, Color.rgb(40, 40, 40), on);
        chip3.setPosition(100, 30, 90);
        ram.getChildren().add(chip3.getPanel());

        Panel chip4 = new Panel(15, 15, width+2, Color.rgb(40, 40, 40), on);
        chip4.setPosition(100, 50, 90);
        ram.getChildren().add(chip4.getPanel());

        Panel chip5 = new Panel(15, 15, width+2, Color.rgb(40, 40, 40), on);
        chip5.setPosition(100, -30, 90);
        ram.getChildren().add(chip5.getPanel());

        Panel chip6 = new Panel(15, 15, width+2, Color.rgb(40, 40, 40), on);
        chip6.setPosition(100, -50, 90);
        ram.getChildren().add(chip6.getPanel());

        ram.translateXProperty().set(x);
        ram.translateYProperty().set(y);
        ram.translateZProperty().set(z);

        ram.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        ram.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        ram.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(ram);
    }

}