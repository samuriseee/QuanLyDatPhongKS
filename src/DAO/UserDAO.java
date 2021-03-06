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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MSII
 */
public class UserDAO {

    private JDBCgetConnection db;

    public UserDAO() {
        db = new JDBCgetConnection();
    }

    /*
    
        This package is for interaction with database !!

        write logic , method ... interactive with database in here ^^
    
     */
    public void addUser(String firstName , String lastName , String phoneNumber , String email , String passWord){
        PreparedStatement ps;
        try {
            ps = db.getConnection().prepareStatement("Insert into _User(FirstName , lastName ,PhoneNumber ,email ,passwordd) values(?,?,?,?,?)");
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, phoneNumber);
            ps.setString(4, email);
            ps.setString(5, passWord);
            int rs = ps.executeUpdate();
            if(rs == 1)
                System.out.println("Insert successful");
            else
                System.out.println("ERROR");
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void deleteUser(int id){
        System.out.println(id);
        try{
            PreparedStatement ps = db.getConnection().prepareStatement("Delete from _User where UserId = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        catch(Exception e){}
    }
    public User getUser(String email) throws SQLException {
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "select * from _User where email = '" + email + "'";
        System.out.println(query);
        resultSet = stm.executeQuery(query);
        User user = null;
        while (resultSet.next()) {
            user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
        }
        return user;
    }

    public void register(String idRole, String FirstName, String lastName, String PhoneNumber, String email, String passwordd) throws SQLException {
        PreparedStatement ps = db.getConnection().prepareStatement("Insert into _User(idRole, FirstName,lastName,"
                + "PhoneNumber ,email ,passwordd) values(?,?,?,?,?,?)");
        ps.setString(1, idRole);
        ps.setString(2, FirstName);
        ps.setString(3, lastName);
        ps.setString(4, PhoneNumber);
        ps.setString(5, email);
        ps.setString(6, passwordd);

        ps.executeUpdate();
    }

    public void bookingRom(int customerId, int roomNumber, String checkInDate, int numberOfGuests, String reservationDate) throws SQLException {
        PreparedStatement ps = db.getConnection().prepareStatement("set dateformat dmy Insert into Reservation(CustomerId, RoomsNumber,CheckInDate,"
                + "NumberOfGuests ,ReservationDate ) values(?,?,?,?,?)");
        ps.setInt(1, customerId);
        ps.setInt(2, roomNumber);
        ps.setString(3, checkInDate);
        ps.setInt(4, numberOfGuests);
        ps.setString(5, reservationDate);
        ps.executeUpdate();
        
        ps = db.getConnection().prepareStatement("update Rooms\n"
                + "set Avainable = ?\n"
                + "where RoomNumber = ?");
        ps.setInt(1, 0);
        ps.setInt(2, roomNumber);
        ps.executeUpdate();
    }
    public User getUserById(int idUser) throws SQLException{
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "select * from _User where UserId = '" + idUser + "'";
        System.out.println(query);
        resultSet = stm.executeQuery(query);
        User user = null;
        while(resultSet.next()){
            user = new User(resultSet.getInt(1) , resultSet.getString(2),resultSet.getString(3) , resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7));
        }
        return user;
    }
    
    public ArrayList<User> getAllUser() throws SQLException{
        ArrayList<User> users = new ArrayList<User>();
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "Select * from _User where idRole = 'DFUser'";
        resultSet = stm.executeQuery(query);
        while(resultSet.next()){
            users.add(new User(resultSet.getInt(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) ,resultSet.getString(5) ,resultSet.getString(6) ,resultSet.getString(7)) );
        }
        return users;
    }

}
