package lk.ijse.mvc.controller;

/*
    @author DanujaV
    @created 10/7/23 - 3:33 PM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.mvc.dto.CustomerDTO;
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
        clearFields();
    }

    private void clearFields() {
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtTel.setText("");
    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String tel = txtTel.getText();

        var dto = new CustomerDTO(id, name, address, tel);

        try {
            boolean isSaved = CustomerModel.saveCustomer(dto);

            if(isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION,  "customer saved!!").show();
                clearFields();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR,  e.getMessage()).show();
        }

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String tel = txtTel.getText();

        var dto = new CustomerDTO(id, name, address, tel);

        try {
            boolean isUpdated = CustomerModel.updateCustomer(dto);

            if(isUpdated) {
                new Alert(Alert.AlertType.CONFIRMATION, "customer updated!!!").show();
                clearFields();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }
}
