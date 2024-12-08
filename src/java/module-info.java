module org.aqjs.tbi {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.aqjs1.tbi to javafx.fxml;
    exports org.aqjs1.tbi;
}