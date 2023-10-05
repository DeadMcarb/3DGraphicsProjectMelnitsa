package Components;

import com.example.zero.GroupExtended;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
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
       Cylinder cylinder = new Cylinder(radius/5, 35);
       PhongMaterial material = new PhongMaterial(Color.SADDLEBROWN);
       material.setSpecularColor(Color.SADDLEBROWN);
       cylinder.setMaterial(material);
       Rotate rotate = new Rotate(90, Rotate.X_AXIS);
       cylinder.getTransforms().add(rotate);
       GroupExtended propeller = new GroupExtended();
       propeller.getChildren().add(cylinder);
       drawBlade(radius,1, 0, propeller);
       drawBlade(radius,1, 60, propeller);
       drawBlade(radius,1, 120, propeller);
       drawBlade(radius,1, 180, propeller);
       drawBlade(radius,-1, 60, propeller);
       drawBlade(radius,-1, 120, propeller);
       GroupExtended cooler = new GroupExtended();
       drawCircle(radius, 35, cooler);
       cooler.getChildren().add(propeller);

       if(on) {
           prepareAnimation(propeller, speed);
       }

       cooler.translateXProperty().set(x);
       cooler.translateYProperty().set(y);
       cooler.translateZProperty().set(z);
       group.getChildren().add(cooler);
   }

    private static void drawCircle(int radius, int height, GroupExtended group) {
        int n = (int) Math.ceil(10 * radius);
        double angleStep = 360.0 / n;

        for (int i = 0; i < n; i++) {
            double angle = i * angleStep;
            int x = (int) (radius * Math.cos(Math.toRadians(angle)));
            int y = (int) (radius * Math.sin(Math.toRadians(angle)));
            Box box;
            if(!((angle == 0)||(angle==90)||(angle==180)||(angle==270))) {
                box = new Box(15, 20, height);
            } else {
                box = new Box(16, radius * 2 + 16, height);
            }
            PhongMaterial material = new PhongMaterial(Color.BEIGE);
            material.setSpecularColor(Color.ROYALBLUE);
            box.setMaterial(material);
            box.translateXProperty().set(x);
            box.translateYProperty().set(y);
            box.setRotate(angle);
            group.getChildren().add(box);
        }
    }

    private static void drawBlade(int radius, int ox, int rAngle, GroupExtended group){
        Group blade = new Group();
        int width = Math.abs(ox);
        double height = radius / 4;
        int length = radius - 25;
        int n = length / Math.abs(width);
        double angle = -35;
        double angleStep = (double) 60 / n;
        int x = ox*10;
        double heightStep = (height + 5) / n;

        for (int i = 0; i < n; i++) {
            Box box = new Box(height, width, 1);
            x+=ox;
            box.translateYProperty().set(x);
            angle += angleStep;
            box.getTransforms().add(new Rotate(-angle, Rotate.Y_AXIS));
            PhongMaterial material = new PhongMaterial(Color.SADDLEBROWN);
            material.setSpecularColor(Color.BLACK);
            box.setMaterial(material);
            blade.getChildren().add(box);
            height += heightStep;
        }
        if (rAngle > 0) blade.getTransforms().add(new Rotate(rAngle + 360, Rotate.Z_AXIS));
        group.getChildren().add(blade);
    }

    private static void prepareAnimation(Node obj, int speedCooler) {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                obj.getTransforms().add(new Rotate(obj.getRotate()+speedCooler, Rotate.Z_AXIS));
            }
        };
        timer.start();
    }
}
