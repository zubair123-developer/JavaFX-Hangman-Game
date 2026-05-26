module com.library.javafxcontrols {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.library.javafxcontrols to javafx.fxml;
    exports com.library.javafxcontrols;
}