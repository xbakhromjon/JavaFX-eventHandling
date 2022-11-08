module uz.bakhromjon.javafxeventhandling {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxeventhandling to javafx.fxml;
    exports uz.bakhromjon.javafxeventhandling;
}