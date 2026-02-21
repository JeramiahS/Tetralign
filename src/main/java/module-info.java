module org.nexus.tetralign {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.nexus.tetralign to javafx.fxml;
    exports org.nexus.tetralign;
}