module com.empresa.datastructures019 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.datastructures019 to javafx.fxml;
    exports com.empresa.datastructures019;
}