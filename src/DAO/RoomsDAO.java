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
    PreparedStatement ps;
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
    public ArrayList<Room> searchRoomsByString(String s) throws SQLException{
        ArrayList<Room> rooms = new ArrayList<Room>();
        Statement stm = db.getConnection().createStatement();
        ResultSet resultSet = null;
        String query = "Select * from Rooms where RoomType like '%"+s+"%'";
        resultSet = stm.executeQuery(query);
        while(resultSet.next()){
            rooms.add(new Room(resultSet.getInt(1) , resultSet.getString(2) , resultSet.getDouble(3) , resultSet.getInt(4) ,resultSet.getBoolean(5)) );
        }
        return rooms;
    }
    public void deleteRoom(int id) throws SQLException{
        ArrayList<Room> rooms = new ArrayList<Room>();
        PreparedStatement ps = db.getConnection().prepareStatement("Delete from Rooms where RoomNumber = ?");
        ps.setInt(1, id);
        int rs = ps.executeUpdate();
        if(rs == 1)
            System.out.println("Delete successful");
        else
            System.out.println("Error");
    }
    /*
    
        This package is for interaction with database !!

        write logic , method ... interactive with database in here ^^
    
    */
}
