package RadioComponents;

import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;

public class Chip {
    int x, y, z, xAngle, yAngle, zAngle, width, height;
    GroupExtended group;

    public Chip(int x, int y, int z, int width, int height, int xAngle, int yAngle, int zAngle, GroupExtended group) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
        this.group = group;
    }

    public void init(){
        GroupExtended chip = new GroupExtended();

        Panel chipset = new Panel(width, height, 10, Color.BLACK);
        chip.getChildren().add(chipset.getPanel());

        addContacts(1, chip);
        addContacts(-1, chip);


        group.getChildren().add(chip);
    }

    private void addContacts(int side, GroupExtended chip){
        int n = (height-4) / 6;
        int position = -((height-4) / 2);
        for (int i = 1; i <= n+1; i++) {
            Panel p1 = new Panel(3, 8, 3, Color.SILVER);
            p1.setSpecular(Color.WHITE);
            p1.setPosition((double) (width * side) /2, position, -5);
            p1.setRotate(0, 0,90);
            chip.getChildren().add(p1.getPanel());
            position += 6;
        }
    }
}
