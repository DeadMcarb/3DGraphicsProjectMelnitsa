package Components;

import Elements.CylinderP;
import Elements.Panel;
import RadioComponents.Chip;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class Drive {
    int x, y, z, xAngle, yAngle, zAngle;
    GroupExtended group;

    public Drive(int x, int y, int z, int xAngle, int yAngle, int zAngle, GroupExtended group) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
        this.group = group;
    }

    public void init(){
        GroupExtended drive = new GroupExtended();

        Panel board = new Panel(45, 140, 5, Color.BLACK);
        drive.getChildren().add(board.getPanel());

        Panel main_connector = new Panel(30, 15, 5, Color.rgb(64, 54, 52));
        main_connector.setPosition(-5, 70, 0);
        drive.getChildren().add(main_connector.getPanel());

        Panel second_connector = new Panel(7, 15, 5, Color.rgb(64, 54, 52));
        second_connector.setPosition(16, 70, 0);
        drive.getChildren().add(second_connector.getPanel());

        double position = -((double) (45 - 4) / 2)+1.85;
        for (int i = 1; i <= 10; i++) {
            Panel p1 = new Panel(2, 5, 3, Color.GOLD);
            p1.setSpecular(Color.GOLD);
            p1.setPosition(position, 75.2, 1.3);
            p1.setRotate(0, 0,0);
            drive.getChildren().add(p1.getPanel());
            position += 3;
        }

        Panel pin_1 = new Panel(2, 5, 3, Color.GOLD);
        pin_1.setSpecular(Color.GOLD);
        pin_1.setPosition(18, 75.2, 1.3);
        drive.getChildren().add(pin_1.getPanel());

        Panel pin_2 = new Panel(2, 5, 3, Color.GOLD);
        pin_2.setSpecular(Color.GOLD);
        pin_2.setPosition(15, 75.2, 1.3);
        drive.getChildren().add(pin_2.getPanel());

        Chip memory_1 = new Chip(0, -45, 4, 25, 25, 0, 0, 0, drive, Color.BLACK);
        memory_1.setDepth(3);
        memory_1.init();

        Chip memory_2 = new Chip(0, -15, 4, 25, 25, 0, 0, 0, drive, Color.BLACK);
        memory_2.setDepth(3);
        memory_2.init();

        Chip memory_3 = new Chip(0, 29, 4, 25, 25, 0, 0, 0, drive, Color.BLACK);
        memory_3.setDepth(3);
        memory_3.init();

        Chip radio_1 = new Chip(8, 7, 4, 10, 11, 0, 0, 90, drive, Color.BLACK);
        radio_1.setDepth(3);
        radio_1.init();

        Chip radio_2 = new Chip(-4, 7, 4, 10, 5, 0, 0, 90, drive, Color.ROSYBROWN);
        radio_2.setDepth(2);
        radio_2.init();

        Chip radio_3 = new Chip(-12, 7, 4, 10, 5, 0, 0, 90, drive, Color.ROSYBROWN);
        radio_3.setDepth(2);
        radio_3.init();

        Chip chip = new Chip(0, 55, 4, 25, 20, 0, 0, 0, drive, Color.SILVER);
        chip.setDepth(3);
        chip.init();

        Panel pin_3 = new Panel(2, 5, 3, Color.GOLD);
        pin_3.setSpecular(Color.GOLD);
        pin_3.setPosition(-8, -65, 1.3);
        drive.getChildren().add(pin_3.getPanel());

        Panel pin_4 = new Panel(2, 5, 3, Color.GOLD);
        pin_4.setSpecular(Color.GOLD);
        pin_4.setPosition(-11, -65, 1.3);
        drive.getChildren().add(pin_4.getPanel());

        CylinderP pin_5 = new CylinderP(1, 3, Color.GOLD);
        pin_5.setSpecular(Color.GOLD);
        pin_5.setPosition(5, -63, 1.2);
        pin_5.setRotate(90, 0, 0);
        drive.getChildren().add(pin_5.getCylinder());

        CylinderP pin_6 = new CylinderP(1, 3, Color.GOLD);
        pin_6.setSpecular(Color.GOLD);
        pin_6.setPosition(8, -63, 1.2);
        pin_6.setRotate(90, 0, 0);
        drive.getChildren().add(pin_6.getCylinder());

        CylinderP pin_7 = new CylinderP(1, 3, Color.GOLD);
        pin_7.setSpecular(Color.GOLD);
        pin_7.setPosition(11, -63, 1.2);
        pin_7.setRotate(90, 0, 0);
        drive.getChildren().add(pin_7.getCylinder());

        CylinderP pin_8= new CylinderP(1, 3, Color.GOLD);
        pin_8.setSpecular(Color.GOLD);
        pin_8.setPosition(14, -63, 1.2);
        pin_8.setRotate(90, 0, 0);
        drive.getChildren().add(pin_8.getCylinder());

        CylinderP pin_9 = new CylinderP(1, 3, Color.GOLD);
        pin_9.setSpecular(Color.GOLD);
        pin_9.setPosition(5, -66, 1.2);
        pin_9.setRotate(90, 0, 0);
        drive.getChildren().add(pin_9.getCylinder());

        CylinderP pin_10 = new CylinderP(1, 3, Color.GOLD);
        pin_10.setSpecular(Color.GOLD);
        pin_10.setPosition(8, -66, 1.2);
        pin_10.setRotate(90, 0, 0);
        drive.getChildren().add(pin_10.getCylinder());

        CylinderP pin_11 = new CylinderP(1, 3, Color.GOLD);
        pin_11.setSpecular(Color.GOLD);
        pin_11.setPosition(11, -66, 1.2);
        pin_11.setRotate(90, 0, 0);
        drive.getChildren().add(pin_11.getCylinder());

        CylinderP pin_12= new CylinderP(1, 3, Color.GOLD);
        pin_12.setSpecular(Color.GOLD);
        pin_12.setPosition(14, -66, 1.2);
        pin_12.setRotate(90, 0, 0);
        drive.getChildren().add(pin_12.getCylinder());

        drive.translateXProperty().set(x);
        drive.translateYProperty().set(y);
        drive.translateZProperty().set(z);

        drive.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        drive.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        drive.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(drive);
    }
}
