package Components;

import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;

public class PowerSupply {
    GroupExtended group;
    boolean on;

    public PowerSupply(GroupExtended group, boolean on) {
        this.group = group;
        this.on = on;
    }

    public void init(){
        Panel back_left_cage = new Panel(1, 120, 200, Color.DARKGRAY);
        back_left_cage.setPosition(-120, 330, -290);
        group.getChildren().add(back_left_cage.getPanel());

        Panel back_right_cage = new Panel(240, 120, 1, Color.DARKGRAY);
        back_right_cage.setPosition(0, 330, -190);
        group.getChildren().add(back_right_cage.getPanel());

        Panel front_left_cage = new Panel(240, 120, 1, Color.DARKGRAY);
        front_left_cage.setPosition(0, 330, -390);
        group.getChildren().add(front_left_cage.getPanel());

        Panel front_right_cage = new Panel(1, 120, 200, Color.DARKGRAY);
        front_right_cage.setPosition(120, 330, -290);
        group.getChildren().add(front_right_cage.getPanel());

        Cooler cooler = new Cooler(0, 370, -290, 80, 1, 90,0,0, group, true);
        cooler.init();
    }
}
