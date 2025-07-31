package dk.easv.librarysystem.GUI;
// Other Imports
import io.github.palexdev.materialfx.controls.MFXTextField;
// JavaFX Imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class CheckOutController {
    @FXML
    private MFXTextField txtTitle;
    @FXML
    private MFXTextField txtAuthor;
    @FXML
    private MFXTextField txtIsbn;
    @FXML
    private MFXTextField txtFName;
    @FXML
    private MFXTextField txtLName;

    @FXML
    private void btnCheckOut(ActionEvent actionEvent) {
    }
}
