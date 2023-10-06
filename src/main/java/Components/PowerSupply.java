package Components;

import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class PowerSupply {
    int x, y, z, xAngle, yAngle ,zAngle;
    GroupExtended group;
    boolean on;

    public PowerSupply(int x, int y, int z, int xAngle, int yAngle, int zAngle, GroupExtended group, boolean on) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
        this.group = group;
        this.on = on;
    }

    public void init(){

        GroupExtended powerSupply = new GroupExtended();

        Panel back_left_cage = new Panel(8, 120, 200, Color.DARKGRAY);
        back_left_cage.setPosition(-120, 330, -290);
        powerSupply.getChildren().add(back_left_cage.getPanel());

        Panel back_right_cage = new Panel(240, 120, 8, Color.DARKGRAY);
        back_right_cage.setPosition(0, 330, -190);
        powerSupply.getChildren().add(back_right_cage.getPanel());

        Panel front_left_cage = new Panel(240, 120, 8, Color.DARKGRAY);
        front_left_cage.setPosition(0, 330, -390);
        powerSupply.getChildren().add(front_left_cage.getPanel());

        Panel front_right_cage = new Panel(8, 120, 200, Color.DARKGRAY);
        front_right_cage.setPosition(120, 330, -290);
        powerSupply.getChildren().add(front_right_cage.getPanel());

        initCoolers();

        powerSupply.translateXProperty().set(x);
        powerSupply.translateYProperty().set(y);
        powerSupply.translateZProperty().set(z);

        powerSupply.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        powerSupply.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        powerSupply.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(powerSupply);
    }

    private void initCoolers() {
        Cooler cooler = new Cooler(0, 370, -290, 80, 1, 90,0,0, group, true);
        cooler.init();
    }
}
