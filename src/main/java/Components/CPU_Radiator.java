package Components;

import Elements.CylinderP;
import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class CPU_Radiator {
    int x, y, z, width, height, depth, xAngle, yAngle, zAngle;
    GroupExtended group;
    boolean on;

    public CPU_Radiator(int x, int y, int z, int width, int height, int depth, int xAngle, int yAngle, int zAngle, GroupExtended group, boolean on) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.group = group;
        this.on = on;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
    }

    public void init(){
        GroupExtended CPUcooler = new GroupExtended();

        Panel coolerBase = new Panel(height,depth,width, Color.WHITESMOKE);
        coolerBase.setPosition(-140,-180,200);
        CPUcooler.getChildren().add(coolerBase.getPanel());

        int n = (width+50) / 3;
        int position = -((width-4) / 2);
        for (int i = 1; i <= n+1; i++) {
            Panel radiatorFin = new Panel(height-14,depth+40,width+100, Color.WHITESMOKE);
            radiatorFin.setSpecular(Color.WHITE);
            radiatorFin.setPosition(position-60, -180, 200);
            radiatorFin.setRotate(0, 0,0);
            CPUcooler.getChildren().add(radiatorFin.getPanel());
            position += 5;
        }

        CylinderP heatPipe = new CylinderP(height-12,depth+190, Color.DARKORANGE);
        heatPipe.setPosition(-20,-180,180);
        heatPipe.setRotate(0,0,90);
        CPUcooler.getChildren().add(heatPipe.getCylinder());

        CylinderP heatPipe1 = new CylinderP(height-12,depth+190, Color.DARKORANGE);
        heatPipe1.setPosition(-20,-180,220);
        heatPipe1.setRotate(0,0,90);
        CPUcooler.getChildren().add(heatPipe1.getCylinder());

        CylinderP heatPipe2 = new CylinderP(height-12,depth+190, Color.DARKORANGE);
        heatPipe2.setPosition(-20,-200,220);
        heatPipe2.setRotate(0,0,90);
        CPUcooler.getChildren().add(heatPipe2.getCylinder());

        CylinderP heatPipe3 = new CylinderP(height-12,depth+190, Color.DARKORANGE);
        heatPipe3.setPosition(-20,-200,180);
        heatPipe3.setRotate(0,0,90);
        CPUcooler.getChildren().add(heatPipe3.getCylinder());

        CylinderP heatPipe4 = new CylinderP(height-12,depth+190, Color.DARKORANGE);
        heatPipe4.setPosition(-20,-160,220);
        heatPipe4.setRotate(0,0,90);
        CPUcooler.getChildren().add(heatPipe4.getCylinder());

        CylinderP heatPipe5 = new CylinderP(height-12,depth+190, Color.DARKORANGE);
        heatPipe5.setPosition(-20,-160,180);
        heatPipe5.setRotate(0,0,90);
        CPUcooler.getChildren().add(heatPipe5.getCylinder());

        initCoolers();

        CPUcooler.translateXProperty().set(x);
        CPUcooler.translateYProperty().set(y);
        CPUcooler.translateZProperty().set(z);

        CPUcooler.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        CPUcooler.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        CPUcooler.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(CPUcooler);
    }

    private void initCoolers() {
        Cooler cooler = new Cooler(15, -230, -110+z, 80, 1, 0,0,0, group, true);
        cooler.init();
        Cooler cooler2 = new Cooler(15, -230, -250+z, 80, 1, 0,0,0, group, true);
        cooler2.init();
    }
}