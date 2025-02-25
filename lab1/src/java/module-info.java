module ubb.scs.map.lab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ubb.scs.map.lab1 to javafx.fxml;
    exports ubb.scs.map.lab1;
}