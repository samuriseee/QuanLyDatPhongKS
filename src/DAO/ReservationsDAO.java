/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.*;
import java.util.ArrayList;
/**
 *
 * @author MSII
 */
public class ReservationsDAO {
    private JDBCgetConnection db;
    public ReservationsDAO(){
        db = new JDBCgetConnection();
    }
    /*
    
        This package is for interaction with database !!

        write logic , method ... interactive with database in here ^^
    
    */
    public ArrayList<Reservation> getReservationById(int idUser) throws SQLException{
        ArrayList<Reservation> arrReservations_thanhHung155 = new ArrayList<Reservation>(); ;
        Reservation reservation ;
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "select * from Reservation where CustomerId = '" + idUser + "'";
        System.out.println(query);
        resultSet = stm.executeQuery(query);
        
        while (resultSet.next()) {
            reservation = new Reservation(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getString(7));
            arrReservations_thanhHung155.add(reservation);
        }
        return arrReservations_thanhHung155;
    }
    public ArrayList<Reservation> getAllReservation() throws SQLException{
        ArrayList<Reservation> arrReservations_thanhHung155 = new ArrayList<Reservation>(); ;
        Reservation reservation ;
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "select * from Reservation";
        System.out.println(query);
        resultSet = stm.executeQuery(query);
        
        while (resultSet.next()) {
            reservation = new Reservation(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getString(7));
            arrReservations_thanhHung155.add(reservation);
        }
        return arrReservations_thanhHung155;
    }
}
