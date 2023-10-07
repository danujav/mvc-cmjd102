package lk.ijse.mvc.model;

/*
    @author DanujaV
    @created 10/7/23 - 4:00 PM   
*/

import lk.ijse.mvc.db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerModel {
    public static boolean saveCustomer(String id, String name, String address, String tel) throws SQLException {
        Connection con = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO customer VALUES(?, ?, ?, ?)";

        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, id);
        pstm.setString(2, name);
        pstm.setString(3, address);
        pstm.setString(4, tel);

        return pstm.executeUpdate() > 0;
    }
}
