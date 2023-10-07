package lk.ijse.mvc.model;

/*
    @author DanujaV
    @created 10/7/23 - 5:02 PM   
*/

import lk.ijse.mvc.db.DbConnection;
import lk.ijse.mvc.dto.ItemDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemModel {
    public static boolean saveItem(ItemDTO dto) throws SQLException {
        Connection con = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?, ?, ?, ?)";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, dto.getCode());
        pstm.setString(2, dto.getDescription());
        pstm.setInt(3, dto.getQtyOnHand());
        pstm.setDouble(4, dto.getUnitPrice());

        return pstm.executeUpdate() > 0;
    }
}
