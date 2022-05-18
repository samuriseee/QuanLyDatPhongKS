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
import java.util.ArrayList;
import Model.Room;
/**
 *
 * @author MSII
 */
public class RoomsDAO {
    private JDBCgetConnection db;
    public RoomsDAO(){
        db = new JDBCgetConnection();
    }
    
    public ArrayList<Room> getAllRoom() throws SQLException{
        ArrayList<Room> rooms = new ArrayList<Room>();
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "Select * from Rooms";
        resultSet = stm.executeQuery(query);
        while(resultSet.next()){
            rooms.add(new Room(resultSet.getInt(1) , resultSet.getString(2) , resultSet.getDouble(3) , resultSet.getInt(4) ,resultSet.getBoolean(5)) );
        }
        return rooms;
    }
    public Room getRoomById(int idRoom) throws SQLException{
        Room room = null ;
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "Select * from Rooms where RoomNumber = '" + idRoom + "'";
        resultSet = stm.executeQuery(query);
        while(resultSet.next()){
            room = new Room(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3), resultSet.getInt(4), resultSet.getBoolean(5));
        }
        return room;
    }
    
    
    public ArrayList<Room> DeleteRoom(int roomNumber) throws SQLException {
        ArrayList<Room> rooms = new ArrayList<Room>();
        
        PreparedStatement ps = db.getConnection().prepareStatement("delete from Rooms where RoomNumber=?");
        ps.setInt(1, roomNumber);
        ps.executeUpdate();
        
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "Select * from Rooms";
        resultSet = stm.executeQuery(query);
        while(resultSet.next()){
            rooms.add(new Room(resultSet.getInt(1) , resultSet.getString(2) , resultSet.getDouble(3) , resultSet.getInt(4) ,resultSet.getBoolean(5)) );
        }
        return rooms;
    }
        
    public void addNewRoom(int roomNumber , String roomType , double rates , int numberOfBed,boolean avainable) throws SQLException{
        PreparedStatement ps = db.getConnection().prepareStatement("Insert into Rooms(roomNumber ,roomType ,rates ,numberOfBed, avainable) values(?,?,?,?,?)");
        ps.setInt(1, roomNumber);
        ps.setString(2, roomType);
        ps.setDouble(3, rates);
        ps.setInt(4,numberOfBed);
        ps.setBoolean(5, avainable);
        ps.executeUpdate();
    }
    
    public Room getRoomByRoomNumber(int roomNumber) throws SQLException {
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "Select * from Rooms where RoomNumber = '" + roomNumber + "'";
        
        resultSet = stm.executeQuery(query);
        while(resultSet.next()) {
            Room room = new Room(resultSet.getInt(1) , resultSet.getString(2) , resultSet.getDouble(3) , resultSet.getInt(4) ,resultSet.getBoolean(5)) ;
            
            return room;
        }
        return null;
    }
    
    public void updateRoom(int roomNumber , String roomType , double rates , int numberOfBed,boolean avainable, int roomOldID) throws SQLException{
        PreparedStatement ps = db.getConnection().prepareStatement("Update Rooms set roomNumber = ? ,roomType = ? ,rates = ? ,numberOfBed = ?, Avainable = ?  where roomNumber = ?");
        ps.setInt(1, roomNumber);
        ps.setString(2, roomType);
        ps.setDouble(3, rates);
        ps.setInt(4,numberOfBed);
        ps.setBoolean(5, avainable);
        ps.setInt(6,roomOldID);
        ps.executeUpdate();
    } 


}
