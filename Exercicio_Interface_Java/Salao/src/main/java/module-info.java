module org.salao {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.salao to javafx.fxml;
    exports org.salao;
}
