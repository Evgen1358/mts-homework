module ru.mts.certmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    opens ru.mts.certmanager to javafx.fxml;
    exports ru.mts.certmanager;
}