package lk.ijse.mvc.model;

/*
    @author DanujaV
    @created 10/7/23 - 4:00 PM   
*/

import lk.ijse.mvc.db.DbConnection;
import lk.ijse.mvc.dto.CustomerDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerModel {
    public static boolean saveCustomer(CustomerDTO dto) throws SQLException {
        Connection con = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO customer VALUES(?, ?, ?, ?)";

        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, dto.getId());
        pstm.setString(2, dto.getName());
        pstm.setString(3, dto.getAddress());
        pstm.setString(4, dto.getTel());

        return pstm.executeUpdate() > 0;
    }
}
