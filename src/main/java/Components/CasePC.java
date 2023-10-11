package Components;

import Elements.CylinderP;
import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;

import java.util.Random;

public class CasePC {


    int x, y, z, xAngle, yAngle, zAngle;
    GroupExtended casePC = new GroupExtended();
    GroupExtended group;
    boolean on;

    public CasePC(int x, int y, int z, GroupExtended group, boolean on) { this.x = x;
        this.y = y;
        this.z = z;
        this.group = group;
        this.on = on;
    }

    public void redraw(boolean mode){
        this.on = mode;
        group.getChildren().remove(casePC);
        casePC = new GroupExtended();
        init();
    }

    public void init() {

        CylinderP back_left_cage = new CylinderP(4, 800, Color.WHITESMOKE, on);
        back_left_cage.setPosition(-150, 0, -400);
        casePC.getChildren().add(back_left_cage.getCylinder());

        CylinderP back_right_cage = new CylinderP(4, 800, Color.WHITESMOKE, on);
        back_right_cage.setPosition(-150, 0, 400);
        casePC.getChildren().add(back_right_cage.getCylinder());

        CylinderP front_left_cage = new CylinderP(4, 800, Color.WHITESMOKE, on);
        front_left_cage.setPosition(150, 0, -400);
        casePC.getChildren().add(front_left_cage.getCylinder());

        CylinderP front_right_cage = new CylinderP(4, 800, Color.WHITESMOKE, on);
        front_right_cage.setPosition(150, 0, 400);
        casePC.getChildren().add(front_right_cage.getCylinder());

        CylinderP up_1_cage = new CylinderP(4, 800, Color.WHITESMOKE, on);
        up_1_cage.setPosition(150, -400, 0);
        up_1_cage.setRotate(90,0,0);
        casePC.getChildren().add(up_1_cage.getCylinder());
        CylinderP up_2_cage = new CylinderP(4, 800, Color.WHITESMOKE, on);
        up_2_cage.setPosition(-150, -400, 0);
        up_2_cage.setRotate(90,0,0);
        casePC.getChildren().add(up_2_cage.getCylinder());
        CylinderP up_3_cage = new CylinderP(4, 300, Color.WHITESMOKE, on);
        up_3_cage.setPosition(0, -400, -400);
        up_3_cage.setRotate(90,0,90);
        casePC.getChildren().add(up_3_cage.getCylinder());
        CylinderP up_4_cage = new CylinderP(4, 300, Color.WHITESMOKE, on);
        up_4_cage.setPosition(0, -400, 400);
        up_4_cage.setRotate(90,0,90);
        casePC.getChildren().add(up_4_cage.getCylinder());

        CylinderP down_1_cage = new CylinderP(4, 800, Color.WHITESMOKE, on);
        down_1_cage.setPosition(150, 400, 0);
        down_1_cage.setRotate(90,0,0);
        casePC.getChildren().add(down_1_cage.getCylinder());
        CylinderP down_2_cage = new CylinderP(4, 800, Color.WHITESMOKE, on);
        down_2_cage.setPosition(-150, 400, 0);
        down_2_cage.setRotate(90,0,0);
        casePC.getChildren().add(down_2_cage.getCylinder());
        CylinderP down_3_cage = new CylinderP(4, 300, Color.WHITESMOKE, on);
        down_3_cage.setPosition(0, 400, -400);
        down_3_cage.setRotate(90,0,90);
        casePC.getChildren().add(down_3_cage.getCylinder());
        CylinderP down_4_cage = new CylinderP(4, 300, Color.WHITESMOKE, on);
        down_4_cage.setPosition(0, 400, 400);
        down_4_cage.setRotate(90,0,90);
        casePC.getChildren().add(down_4_cage.getCylinder());


        Panel top_cover = new Panel(300, 4, 800, Color.ROSYBROWN, on);
        top_cover.setPosition(0, -400, 0);
        casePC.getChildren().add(top_cover.getPanel());

        Panel bottom_cover = new Panel(300, 4, 800, Color.ROSYBROWN, on);
        bottom_cover.setPosition(0, 400, 0);
        casePC.getChildren().add(bottom_cover.getPanel());

        Panel back_cover = new Panel(4, 800, 800, Color.ROSYBROWN, on);//0080
        back_cover.setPosition(-150, 0, 0);
        casePC.getChildren().add(back_cover.getPanel());

        Panel front_cover = new Panel(4, 800, 800, Color.ROSYBROWN, on);
        front_cover.setPosition(150, 0, 0);
//        casePC.getChildren().add(front_cover.getPanel());

        Panel front_up_cover = new Panel(300, 5, 80, Color.ROSYBROWN, on);
        front_up_cover.setPosition(0, -360, 395);
        front_up_cover.setRotate(90,0,0);
        casePC.getChildren().add(front_up_cover.getPanel());
        Panel front_down_cover = new Panel(300, 5, 80, Color.ROSYBROWN, on);
        front_down_cover.setPosition(0, 360, 395);
        front_down_cover.setRotate(90,0,0);
        casePC.getChildren().add(front_down_cover.getPanel());

        Panel front_left_cover = new Panel(700, 5, 50, Color.ROSYBROWN, on);
        front_left_cover.setPosition(125, 0, 395);
        front_left_cover.setRotate(90,90,0);
        casePC.getChildren().add(front_left_cover.getPanel());
        Panel front_right_cover = new Panel(700, 5, 50, Color.ROSYBROWN, on);
        front_right_cover.setPosition(-125, 0, 395);
        front_right_cover.setRotate(90,90,0);
        casePC.getChildren().add(front_right_cover.getPanel());


        Panel back_up_cover = new Panel(300, 5, 80, Color.ROSYBROWN, on);
        back_up_cover.setPosition(0, -360, -395);
        back_up_cover.setRotate(90,0,0);
        casePC.getChildren().add(back_up_cover.getPanel());
        Panel back_down_cover = new Panel(300, 5, 530, Color.ROSYBROWN, on);
        back_down_cover.setPosition(0, 140, -395);
        back_down_cover.setRotate(90,0,0);
        casePC.getChildren().add(back_down_cover.getPanel());

        Panel back_left_cover = new Panel(300, 5, 50, Color.ROSYBROWN, on);
        back_left_cover.setPosition(125, -200, -395);
        back_left_cover.setRotate(90,90,0);
        casePC.getChildren().add(back_left_cover.getPanel());
        Panel back_right_cover = new Panel(300, 5, 50, Color.ROSYBROWN, on);
        back_right_cover.setPosition(-125, -200, -395);
        back_right_cover.setRotate(90,90,0);
        casePC.getChildren().add(back_right_cover.getPanel());

        initCoolers();
        initPowerSupply();
        initMotherboard();

        casePC.translateXProperty().set(x);
        casePC.translateYProperty().set(y);
        casePC.translateZProperty().set(z);

        casePC.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        casePC.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        casePC.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(casePC);
    }



    private void initCoolers() {
        Cooler cooler = new Cooler(x,y+(-220),z+400, 100, 10, xAngle, yAngle, zAngle, casePC, on);
        Cooler cooler2 = new Cooler(x,y,z+400, 100, 10, xAngle, yAngle, zAngle, casePC, on);
        Cooler cooler3 = new Cooler(x,y+220,z+400, 100, 10, xAngle, yAngle, zAngle, casePC, on);
        Cooler cooler4 = new Cooler(x,y+(-220),z+(-400), 100, 10, xAngle, yAngle, zAngle, casePC, on);
        cooler.init();
        cooler2.init();
        cooler3.init();
        cooler4.init();
    }
    private void initPowerSupply() {
        PowerSupply powerSupply = new PowerSupply(x, y, z+(-5), xAngle, yAngle, zAngle, casePC, on);
        powerSupply.init();
    }
    private void initMotherboard() {
        Motherboard motherboard = new Motherboard(x, y, z+(-40), xAngle, yAngle, zAngle, casePC, on);
        motherboard.init();
    }

}