package lk.ijse.mvc.controller;

/*
    @author DanujaV
    @created 10/7/23 - 4:56 PM   
*/
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.mvc.dto.ItemDTO;
import lk.ijse.mvc.model.ItemModel;

import java.sql.SQLException;

public class ItemFormController {
    @FXML
    private TextField txtCode;

    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtQtyOnHand;

    @FXML
    private TextField txtUnitPrice;

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String code = txtCode.getText();
        String description = txtDescription.getText();
        int qtyOnHand = Integer.parseInt(txtQtyOnHand.getText());
        double unitPrice = Double.parseDouble(txtUnitPrice.getText());

        var dto = new ItemDTO(code, description, qtyOnHand, unitPrice);

        try {
            boolean isSaved = ItemModel.saveItem(dto);
            if(isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION, "Item Saved!!!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }
}
