module org.salao {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.feira to javafx.fxml;
    exports org.feira;
}
