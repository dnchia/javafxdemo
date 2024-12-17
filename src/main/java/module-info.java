module com.dnchia.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dnchia.javafxdemo to javafx.fxml;
    exports com.dnchia.javafxdemo;
}