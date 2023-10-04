module com.example.zero {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens com.example.zero to javafx.fxml;
    exports com.example.zero;
}