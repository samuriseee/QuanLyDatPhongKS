/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author MSII
 */
public class JDBCgetConnection {
    public Connection getConnection(){
        var sever = "NameYourComputer\\SQL2019";
        var user = "sa";
        var password = "....";
        var db = "Name Database";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(sever);
        ds.setPortNumber(port);
        Connection conn = null;
        try {
             conn = ds.getConnection();
        } catch (SQLException ex) {
        }
        return conn;
    }
}
