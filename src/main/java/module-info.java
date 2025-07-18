module dk.easv.librarysystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.librarysystem to javafx.fxml;
    exports dk.easv.librarysystem;
}