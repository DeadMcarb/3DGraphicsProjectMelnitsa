package Components;

import Elements.Panel;
import com.example.zero.GroupExtended;
import javafx.scene.paint.Color;

public class Body {
    int x, y, z, width, height, length, xAngle, yAngle, zAngle;
    Color color;
    GroupExtended group;
    boolean on;

    public Body(int x, int y, int z, int width, int height, int length, int xAngle, int yAngle, int zAngle, GroupExtended group, boolean on, Color color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
        this.length = length;
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
        this.group = group;
        this.on = on;
        this.color = color;
    }

    public void init() {
        // Создание графического элемента (Panel) для представления тела самолета
        Panel bodyPanel = new Panel(width, height, length, color, on);

        // Установка позиции и углов поворота
        bodyPanel.setPosition(x, y, z);
        bodyPanel.setRotate(xAngle, yAngle, zAngle);

        // Добавление в группу
        group.getChildren().add(bodyPanel.getPanel());
    }
}
