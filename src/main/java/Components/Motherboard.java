package Components;

import Elements.CylinderP;
import Elements.Panel;
import RadioComponents.ConnectorRAM;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class Motherboard {
    int x, y, z, speed, xAngle, yAngle, zAngle;
    GroupExtended group;
    boolean on;

    public Motherboard(int x, int y, int z, int speed, int xAngle, int yAngle, GroupExtended group, boolean on) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.speed = speed;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
        this.group = group;
        this.on = on;
    }

    public void init() {

        GroupExtended motherboard = new GroupExtended();

        Panel motherboard_panel = new Panel(5, 620, 525, Color.rgb(64, 54, 52));
        motherboard_panel.setPosition(-135, -60, -90);
        motherboard.getChildren().add(motherboard_panel.getPanel());

        CylinderP capacitor = new CylinderP(6, 15, Color.YELLOW);
        capacitor.setRotate(0, 0, 90);
        capacitor.setPosition(-130, 0, 0);
        motherboard.getChildren().add(capacitor.getCylinder());

        CylinderP mounting = new CylinderP(6, 6, Color.WHITE);
        mounting.setRotate(0, 0, 90);
        mounting.setPosition(-135, -300, 100);
        motherboard.getChildren().add(mounting.getCylinder());

        CylinderP mounting1 = new CylinderP(6, 6, Color.WHITE);
        mounting1.setRotate(0, 0, 90);
        mounting1.setPosition(-135, -300, -275);
        motherboard.getChildren().add(mounting1.getCylinder());

        CylinderP mounting2 = new CylinderP(6, 6, Color.WHITE);
        mounting2.setRotate(0, 0, 90);
        mounting2.setPosition(-135, -30, 100);
        motherboard.getChildren().add(mounting2.getCylinder());

        CylinderP mounting3 = new CylinderP(6, 6, Color.WHITE);
        mounting3.setRotate(0, 0, 90);
        mounting3.setPosition(-135, -30, -275);
        motherboard.getChildren().add(mounting3.getCylinder());

        CylinderP mounting4 = new CylinderP(6, 6, Color.WHITE);
        mounting4.setRotate(0, 0, 90);
        mounting4.setPosition(-135, 180, 100);
        motherboard.getChildren().add(mounting4.getCylinder());

        CylinderP mounting5 = new CylinderP(6, 6, Color.WHITE);
        mounting5.setRotate(0, 0, 90);
        mounting5.setPosition(-135, 180, -275);
        motherboard.getChildren().add(mounting5.getCylinder());

        Panel powerConnectorUp = new Panel(5, 10, 25, Color.GRAY);
        powerConnectorUp.setRotate(0, 0, 90);
        powerConnectorUp.setPosition(-130, -80, 130);
        motherboard.getChildren().add(powerConnectorUp.getPanel());

        Panel powerConnectorUp1 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp1.setRotate(0, 0, 90);
        powerConnectorUp1.setPosition(-130, -190, 130);
        motherboard.getChildren().add(powerConnectorUp1.getPanel());

        Panel powerConnectorUp2 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp2.setRotate(0, 0, 90);
        powerConnectorUp2.setPosition(-130, -180, 130);
        motherboard.getChildren().add(powerConnectorUp2.getPanel());

        Panel powerConnectorUp3 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp3.setRotate(0, 0, 90);
        powerConnectorUp3.setPosition(-130, -170, 130);
        motherboard.getChildren().add(powerConnectorUp3.getPanel());

        Panel powerConnectorUp4 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp4.setRotate(0, 0, 90);
        powerConnectorUp4.setPosition(-130, -160, 130);
        motherboard.getChildren().add(powerConnectorUp4.getPanel());

        Panel powerConnectorUp5 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp5.setRotate(0, 0, 90);
        powerConnectorUp5.setPosition(-130, -150, 130);
        motherboard.getChildren().add(powerConnectorUp5.getPanel());

        Panel powerConnectorUp6 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp6.setRotate(0, 0, 90);
        powerConnectorUp6.setPosition(-130, -140, 130);
        motherboard.getChildren().add(powerConnectorUp6.getPanel());

        Panel powerConnectorUp7 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp7.setRotate(0, 0, 90);
        powerConnectorUp7.setPosition(-130, -130, 130);
        motherboard.getChildren().add(powerConnectorUp7.getPanel());

        Panel powerConnectorUp8 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp8.setRotate(0, 0, 90);
        powerConnectorUp8.setPosition(-130, -120, 130);
        motherboard.getChildren().add(powerConnectorUp8.getPanel());

        Panel powerConnectorUp9 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp9.setRotate(0, 0, 90);
        powerConnectorUp9.setPosition(-130, -110, 130);
        motherboard.getChildren().add(powerConnectorUp9.getPanel());

        Panel powerConnectorUp10 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp10.setRotate(0, 0, 90);
        powerConnectorUp10.setPosition(-130, -100, 130);
        motherboard.getChildren().add(powerConnectorUp10.getPanel());

        Panel powerConnectorUp11 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp11.setRotate(0, 0, 90);
        powerConnectorUp11.setPosition(-130, -90, 130);
        motherboard.getChildren().add(powerConnectorUp11.getPanel());

        Panel powerConnectorUp12 = new Panel(2, 10, 25, Color.GRAY);
        powerConnectorUp12.setRotate(0, 0, 90);
        powerConnectorUp12.setPosition(-130, -80, 130);
        motherboard.getChildren().add(powerConnectorUp12.getPanel());

        Panel powerConnectorUp13 = new Panel(5, 10, 25, Color.GRAY);
        powerConnectorUp13.setRotate(0, 0, 90);
        powerConnectorUp13.setPosition(-130, -200, 130);
        motherboard.getChildren().add(powerConnectorUp13.getPanel());

        Panel powerConnectorSide = new Panel(5, 10, 115, Color.GRAY);
        powerConnectorSide.setRotate(90, 0, 90);
        powerConnectorSide.setPosition(-130, -140, 120);
        motherboard.getChildren().add(powerConnectorSide.getPanel());

        Panel powerConnectorSide1 = new Panel(2, 10, 115, Color.GRAY);
        powerConnectorSide1.setRotate(90, 0, 90);
        powerConnectorSide1.setPosition(-130, -140, 130);
        motherboard.getChildren().add(powerConnectorSide1.getPanel());

        Panel powerConnectorSide2 = new Panel(5, 10, 115, Color.GRAY);
        powerConnectorSide2.setRotate(90, 0, 90);
        powerConnectorSide2.setPosition(-130, -140, 140);
        motherboard.getChildren().add(powerConnectorSide2.getPanel());

        Panel powerConnectorCPUSide = new Panel(3, 10, 30, Color.GRAY);
        powerConnectorCPUSide.setRotate(0, 0, 90);
        powerConnectorCPUSide.setPosition(-130, -332, -260);
        motherboard.getChildren().add(powerConnectorCPUSide.getPanel());

        Panel powerConnectorCPUSide1 = new Panel(1, 10, 30, Color.GRAY);
        powerConnectorCPUSide1.setRotate(0, 0, 90);
        powerConnectorCPUSide1.setPosition(-130, -325, -260);
        motherboard.getChildren().add(powerConnectorCPUSide1.getPanel());

        Panel powerConnectorCPUSide2 = new Panel(3, 10, 30, Color.GRAY);
        powerConnectorCPUSide2.setRotate(0, 0, 90);
        powerConnectorCPUSide2.setPosition(-130, -320, -260);
        motherboard.getChildren().add(powerConnectorCPUSide2.getPanel());

        Panel powerConnectorPCIE = new Panel(3, 10, 200, Color.GRAY);
        powerConnectorPCIE.setRotate(0, 0, 90);
        powerConnectorPCIE.setPosition(-130, -40, -160);
        motherboard.getChildren().add(powerConnectorPCIE.getPanel());

        Panel powerConnectorPCIE1 = new Panel(3, 10, 200, Color.GRAY);
        powerConnectorPCIE1.setRotate(0, 0, 90);
        powerConnectorPCIE1.setPosition(-130, -30, -160);
        motherboard.getChildren().add(powerConnectorPCIE1.getPanel());

        Panel powerConnectorPCIE2 = new Panel(3, 10, 13, Color.GRAY);
        powerConnectorPCIE2.setRotate(90, 0, 90);
        powerConnectorPCIE2.setPosition(-130, -35, -60);
        motherboard.getChildren().add(powerConnectorPCIE2.getPanel());

        Panel powerConnectorPCIE3 = new Panel(3, 10, 13, Color.GRAY);
        powerConnectorPCIE3.setRotate(90, 0, 90);
        powerConnectorPCIE3.setPosition(-130, -35, -215);
        motherboard.getChildren().add(powerConnectorPCIE3.getPanel());

        Panel powerConnectorPCIE4 = new Panel(3, 10, 13, Color.GRAY);
        powerConnectorPCIE4.setRotate(90, 0, 90);
        powerConnectorPCIE4.setPosition(-130, -35, -260);
        motherboard.getChildren().add(powerConnectorPCIE4.getPanel());


        initRAM_Connector(motherboard);
        initRAM();
        initCPU_Radiator();

        motherboard.translateXProperty().set(x);
        motherboard.translateYProperty().set(y);
        motherboard.translateZProperty().set(z);

        motherboard.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        motherboard.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        motherboard.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(motherboard);

    }

    private void initCPU_Radiator() {
        CPU_Radiator cpUradiator = new CPU_Radiator(10, -30, -40, 60, 15, 60, 90, 0,0,group, true);
        cpUradiator.init();
    }

    private void initRAM_Connector(GroupExtended motherboard) {
        ConnectorRAM powerConnectorA_1RAM = new ConnectorRAM(-130, -200, 0,220,0,0,90,motherboard);
        powerConnectorA_1RAM.init();
        ConnectorRAM powerConnectorA_1RAM1 = new ConnectorRAM(-130, -200, 10,220,0,0,90,motherboard);
        powerConnectorA_1RAM1.init();
        ConnectorRAM powerConnectorA_1RAM2 = new ConnectorRAM(-130, -310, 5,10,90,0,90,motherboard);
        powerConnectorA_1RAM2.init();
        ConnectorRAM powerConnectorA_1RAM3 = new ConnectorRAM(-130, -190, 5,10,90,0,90,motherboard);
        powerConnectorA_1RAM3.init();
        ConnectorRAM powerConnectorA_1RAM4 = new ConnectorRAM(-130, -90, 5,10,90,0,90,motherboard);
        powerConnectorA_1RAM4.init();
        ConnectorRAM powerConnectorB_1RAM = new ConnectorRAM(-130, -200, 20,220,0,0,90,motherboard);
        powerConnectorB_1RAM.init();
        ConnectorRAM powerConnectorB_1RAM1 = new ConnectorRAM(-130, -200, 30,220,0,0,90,motherboard);
        powerConnectorB_1RAM1.init();
        ConnectorRAM powerConnectorB_1RAM2 = new ConnectorRAM(-130, -310, 25,10,90,0,90,motherboard);
        powerConnectorB_1RAM2.init();
        ConnectorRAM powerConnectorB_1RAM3 = new ConnectorRAM(-130, -190, 25,10,90,0,90,motherboard);
        powerConnectorB_1RAM3.init();
        ConnectorRAM powerConnectorB_1RAM4 = new ConnectorRAM(-130, -90, 25,10,90,0,90,motherboard);
        powerConnectorB_1RAM4.init();
        ConnectorRAM powerConnectorA_2RAM = new ConnectorRAM(-130, -200, 40,220,0,0,90,motherboard);
        powerConnectorA_2RAM.init();
        ConnectorRAM powerConnectorA_2RAM1 = new ConnectorRAM(-130, -200, 50,220,0,0,90,motherboard);
        powerConnectorA_2RAM1.init();
        ConnectorRAM powerConnectorA_2RAM2 = new ConnectorRAM(-130, -310, 45,10, 90, 0, 90, motherboard);
        powerConnectorA_2RAM2.init();
        ConnectorRAM powerConnectorA_2RAM3 = new ConnectorRAM(-130, -190, 45,10, 90, 0, 90, motherboard);
        powerConnectorA_2RAM3.init();
        ConnectorRAM powerConnectorA_2RAM4 = new ConnectorRAM(-130, -90, 45,10, 90, 0, 90, motherboard);
        powerConnectorA_2RAM4.init();
        ConnectorRAM powerConnectorB_2RAM = new ConnectorRAM(-130, -200, 60,220, 0, 0, 90, motherboard);
        powerConnectorB_2RAM.init();
        ConnectorRAM powerConnectorB_2RAM1 = new ConnectorRAM(-130, -200, 70,220, 0, 0, 90, motherboard);
        powerConnectorB_2RAM1.init();
        ConnectorRAM powerConnectorB_2RAM2 = new ConnectorRAM(-130, -310, 65,10, 90, 0, 90, motherboard);
        powerConnectorB_2RAM2.init();
        ConnectorRAM powerConnectorB_2RAM3 = new ConnectorRAM(-130, -190, 65,10, 90, 0, 90, motherboard);
        powerConnectorB_2RAM3.init();
        ConnectorRAM powerConnectorB_2RAM4 = new ConnectorRAM(-130, -90, 65,10, 90, 0, 90, motherboard);
        powerConnectorB_2RAM4.init();
    }

    private void initRAM() {
        RAM ram1 = new RAM(-205,-200,-65, 5, 45,220,0,0,0, group, true);
        RAM ram2 = new RAM(-205,-200,-85, 5, 45,220,0,0,0, group, true);
        RAM ram3 = new RAM(-205,-200,-105, 5, 45,220,0,0,0, group, true);
        RAM ram4 = new RAM(-205,-200,-125, 5, 45,220,0,0,0, group, true);
        ram1.init();
        ram2.init();
        ram3.init();
        ram4.init();
    }
}