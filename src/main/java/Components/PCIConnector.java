package Components;

import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class PCIConnector {
    int x, y, z, xAngle, yAngle, zAngle;
    GroupExtended group;
    boolean on;

    public PCIConnector(int x, int y, int z, int xAngle, int yAngle, int zAngle, GroupExtended group, boolean on) {
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
        GroupExtended pci = new GroupExtended();

        Panel powerConnectorPCIE = new Panel(3, 10, 200, Color.GRAY, true);
        powerConnectorPCIE.setRotate(0, 0, 90);
        powerConnectorPCIE.setPosition(0, 0, 0);
        pci.getChildren().add(powerConnectorPCIE.getPanel());

        Panel powerConnectorPCIE1 = new Panel(3, 10, 200, Color.GRAY, on);
        powerConnectorPCIE1.setRotate(0, 0, 90);
        powerConnectorPCIE1.setPosition(0, 10, 0);
        pci.getChildren().add(powerConnectorPCIE1.getPanel());

        Panel powerConnectorPCIE2 = new Panel(3, 10, 13, Color.GRAY, on);
        powerConnectorPCIE2.setRotate(90, 0, 90);
        powerConnectorPCIE2.setPosition(0, 5, -100);
        pci.getChildren().add(powerConnectorPCIE2.getPanel());

        Panel powerConnectorPCIE3 = new Panel(3, 10, 13, Color.GRAY, on);
        powerConnectorPCIE3.setRotate(90, 0, 90);
        powerConnectorPCIE3.setPosition(0, 5, -55);
        pci.getChildren().add(powerConnectorPCIE3.getPanel());

        Panel powerConnectorPCIE4 = new Panel(3, 10, 13, Color.GRAY, on);
        powerConnectorPCIE4.setRotate(90, 0, 90);
        powerConnectorPCIE4.setPosition(0, 5, 100);
        pci.getChildren().add(powerConnectorPCIE4.getPanel());

        pci.translateXProperty().set(x);
        pci.translateYProperty().set(y);
        pci.translateZProperty().set(z);

        pci.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        pci.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        pci.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(pci);
    }
}
