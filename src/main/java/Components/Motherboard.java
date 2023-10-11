package Components;

import Elements.CylinderP;
import Elements.Panel;
import RadioComponents.Chip;
import RadioComponents.ConnectorRAM;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class Motherboard {
    int x, y, z, xAngle, yAngle ,zAngle;
    GroupExtended group;
    boolean on;

    public Motherboard(int x, int y, int z, int xAngle, int yAngle, int zAngle, GroupExtended group, boolean on) {
        this.x = x;
        this.y = y;
        this.z = z;
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


        CylinderP mounting = new CylinderP(6, 6, Color.WHITE);
        mounting.setRotate(0, 0, 90);
        mounting.setPosition(-135, -340, 150);
        motherboard.getChildren().add(mounting.getCylinder());

        CylinderP mounting1 = new CylinderP(6, 6, Color.WHITE);
        mounting1.setRotate(0, 0, 90);
        mounting1.setPosition(-135, -340, -325);
        motherboard.getChildren().add(mounting1.getCylinder());

        CylinderP mounting2 = new CylinderP(6, 6, Color.WHITE);
        mounting2.setRotate(0, 0, 90);
        mounting2.setPosition(-135, -30, 150);
        motherboard.getChildren().add(mounting2.getCylinder());

        CylinderP mounting3 = new CylinderP(6, 6, Color.WHITE);
        mounting3.setRotate(0, 0, 90);
        mounting3.setPosition(-135, -30, -325);
        motherboard.getChildren().add(mounting3.getCylinder());

        CylinderP mounting4 = new CylinderP(6, 6, Color.WHITE);
        mounting4.setRotate(0, 0, 90);
        mounting4.setPosition(-135, 220, 150);
        motherboard.getChildren().add(mounting4.getCylinder());

        CylinderP mounting5 = new CylinderP(6, 6, Color.WHITE);
        mounting5.setRotate(0, 0, 90);
        mounting5.setPosition(-135, 220, -325);
        motherboard.getChildren().add(mounting5.getCylinder());

        CylinderP mounting6 = new CylinderP(5, 1, Color.BLACK);
        mounting6.setRotate(0, 0, 90);
        mounting6.setPosition(-132, -340, 150);
        motherboard.getChildren().add(mounting6.getCylinder());

        CylinderP mounting7 = new CylinderP(5, 1, Color.BLACK);
        mounting7.setRotate(0, 0, 90);
        mounting7.setPosition(-132, -340, -325);
        motherboard.getChildren().add(mounting7.getCylinder());

        CylinderP mounting8 = new CylinderP(5, 1, Color.BLACK);
        mounting8.setRotate(0, 0, 90);
        mounting8.setPosition(-132, -30, 150);
        motherboard.getChildren().add(mounting8.getCylinder());

        CylinderP mounting9 = new CylinderP(5, 1, Color.BLACK);
        mounting9.setRotate(0, 0, 90);
        mounting9.setPosition(-132, -30, -325);
        motherboard.getChildren().add(mounting9.getCylinder());

        CylinderP mounting10 = new CylinderP(5, 1, Color.BLACK);
        mounting10.setRotate(0, 0, 90);
        mounting10.setPosition(-132, 220, 150);
        motherboard.getChildren().add(mounting10.getCylinder());

        CylinderP mounting11 = new CylinderP(5, 1, Color.BLACK);
        mounting11.setRotate(0, 0, 90);
        mounting11.setPosition(-132, 220, -325);
        motherboard.getChildren().add(mounting11.getCylinder());

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

        Panel powerConnectorCPU = new Panel(3, 10, 30, Color.GRAY);
        powerConnectorCPU.setRotate(0, 0, 90);
        powerConnectorCPU.setPosition(-130, -352, -290);
        motherboard.getChildren().add(powerConnectorCPU.getPanel());

        Panel powerConnectorCPU1 = new Panel(1, 10, 30, Color.GRAY);
        powerConnectorCPU1.setRotate(0, 0, 90);
        powerConnectorCPU1.setPosition(-130, -345, -290);
        motherboard.getChildren().add(powerConnectorCPU1.getPanel());

        Panel powerConnectorCPU2 = new Panel(3, 10, 30, Color.GRAY);
        powerConnectorCPU2.setRotate(0, 0, 90);
        powerConnectorCPU2.setPosition(-130, -338, -290);
        motherboard.getChildren().add(powerConnectorCPU2.getPanel());

        Panel powerConnectorCPU3 = new Panel(3, 10, 30, Color.GRAY);
        powerConnectorCPU3.setRotate(0, 0, 90);
        powerConnectorCPU3.setPosition(-130, -352, -250);
        motherboard.getChildren().add(powerConnectorCPU3.getPanel());

        Panel powerConnectorCPU4 = new Panel(1, 10, 30, Color.GRAY);
        powerConnectorCPU4.setRotate(0, 0, 90);
        powerConnectorCPU4.setPosition(-130, -345, -250);
        motherboard.getChildren().add(powerConnectorCPU4.getPanel());

        Panel powerConnectorCPU5 = new Panel(3, 10, 30, Color.GRAY);
        powerConnectorCPU5.setRotate(0, 0, 90);
        powerConnectorCPU5.setPosition(-130, -338, -250);
        motherboard.getChildren().add(powerConnectorCPU5.getPanel());

        //LnR First 8-pin
        Panel powerConnectorCPU6 = new Panel(3, 10, 15, Color.GRAY);
        powerConnectorCPU6.setRotate(90, 0, 90);
        powerConnectorCPU6.setPosition(-130, -345, -235);
        motherboard.getChildren().add(powerConnectorCPU6.getPanel());

        Panel powerConnectorCPU7 = new Panel(3, 10, 15, Color.GRAY);
        powerConnectorCPU7.setRotate(90, 0, 90);
        powerConnectorCPU7.setPosition(-130, -345, -265);
        motherboard.getChildren().add(powerConnectorCPU7.getPanel());

        // LnR Second 8-pin
        Panel powerConnectorCPU8 = new Panel(3, 10, 15, Color.GRAY);
        powerConnectorCPU8.setRotate(90, 0, 90);
        powerConnectorCPU8.setPosition(-130, -345, -275);
        motherboard.getChildren().add(powerConnectorCPU8.getPanel());

        Panel powerConnectorCPU9 = new Panel(3, 10, 15, Color.GRAY);
        powerConnectorCPU9.setRotate(90, 0, 90);
        powerConnectorCPU9.setPosition(-130, -345, -305);
        motherboard.getChildren().add(powerConnectorCPU9.getPanel());

        Panel powerConnectorCPU10 = new Panel(2, 10, 15, Color.GRAY);
        powerConnectorCPU10.setRotate(90, 0, 90);
        powerConnectorCPU10.setPosition(-130, -345, -242);
        motherboard.getChildren().add(powerConnectorCPU10.getPanel());

        Panel powerConnectorCPU11 = new Panel(2, 10, 15, Color.GRAY);
        powerConnectorCPU11.setRotate(90, 0, 90);
        powerConnectorCPU11.setPosition(-130, -345, -250);
        motherboard.getChildren().add(powerConnectorCPU11.getPanel());

        Panel powerConnectorCPU12 = new Panel(2, 10, 15, Color.GRAY);
        powerConnectorCPU12.setRotate(90, 0, 90);
        powerConnectorCPU12.setPosition(-130, -345, -257);
        motherboard.getChildren().add(powerConnectorCPU12.getPanel());

        Panel powerConnectorCPU13 = new Panel(2, 10, 15, Color.GRAY);
        powerConnectorCPU13.setRotate(90, 0, 90);
        powerConnectorCPU13.setPosition(-130, -345, -282);
        motherboard.getChildren().add(powerConnectorCPU13.getPanel());

        Panel powerConnectorCPU14 = new Panel(2, 10, 15, Color.GRAY);
        powerConnectorCPU14.setRotate(90, 0, 90);
        powerConnectorCPU14.setPosition(-130, -345, -290);
        motherboard.getChildren().add(powerConnectorCPU14.getPanel());

        Panel powerConnectorCPU15 = new Panel(2, 10, 15, Color.GRAY);
        powerConnectorCPU15.setRotate(90, 0, 90);
        powerConnectorCPU15.setPosition(-130, -345, -297);
        motherboard.getChildren().add(powerConnectorCPU15.getPanel());

        PCIConnector pci = new PCIConnector(-130, -40, -160, 0, 0, 0, motherboard, on);
        pci.init();

        Panel ssdMount = new Panel(3,50,10, Color.GHOSTWHITE);
        ssdMount.setPosition(-130,-80,-70);
        motherboard.getChildren().add(ssdMount.getPanel());

        Panel chipset = new Panel(3,100,60, Color.DARKGREY);
        chipset.setPosition(-130,130,50);
        motherboard.getChildren().add(chipset.getPanel());

        Panel chipset1 = new Panel(10,90,50, Color.PURPLE);
        chipset1.setPosition(-130,130,50);
        chipset1.setSpecular(Color.PURPLE);
        motherboard.getChildren().add(chipset1.getPanel());

        CylinderP chipsetMounting1 = new CylinderP(4, 11, Color.WHITE);
        chipsetMounting1.setRotate(0, 0, 90);
        chipsetMounting1.setPosition(-130,85,50);
        motherboard.getChildren().add(chipsetMounting1.getCylinder());

        CylinderP chipsetMounting2 = new CylinderP(4, 11, Color.WHITE);
        chipsetMounting2.setRotate(0, 0, 90);
        chipsetMounting2.setPosition(-130,175,50);
        motherboard.getChildren().add(chipsetMounting2.getCylinder());

        CylinderP battery = new CylinderP(20, 8, Color.BLACK);
        battery.setRotate(0, 0, 90);
        battery.setPosition(-130,175,-150);
        motherboard.getChildren().add(battery.getCylinder());

        CylinderP battery1 = new CylinderP(18, 8, Color.WHITE);
        battery1.setRotate(0, 0, 90);
        battery1.setPosition(-128,175,-150);
        motherboard.getChildren().add(battery1.getCylinder());

//        Panel chip1 = new Panel(3, 8, 15, Color.rgb(40, 40, 40));
//        chip1.setPosition(-128,175,-100);
//        chip1.setRotate(0,0,0);
//        motherboard.getChildren().add(chip1.getPanel());


        Panel motherboard_radiator = new Panel(100, 270, 25, Color.BLACK);
        motherboard_radiator.setSpecular(Color.SILVER);
        motherboard_radiator.setRotate(0, 90, 0);
        motherboard_radiator.setPosition(-120, -180, -285);
        motherboard.getChildren().add(motherboard_radiator.getPanel());

        Panel motherboard_radiator_2 = new Panel(100, 20, 25, Color.BLACK);
        motherboard_radiator_2.setSpecular(Color.SILVER);
        motherboard_radiator_2.setRotate(0, 90, 90);
        motherboard_radiator_2.setPosition(-120, -95, -225);
//        motherboard.getChildren().add(motherboard_radiator_2.getPanel());


        Panel fin_1 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_1.setRotate(0, 90, -25);
        fin_1.setPosition(-110, -170, -285);
        motherboard.getChildren().add(fin_1.getPanel());

        Panel fin_2 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_2.setRotate(0, 90, -25);
        fin_2.setPosition(-110, -180, -285);
        motherboard.getChildren().add(fin_2.getPanel());

        Panel fin_3 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_3.setRotate(0, 90, -25);
        fin_3.setPosition(-110, -190, -285);
        motherboard.getChildren().add(fin_3.getPanel());

        Panel fin_4 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_4.setRotate(0, 90, -25);
        fin_4.setPosition(-110, -200, -285);
        motherboard.getChildren().add(fin_4.getPanel());

        Panel fin_5 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_5.setRotate(0, 90, -25);
        fin_5.setPosition(-110, -210, -285);
        motherboard.getChildren().add(fin_5.getPanel());

        Panel fin_6 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_6.setRotate(0, 90, -25);
        fin_6.setPosition(-110, -220, -285);
        motherboard.getChildren().add(fin_6.getPanel());

        Panel fin_7 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_7.setRotate(0, 90, -25);
        fin_7.setPosition(-110, -230, -285);
        motherboard.getChildren().add(fin_7.getPanel());

        Panel fin_8 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_8.setRotate(0, 90, -25);
        fin_8.setPosition(-110, -240, -285);
        motherboard.getChildren().add(fin_8.getPanel());

        Panel fin_9 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_9.setRotate(0, 90, -25);
        fin_9.setPosition(-110, -250, -285);
        motherboard.getChildren().add(fin_9.getPanel());

        Panel fin_10 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_10.setRotate(0, 90, -25);
        fin_10.setPosition(-110, -260, -285);
        motherboard.getChildren().add(fin_10.getPanel());

        Panel fin_11 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_11.setRotate(0, 90, -25);
        fin_11.setPosition(-110, -270, -285);
        motherboard.getChildren().add(fin_11.getPanel());

        Panel fin_12 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_12.setRotate(0, 90, -25);
        fin_12.setPosition(-110, -280, -285);
        motherboard.getChildren().add(fin_12.getPanel());

        Panel fin_13 = new Panel(108, 3, 10, Color.SADDLEBROWN);
        fin_13.setRotate(0, 90, -25);
        fin_13.setPosition(-110, -290, -285);
        motherboard.getChildren().add(fin_13.getPanel());

        Capacitor cap_1 = new Capacitor(-127,-290,-220, 0, 0, 0, motherboard);
        cap_1.init();

        Capacitor cap_2 = new Capacitor(-127,-268,-220, 0, 0, 0, motherboard);
        cap_2.init();

        Capacitor cap_3 = new Capacitor(-127,-246,-220, 0, 0, 0, motherboard);
        cap_3.init();

        Capacitor cap_4 = new Capacitor(-127,-224,-220, 0, 0, 0, motherboard);
        cap_4.init();

        Capacitor cap_5 = new Capacitor(-127,-202,-220, 0, 0, 0, motherboard);
        cap_5.init();

        Capacitor cap_6 = new Capacitor(-127,-180,-220, 0, 0, 0, motherboard);
        cap_6.init();

        Capacitor cap_7 = new Capacitor(-127,-158,-220, 0, 0, 0, motherboard);
        cap_7.init();

        Capacitor cap_8 = new Capacitor(-127,-116,-220, 0, 0, 0, motherboard);
        cap_8.init();

        Capacitor cap_9 = new Capacitor(-127,-116,-198, 0, 0, 0, motherboard);
        cap_9.init();

        Capacitor cap_10 = new Capacitor(-127,-116,-176, 0, 0, 0, motherboard);
        cap_10.init();

        Capacitor cap_11 = new Capacitor(-127,-116,-154, 0, 0, 0, motherboard);
        cap_11.init();

        Capacitor cap_12 = new Capacitor(-127,-116,-132, 0, 0, 0, motherboard);
        cap_12.init();

        Chip chip_1 = new Chip(-133, -190, 95, 15, 25, 0, 90, 0, motherboard, Color.BLACK, on);
        chip_1.init();

        Chip chip_2 = new Chip(-133, -150, 95, 15, 25, 0, 90, 0, motherboard, Color.BLACK, on);
        chip_2.init();

        Capacitor cap_13 = new Capacitor(-127,-120,95, 0, 0, 0, motherboard);
        cap_13.init();

        Capacitor cap_14 = new Capacitor(-127,-98,95, 0, 0, 0, motherboard);
        cap_14.init();


        initRAM_Connector(motherboard);
        initRAM();
        initCPU_Radiator();
        initSSD();
        initGPU();

        motherboard.translateXProperty().set(x);
        motherboard.translateYProperty().set(y);
        motherboard.translateZProperty().set(z);

        motherboard.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        motherboard.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        motherboard.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(motherboard);

    }

    private void initGPU() {
        GPU videoCard = new GPU(x+10, y+40, z+(-100), 10, xAngle+270, yAngle, zAngle+90, group, true);
        videoCard.init();
    }

    private void initSSD() {
        Drive ssd = new Drive(x+(-125),y+(-80),z+(-150), xAngle+90,yAngle+90 ,zAngle, group, on);
        ssd.init();
    }

    private void initCPU_Radiator() {
        CPU_Radiator cpUradiator = new CPU_Radiator(x+10, y+(-30), z+15, 60, 15, 60, xAngle+90, yAngle,zAngle,group, true);
        cpUradiator.init();
    }

    private void initRAM_Connector(GroupExtended motherboard) {
        ConnectorRAM powerConnectorA_1RAM = new ConnectorRAM(-130, -200, 0,220,0,0,90, motherboard, on);
        powerConnectorA_1RAM.init();
        ConnectorRAM powerConnectorA_1RAM1 = new ConnectorRAM(-130, -200, 10,220,0,0,90, motherboard, on);
        powerConnectorA_1RAM1.init();
        ConnectorRAM powerConnectorA_1RAM2 = new ConnectorRAM(-130, -310, 5,10,90,0,90, motherboard, on);
        powerConnectorA_1RAM2.init();
        ConnectorRAM powerConnectorA_1RAM3 = new ConnectorRAM(-130, -190, 5,10,90,0,90, motherboard, on);
        powerConnectorA_1RAM3.init();
        ConnectorRAM powerConnectorA_1RAM4 = new ConnectorRAM(-130, -90, 5,10,90,0,90, motherboard, on);
        powerConnectorA_1RAM4.init();
        ConnectorRAM powerConnectorB_1RAM = new ConnectorRAM(-130, -200, 20,220,0,0,90, motherboard, on);
        powerConnectorB_1RAM.init();
        ConnectorRAM powerConnectorB_1RAM1 = new ConnectorRAM(-130, -200, 30,220,0,0,90, motherboard, on);
        powerConnectorB_1RAM1.init();
        ConnectorRAM powerConnectorB_1RAM2 = new ConnectorRAM(-130, -310, 25,10,90,0,90, motherboard, on);
        powerConnectorB_1RAM2.init();
        ConnectorRAM powerConnectorB_1RAM3 = new ConnectorRAM(-130, -190, 25,10,90,0,90, motherboard, on);
        powerConnectorB_1RAM3.init();
        ConnectorRAM powerConnectorB_1RAM4 = new ConnectorRAM(-130, -90, 25,10,90,0,90, motherboard, on);
        powerConnectorB_1RAM4.init();
        ConnectorRAM powerConnectorA_2RAM = new ConnectorRAM(-130, -200, 40,220,0,0,90, motherboard, on);
        powerConnectorA_2RAM.init();
        ConnectorRAM powerConnectorA_2RAM1 = new ConnectorRAM(-130, -200, 50,220,0,0,90, motherboard, on);
        powerConnectorA_2RAM1.init();
        ConnectorRAM powerConnectorA_2RAM2 = new ConnectorRAM(-130, -310, 45,10, 90, 0, 90, motherboard, on);
        powerConnectorA_2RAM2.init();
        ConnectorRAM powerConnectorA_2RAM3 = new ConnectorRAM(-130, -190, 45,10, 90, 0, 90, motherboard, on);
        powerConnectorA_2RAM3.init();
        ConnectorRAM powerConnectorA_2RAM4 = new ConnectorRAM(-130, -90, 45,10, 90, 0, 90, motherboard, on);
        powerConnectorA_2RAM4.init();
        ConnectorRAM powerConnectorB_2RAM = new ConnectorRAM(-130, -200, 60,220, 0, 0, 90, motherboard, on);
        powerConnectorB_2RAM.init();
        ConnectorRAM powerConnectorB_2RAM1 = new ConnectorRAM(-130, -200, 70,220, 0, 0, 90, motherboard, on);
        powerConnectorB_2RAM1.init();
        ConnectorRAM powerConnectorB_2RAM2 = new ConnectorRAM(-130, -310, 65,10, 90, 0, 90, motherboard, on);
        powerConnectorB_2RAM2.init();
        ConnectorRAM powerConnectorB_2RAM3 = new ConnectorRAM(-130, -190, 65,10, 90, 0, 90, motherboard, on);
        powerConnectorB_2RAM3.init();
        ConnectorRAM powerConnectorB_2RAM4 = new ConnectorRAM(-130, -90, 65,10, 90, 0, 90, motherboard, on);
        powerConnectorB_2RAM4.init();
    }

    private void initRAM() {
        RAM ram1 = new RAM(x+(-205),y+(-200),z+(-25), 5, 45,220,xAngle,yAngle,zAngle, group, true);
        RAM ram2 = new RAM(x+(-205),y+(-200),z+(-45), 5, 45,220,xAngle,yAngle,zAngle, group, true);
        RAM ram3 = new RAM(x+(-205),y+(-200),z+(-65), 5, 45,220,xAngle,yAngle,zAngle, group, true);
        RAM ram4 = new RAM(x+(-205),y+(-200),z+(-85), 5, 45,220,xAngle,yAngle,zAngle, group, true);
        ram1.init();
        ram2.init();
        ram3.init();
        ram4.init();
    }
}