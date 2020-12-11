module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens view to javafx.fxml;
    exports view;

    opens controllers to javafx.fxml;
    exports controllers;

    opens controllers.nhanKhauController to javafx.fxml;
    exports controllers.nhanKhauController;

    opens controllers.hoKhauController to javafx.fxml;
    exports controllers.hoKhauController;

    opens controllers.covidController to javafx.fxml;
    exports controllers.covidController;

    opens models to javafx.base;
    exports models;
}