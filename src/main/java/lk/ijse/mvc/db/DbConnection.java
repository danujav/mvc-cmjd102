package lk.ijse.mvc.db;

/*
    @author DanujaV
    @created 10/7/23 - 3:57 PM   
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection;
    private static Connection con;

    private static final String URL = "jdbc:mysql://localhost:3306/kade";

    private DbConnection() throws SQLException {
        con = DriverManager.getConnection(URL, "root", "Danu25412541@");
    }

    public static DbConnection getInstance() throws SQLException {
        return (null == dbConnection) ? dbConnection = new DbConnection() : dbConnection;
    }

    public Connection getConnection() {
        return con;
    }
}
