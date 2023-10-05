package Components;

import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;

public class CasePC {
    GroupExtended group;
    boolean on;

    public CasePC(GroupExtended group, boolean on) {
        this.group = group;
        this.on = on;
    }

    public void init() {
        Panel back_left_cage = new Panel(10, 800, 10, Color.RED);
        back_left_cage.setPosition(-150, 0, -400);
        group.getChildren().add(back_left_cage.getPanel());

        Panel back_right_cage = new Panel(10, 800, 10, Color.BLUE);
        back_right_cage.setPosition(-150, 0, 400);
        group.getChildren().add(back_right_cage.getPanel());

        Panel front_left_cage = new Panel(10, 800, 10, Color.YELLOW);
        front_left_cage.setPosition(150, 0, -400);
        group.getChildren().add(front_left_cage.getPanel());

        Panel front_right_cage = new Panel(10, 800, 10, Color.GREEN);
        front_right_cage.setPosition(150, 0, 400);
        group.getChildren().add(front_right_cage.getPanel());

        Panel top_cover = new Panel(300, 1, 800, Color.WHITESMOKE);
        top_cover.setPosition(0, -400, 0);
        group.getChildren().add(top_cover.getPanel());


        Panel bottom_cover = new Panel(300, 1, 800, Color.WHITESMOKE);
        bottom_cover.setPosition(0, 400, 0);
        group.getChildren().add(bottom_cover.getPanel());

        Panel back_cover = new Panel(1, 800, 800, Color.WHITESMOKE);
        back_cover.setPosition(-150, 0, 0);
        group.getChildren().add(back_cover.getPanel());

        Panel front_cover = new Panel(1, 800, 800, Color.WHITESMOKE);
        front_cover.setPosition(150, 0, 0);
//        group.getChildren().add(front_cover.getPanel());

        initCoolers();
        initPowerSupply();
        initMotherboard();
    }

    private void initCoolers() {
        Cooler cooler = new Cooler(0,-220,400, 100, 1, 0,0,0, group, true);
        Cooler cooler2 = new Cooler(0,0,400, 100, 1, 0,0,0, group, true);
        Cooler cooler3 = new Cooler(0,220,400, 100, 1, 0,0,0, group, true);
        Cooler cooler4 = new Cooler(0,-220,-400, 100, 1, 0,0,0, group, true);
        cooler.init();
        cooler2.init();
        cooler3.init();
        cooler4.init();
    }
    private void initPowerSupply() {
        PowerSupply powerSupply = new PowerSupply(group, true);
        powerSupply.init();
    }
    private void initMotherboard() {
        Motherboard motherboard = new Motherboard(0, 0, 0, 0, 0, 0, group, true);
        motherboard.init();
    }

}