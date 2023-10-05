package Components;

import Elements.CylinderP;
import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;

public class Motherboard {
    int x, y, z, width, height, depth;
    GroupExtended group;
    boolean on;

    public Motherboard(int x, int y, int z, int width, int height, int depth, GroupExtended group, boolean on) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.group = group;
        this.on = on;
    }

    public void init() {
        Panel motherboard = new Panel(5, 580, 480, Color.rgb(20, 20, 20));
        motherboard.setPosition(-135, -60, -90);
        group.getChildren().add(motherboard.getPanel());

        Panel chip = new Panel(3, 15, 15, Color.rgb(40, 40, 40));
        chip.setPosition(-130, 0, 15);
        group.getChildren().add(chip.getPanel());

        CylinderP capacitor = new CylinderP(6, 15, Color.YELLOW);
        capacitor.setRotate(0, 0, 90);
        capacitor.setPosition(-130, 0, 0);
        group.getChildren().add(capacitor.getCylinder());

        CylinderP mounting = new CylinderP(8, 6, Color.WHITE);
        mounting.setRotate(0, 0, 90);
        mounting.setPosition(-130, -5, -15);
        group.getChildren().add(mounting.getCylinder());

        Panel powerConnector = new Panel(5, 10, 15, Color.GRAY);
        powerConnector.setRotate(0, 0, 90);
        powerConnector.setPosition(50, 50, 50);
        group.getChildren().add(powerConnector.getPanel());
    }

}