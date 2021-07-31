
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 *
 * @author Rui
 */
public class MainUIController implements Initializable {
    
    @FXML
    private HBox parent;
    @FXML
    private Pane contentArea;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void closeApp(MouseEvent event) {
    }

    @FXML
    private void minimizeApp(MouseEvent event) {
    }

    @FXML
    private void openHome(ActionEvent event) {
    }

    @FXML
    private void openEatIn(ActionEvent event) {
    }

    @FXML
    private void openDelivery(ActionEvent event) {
    }

    @FXML
    private void openDeliveryRent(ActionEvent event) {
    }

    @FXML
    private void openCustomers(ActionEvent event) {
    }
    
}
