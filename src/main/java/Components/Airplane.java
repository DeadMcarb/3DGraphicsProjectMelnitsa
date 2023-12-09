package Components;

import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;

public class Airplane {


    int x, y, z, xAngle, yAngle, zAngle;
    GroupExtended caseProprller = new GroupExtended();
    GroupExtended group;
    boolean on;

    public Airplane(int x, int y, int z, GroupExtended group, boolean on) { this.x = x;
        this.y = y;
        this.z = z;
        this.group = group;
        this.on = on;
    }

    public void redraw(boolean mode){
        this.on = mode;
        group.getChildren().remove(caseProprller);
        caseProprller = new GroupExtended();
        init();
    }

    public void init() {
        Propeller main_propeller = new Propeller(x,y,z, 100, 10, xAngle, yAngle, zAngle, caseProprller, on, 800, 20);
        Propeller right_propeller = new Propeller(x-210,y+60,z+250, 50, 10, xAngle+5, yAngle, zAngle, caseProprller, on, 80, -350);
        Propeller left_propeller = new Propeller(x+210,y+60,z+250, 50, 10, xAngle+5, yAngle, zAngle, caseProprller, on, 80, -350);
        Body back_top_wings_1 = new Body(x, y-100, z+700, 15, 75, 170, xAngle+40, yAngle, zAngle, caseProprller, on, Color.BEIGE);
        Body back_top_wings_2 = new Body(x, y-70, z+788, 15, 80, 150, xAngle+90, yAngle, zAngle, caseProprller, on, Color.BEIGE);
        CylinderP back_top_wings_3 = new CylinderP(50, 15, Color.BEIGE, on);

        Body back_wings_2 = new Body(x-100, y, z+750, 90, 15, 170, xAngle, yAngle-25, zAngle, caseProprller, on, Color.BEIGE);
        Body back_wings_3 = new Body(x+100, y, z+750, 90, 15, 170, xAngle, yAngle+25, zAngle, caseProprller, on, Color.BEIGE);
        Body window_cabin = new Body(x, y-115, z+140, 75, 5, 50, xAngle+30, yAngle, zAngle, caseProprller, on, Color.BLUE);
        Body window_left_cabin = new Body(x+40, y-90, z+140, 75, 50, 5, xAngle, yAngle+90, zAngle+30, caseProprller, on, Color.BLUE);
        Body window_right_cabin = new Body(x-40, y-90, z+140, 75, 50, 5, xAngle, yAngle+90, zAngle+30, caseProprller, on, Color.BLUE);
        Body main_wings = new Body(x, y, z+310, 800, 10, 180, xAngle+5, yAngle, zAngle, caseProprller, on, Color.BEIGE);
        Body main_wing_left = new Body(x-400, y, z+310, 80, 10, 160, xAngle+5, yAngle-25, zAngle, caseProprller, on, Color.BEIGE);
        Body main_wing_right = new Body(x+400, y, z+310, 80, 10, 160, xAngle+5, yAngle+25, zAngle, caseProprller, on, Color.BEIGE);
        CylinderP back_main_propeller = new CylinderP(100, 25, Color.BEIGE, on);
        CylinderP back_right_propeller = new CylinderP(50, 25, Color.BEIGE, on);
        CylinderP back_left_propeller = new CylinderP(50, 25, Color.BEIGE, on);
        CylinderP back_main_body = new CylinderP(100, 25, Color.BEIGE, on);
        Body right_body_wheel = new Body(x-75, y+100, z+75, 25, 125, 25, xAngle, yAngle, zAngle+20, caseProprller, on, Color.BEIGE);
        Body left_body_wheel = new Body(x+75, y+100, z+75, 25, 125, 25, xAngle, yAngle, zAngle-20, caseProprller, on, Color.BEIGE);
        Body back_body_wheel = new Body(x, y+110, z+700, 25, 100, 25, xAngle+20, yAngle, zAngle, caseProprller, on, Color.BEIGE);
        CylinderP right_wheel = new CylinderP(50, 25, Color.BLACK, on);
        CylinderP left_wheel = new CylinderP(50, 25, Color.BLACK, on);
        CylinderP back_wheel = new CylinderP(25, 40, Color.BLACK, on);
        SphereP sphere_back_main = new SphereP(108, Color.BEIGE, on);
        SphereP sphere_front_main = new SphereP(30, Color.DARKRED, on);
        SphereP sphere_back_right = new SphereP(57, Color.BEIGE, on);
        SphereP sphere_back_left = new SphereP(57, Color.BEIGE, on);
        window_right_cabin.init();
        back_top_wings_1.init();
        window_left_cabin.init();
        window_cabin.init();
        back_top_wings_2.init();
        main_wing_left.init();
        main_wing_right.init();

        back_top_wings_3.setPosition(x, y-150, z+778);
        back_top_wings_3.setRotate(0, 0, 90);
        caseProprller.getChildren().add(back_top_wings_3.getCylinder());

        back_main_propeller.setPosition(x, y, z+25);
        back_main_propeller.setRotate(90, 0, 0);
        caseProprller.getChildren().add(back_main_propeller.getCylinder());

        back_right_propeller.setPosition(x-210, y+60, z+330);
        back_right_propeller.setRotate(95, 0, 0);
        caseProprller.getChildren().add(back_right_propeller.getCylinder());

        back_left_propeller.setPosition(x+210, y+60, z+330);
        back_left_propeller.setRotate(95, 0, 0);
        caseProprller.getChildren().add(back_left_propeller.getCylinder());

        back_main_body.setPosition(x, y, z+805);
        back_main_body.setRotate(90, 0, 0);
        caseProprller.getChildren().add(back_main_body.getCylinder());

        right_wheel.setPosition(x-100, y+130, z+75);
        right_wheel.setRotate(0, 0, 100);
        caseProprller.getChildren().add(right_wheel.getCylinder());

        left_wheel.setPosition(x+100, y+130, z+75);
        left_wheel.setRotate(0, 0, 80);
        caseProprller.getChildren().add(left_wheel.getCylinder());

        back_wheel.setPosition(x, y+140, z+715);
        back_wheel.setRotate(0, 0, 90);
        caseProprller.getChildren().add(back_wheel.getCylinder());

        sphere_back_main.setPosition(x, y, z+840);
        sphere_back_main.setRotate(0, 0, 0);
        caseProprller.getChildren().add(sphere_back_main.getSphere());

        sphere_front_main.setPosition(x, y, z);
        sphere_front_main.setRotate(0, 0, 0);
        caseProprller.getChildren().add(sphere_front_main.getSphere());

        sphere_back_right.setPosition(x-210, y+51, z+355);
        sphere_back_right.setRotate(0, 0, 0);
        caseProprller.getChildren().add(sphere_back_right.getSphere());

        sphere_back_left.setPosition(x+210, y+51, z+355);
        sphere_back_left.setRotate(0, 0, 0);
        caseProprller.getChildren().add(sphere_back_left.getSphere());

        main_wings.init();
        back_wings_2.init();
        back_wings_3.init();
        right_body_wheel.init();
        left_body_wheel.init();
        back_body_wheel.init();
        main_propeller.init();
        right_propeller.init();
        left_propeller.init();
        group.getChildren().add(caseProprller);
    }
}