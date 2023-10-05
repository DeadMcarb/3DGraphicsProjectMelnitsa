module com.example.zero {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.zero to javafx.fxml;
    exports com.example.zero;
}