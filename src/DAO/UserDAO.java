/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.*;
/**
 *
 * @author MSII
 */
public class UserDAO {
    private JDBCgetConnection db;
    public UserDAO(){
        db = new JDBCgetConnection();
    }
    /*
    
        This package is for interaction with database !!

        write logic , method ... interactive with database in here ^^
    
    */
    
    public User getUser(String email) throws SQLException{
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "select * from _User where email = '" + email + "'";
        System.out.println(query);
        resultSet = stm.executeQuery(query);
        User user = null;
        while(resultSet.next()){
            user = new User(resultSet.getInt(1) , resultSet.getString(2),resultSet.getString(3) , resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7));
        }
        return user;
    }
    
    public void register(String idRole , String FirstName , String lastName ,String PhoneNumber ,String email ,String passwordd) throws SQLException{
        PreparedStatement ps = db.getConnection().prepareStatement("Insert into _User(idRole, FirstName,lastName,PhoneNumber ,email ,passwordd) values(?,?,?,?,?,?)");
        ps.setString(1, idRole);
        ps.setString(2, FirstName);        
        ps.setString(3, lastName);
        ps.setString(4, PhoneNumber);
        ps.setString(5, email);
        ps.setString(6, passwordd);

        ps.executeUpdate();
    }
    
}
