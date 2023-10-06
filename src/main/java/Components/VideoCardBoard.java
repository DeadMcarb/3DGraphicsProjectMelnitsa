package Components;

import Elements.Panel;
import RadioComponents.Chip;
import com.example.zero.GroupExtended;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class VideoCardBoard {
    int x, y, z, xAngle, yAngle, zAngle;
    GroupExtended group;

    public VideoCardBoard(int x, int y, int z, int xAngle, int yAngle, int zAngle, GroupExtended group) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
        this.group = group;
    }

    public void init(){
        GroupExtended videoCardBoard = new GroupExtended();

        Panel board = new Panel(500, 240, 8, Color.rgb(64, 54, 52));
        videoCardBoard.getChildren().add(board.getPanel());

        Panel  pci = new Panel(190, 50, 8, Color.rgb(64, 54, 52));
        pci.setPosition(60, 120, 0);
        videoCardBoard.getChildren().add(pci.getPanel());

        int width = 190;
        int position = -((width-4) / 2) + 63;
        for (int i = 1; i <= 16; i++) {
            Panel p1 = new Panel(14, 7, 6, Color.GOLD);
            p1.setSpecular(Color.GOLD);
            p1.setPosition(position, 139, 2);
            p1.setRotate(0, 0,90);
            videoCardBoard.getChildren().add(p1.getPanel());
            position += 12;
        }

        Chip chipset = new Chip(0, 110, 7, 30, 30, 0, 0, 0, videoCardBoard);
        chipset.init();
        Chip chipset2 = new Chip(50, 110, 7, 30, 30, 0, 0, 0, videoCardBoard);
        chipset2.init();
        Chip chipset3 = new Chip(100, 110, 7, 30, 30, 0, 0, 0, videoCardBoard);
        chipset3.init();

        Panel left_plane = new Panel(70, 270, 10, Color.rgb(228, 228, 228));
        left_plane.setSpecular(Color.WHITE);
        left_plane.setPosition(253, 0, 30);
        left_plane.setRotate(0, 90,0);
        videoCardBoard.getChildren().add(left_plane.getPanel());

        Panel top_left_plane = new Panel(50, 70, 5, Color.rgb(228, 228, 228));
        top_left_plane.setSpecular(Color.WHITE);
        top_left_plane.setPosition(273, -135, 30);
        top_left_plane.setRotate(90, 0,0);
        videoCardBoard.getChildren().add(top_left_plane.getPanel());

        videoCardBoard.translateXProperty().set(x);
        videoCardBoard.translateYProperty().set(y);
        videoCardBoard.translateZProperty().set(z);

        videoCardBoard.getTransforms().add(new Rotate(xAngle, Rotate.X_AXIS));
        videoCardBoard.getTransforms().add(new Rotate(yAngle, Rotate.Y_AXIS));
        videoCardBoard.getTransforms().add(new Rotate(zAngle, Rotate.Z_AXIS));

        group.getChildren().add(videoCardBoard);
    }
}
