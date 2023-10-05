package Components;

import Elements.CylinderP;
import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;

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


        Panel middlePanel = new Panel(60, 240, 4, Color.rgb(64, 54, 52));
        middlePanel.setPosition(0, 0, 18);
        videoCard.getChildren().add(middlePanel.getPanel());

        Panel front_left_brick = new Panel(20,50, 10, Color.SADDLEBROWN);
        front_left_brick.setPosition(12, -100, 17);
        front_left_brick.setRotate(0, -10, 45);
        videoCard.getChildren().add(front_left_brick.getPanel());

        Panel front_right_brick = new Panel(20,50, 10, Color.SADDLEBROWN);
        front_right_brick.setPosition(-12, -100, 17);
        front_right_brick.setRotate(0, 10, -45);
        videoCard.getChildren().add(front_right_brick.getPanel());

        Panel topPanel = new Panel(460, 45, 10, Color.rgb(64, 54, 52));
        topPanel.setPosition(0, -115, -4);
        topPanel.setRotate(90, 0, 0);
        videoCard.getChildren().add(topPanel.getPanel());

        Panel top_left_brick = new Panel(20,54, 15, Color.SADDLEBROWN);
        top_left_brick.setPosition(33, -117, -1.6);
        top_left_brick.setRotate(80, 45,  15);
        videoCard.getChildren().add(top_left_brick.getPanel());

        Panel top_right_brick = new Panel(20,54, 15, Color.SADDLEBROWN);
        top_right_brick.setPosition(-33, -117, -1.6);
        top_right_brick.setRotate(-280, -45, -15);
        videoCard.getChildren().add(top_right_brick.getPanel());

        Panel front_left = new Panel(210, 30, 5, Color.SADDLEBROWN);
        front_left.setPosition(125, -105, 18);
        front_left.setRotate(-9,0,0);
        videoCard.getChildren().add(front_left.getPanel());

        Panel front_right = new Panel(210, 30, 5, Color.SADDLEBROWN);
        front_right.setPosition(-125, -105, 18);
        front_right.setRotate(-9,0,0);
        videoCard.getChildren().add(front_right.getPanel());

        Panel с1 = new Panel(30,80, 2, Color.SADDLEBROWN);
        с1.setPosition(40, -80, 17.5);
        с1.setRotate(0, 0, 45);
        videoCard.getChildren().add(с1.getPanel());

        Panel с2 = new Panel(30,80, 2, Color.SADDLEBROWN);
        с2.setPosition(-40, -80, 17.5);
        с2.setRotate(0, 0, -45);
        videoCard.getChildren().add(с2.getPanel());

        Panel с3 = new Panel(30,80, 2, Color.SADDLEBROWN);
        с3.setPosition(-37, 75, 17.5);
        с3.setRotate(0, 0, -145);
        videoCard.getChildren().add(с3.getPanel());

        Panel с4 = new Panel(30,80, 2, Color.SADDLEBROWN);
        с4.setPosition(37, 75, 17.5);
        с4.setRotate(0, 0, 145);
        videoCard.getChildren().add(с4.getPanel());

        Panel bottomPanel = new Panel(460, 45, 10, Color.rgb(64, 54, 52));
        bottomPanel.setPosition(0, 115, -4);
        bottomPanel.setRotate(90, 0, 0);
        videoCard.getChildren().add(bottomPanel.getPanel());

        Panel front_left_bottom = new Panel(210, 30, 5, Color.SADDLEBROWN);
        front_left_bottom.setPosition(125, 105, 18);
        front_left_bottom.setRotate(9,0,0);
        videoCard.getChildren().add(front_left_bottom.getPanel());

        Panel front_right_bottom = new Panel(210, 30, 5, Color.SADDLEBROWN);
        front_right_bottom.setPosition(-125, 105, 18);
        front_right_bottom.setRotate(9,0,0);
        videoCard.getChildren().add(front_right_bottom.getPanel());

        Panel front_left_brick_bottom = new Panel(20,50, 10, Color.SADDLEBROWN);
        front_left_brick_bottom.setPosition(12, 100, 17);
        front_left_brick_bottom.setRotate(0, -10, 145);
        videoCard.getChildren().add(front_left_brick_bottom.getPanel());

        Panel front_right_brick_bottom = new Panel(20,50, 10, Color.SADDLEBROWN);
        front_right_brick_bottom.setPosition(-12, 100, 17);
        front_right_brick_bottom.setRotate(0, 10, -145);
        videoCard.getChildren().add(front_right_brick_bottom.getPanel());

        Panel bottom_left_brick = new Panel(20,54, 15, Color.SADDLEBROWN);
        bottom_left_brick.setPosition(28, 117, -2.5);
        bottom_left_brick.setRotate(100, 145,  -15);
        videoCard.getChildren().add(bottom_left_brick.getPanel());

//        Panel top_right_brick = new Panel(20,54, 15, Color.SADDLEBROWN);
//        top_right_brick.setPosition(-33, -117, -1.6);
//        top_right_brick.setRotate(-280, -45, -15);
//        videoCard.getChildren().add(top_right_brick.getPanel());

        Panel bottom_right_brick = new Panel(20,54, 15, Color.SADDLEBROWN);
        bottom_right_brick.setPosition(-28, 117, -2.5);
        bottom_right_brick.setRotate(-80, -35, 15);
        videoCard.getChildren().add(bottom_right_brick.getPanel());

        CylinderP front_line = new CylinderP(2, 205, Color.SADDLEBROWN);
        front_line.setPosition(0, 0, 19);
        videoCard.getChildren().add(front_line.getCylinder());

        group.getChildren().add(videoCard);
    }
}
