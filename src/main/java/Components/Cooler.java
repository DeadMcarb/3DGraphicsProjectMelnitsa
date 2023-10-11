package Components;

import Elements.CylinderP;
import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.transform.Rotate;

public class Cooler {
    int x, y, z, radius, speed, xAngle, yAngle, zAngle;
    GroupExtended group;
    boolean on;


    public Cooler(int x, int y, int z, int radius, int speed, int xAngle, int yAngle, int zAngle, GroupExtended group, boolean on) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
        this.speed = speed;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
        this.group = group;
        this.on = on;
    }

    public void init() {
        CylinderP cylinder = new CylinderP(radius / 5, 35, Color.SADDLEBROWN, on);
        cylinder.setRotate(90, 0, 0);

        GroupExtended propeller = new GroupExtended();
        propeller.getChildren().add(cylinder.getCylinder());
        drawBlade(radius, 1, 0, propeller, on);
        drawBlade(radius, 1, 60, propeller, on);
        drawBlade(radius, 1, 120, propeller, on);
        drawBlade(radius, 1, 180, propeller, on);
        drawBlade(radius, -1, 60, propeller, on);
        drawBlade(radius, -1, 120, propeller, on);
        GroupExtended cooler = new GroupExtended();
        drawCircle(radius, 35, cooler, on);
        cooler.getChildren().add(propeller);

        prepareAnimation(propeller, speed);


        cooler.translateXProperty().set(x);
        cooler.translateYProperty().set(y);
        cooler.translateZProperty().set(z);

        cooler.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        cooler.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        cooler.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(cooler);
    }

    private void drawCircle(int radius, int height, GroupExtended group, boolean on) {
        int n = (int) Math.ceil(1 * radius);
        double angleStep = 360.0 / n;

        for (int i = 0; i < n; i++) {
            double angle = i * angleStep;
            int x = (int) (radius * Math.cos(Math.toRadians(angle)));
            int y = (int) (radius * Math.sin(Math.toRadians(angle)));
            Panel box;
            if (!((angle == 0) || (angle == 90) || (angle == 180) || (angle == 270))) {
                box = new Panel(15, 20, height, Color.BEIGE, on);
            } else {
                box = new Panel(16, radius * 2 + 16, height, Color.BEIGE, on);
            }
            box.setPosition(x, y, 0);
            box.setSpecular(Color.BLACK);
            box.setRotate(0, 0, angle);
            group.getChildren().add(box.getPanel());
        }
    }

    private static void drawBlade(int radius, int ox, int rAngle, GroupExtended group, boolean on) {
        Group blade = new Group();
        int width = Math.abs(ox);
        double height = radius / 4;
        int length = radius - 25;
        int n = length / Math.abs(width);
        double angle = -35;
        double angleStep = (double) 60 / n;
        int x = ox * 10;
        double heightStep = (height + 5) / n;

        for (int i = 0; i < n; i++) {
            Panel box = new Panel(height, width, 1, Color.SADDLEBROWN, on);
            x += ox;
            box.setPosition(0, x, 0);
            angle += angleStep;
            box.setRotate(0, -angle, 0);
            blade.getChildren().add(box.getPanel());
            height += heightStep;
        }
        if (rAngle > 0) blade.getTransforms().add(new Rotate(rAngle + 360, Rotate.Z_AXIS));
        group.getChildren().add(blade);
    }

    private static void prepareAnimation(Node obj, int speedCooler) {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                obj.getTransforms().add(new Rotate(obj.getRotate() + speedCooler, Rotate.Z_AXIS));
            }
        };
        timer.start();
    }
}
