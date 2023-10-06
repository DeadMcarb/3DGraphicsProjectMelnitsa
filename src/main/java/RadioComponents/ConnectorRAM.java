package RadioComponents;

import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;

public class ConnectorRAM {
    int x, y, z, xAngle, yAngle, zAngle, width;
    GroupExtended group;

    public ConnectorRAM(int x, int y, int z, int width, int xAngle, int yAngle, int zAngle, GroupExtended group) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
        this.group = group;
    }

    public void init() {
        Panel powerConnector_RAM = new Panel(width, 4, 3, Color.GRAY);
        powerConnector_RAM.setRotate(xAngle, yAngle, zAngle);
        powerConnector_RAM.setPosition(x, y, z);
        group.getChildren().add(powerConnector_RAM.getPanel());
    }
}
