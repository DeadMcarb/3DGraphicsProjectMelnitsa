package RadioComponents;

import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class Chip {
    int x, y, z, xAngle, yAngle, zAngle, width, height, depth = 6;
    Color color;
    GroupExtended group;
    boolean on;

    public Chip(int x, int y, int z, int width, int height, int xAngle, int yAngle, int zAngle, GroupExtended group, Color color, boolean on) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
        this.color = color;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
        this.group = group;
        this.on = on;
    }

    public void setDepth(int depth){
        this.depth = depth;
    }

    public void init(){
        GroupExtended chip = new GroupExtended();

        Panel chipset = new Panel(width, height, depth, color, on);
        chipset.setSpecular(color);
        chip.getChildren().add(chipset.getPanel());

        addContacts(1, chip);
        addContacts(-1, chip);

        chip.translateXProperty().set(x);
        chip.translateYProperty().set(y);
        chip.translateZProperty().set(z);

        chip.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        chip.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        chip.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(chip);
    }

    private void addContacts(int side, GroupExtended chip){
        int n = (height) / 4;
        int position = -((height) / 2);
        for (int i = 1; i <= n+1; i++) {
            Panel p1 = new Panel(2, 3, 2, Color.SILVER, on);
            p1.setSpecular(Color.WHITE);
            p1.setPosition((double) (width * side) /2, position, -2 + (depth / 3));
            p1.setRotate(0, 0,90);
            chip.getChildren().add(p1.getPanel());
            position += 4;
        }
    }
}
