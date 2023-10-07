package lk.ijse.mvc.controller;

/*
    @author DanujaV
    @created 10/7/23 - 3:33 PM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.mvc.model.CustomerModel;

import java.sql.SQLException;

public class CustomerFormController {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTel;

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String tel = txtTel.getText();

        try {
            boolean isSaved = CustomerModel.saveCustomer(id, name, address, tel);

            if(isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION,  "customer saved!!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR,  e.getMessage()).show();
        }

    }
}
