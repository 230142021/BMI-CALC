module com.example.bmicalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.bmicalc to javafx.fxml;
    exports com.example.bmicalc;
}