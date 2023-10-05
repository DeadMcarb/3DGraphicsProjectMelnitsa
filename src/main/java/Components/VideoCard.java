package Components;

import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;

public class VideoCard {

    int x, y, z, speed, xAngle, yAngle, zAngle;
    GroupExtended group;
    boolean on;


    public VideoCard(int x, int y, int z, int speed, int xAngle, int yAngle, int zAngle, GroupExtended group, boolean on) {
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

    public void init(){
        GroupExtended videoCard = new GroupExtended();
        Cooler cooler = new Cooler(-122,0,0, 100, speed, 0,0,0, videoCard, on);
        Cooler cooler2 = new Cooler(122,0,0, 100, speed, 0,0,0, videoCard, on);
        cooler.init();
        cooler2.init();
        Panel middlePanel = new Panel(60, 244, 2, Color.rgb(64, 54, 52));
        middlePanel.setPosition(0, 0, 17);
        videoCard.getChildren().add(middlePanel.getPanel());
        group.getChildren().add(videoCard);
    }
}
