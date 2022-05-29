/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.*;
import Model.Room;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author MSII
 */
public class RoomsService {
    private RoomsDAO roomsDao;
    public RoomsService(){
        roomsDao = new RoomsDAO();
    }
     public ArrayList<Room> getAllRooms() throws SQLException{
        return roomsDao.getAllRoom();
    }
    public void addNewRoom(int roomNumber , String roomType , double rates , int numberOfBed,boolean avaiable) throws SQLException {
        roomsDao.addNewRoom(roomNumber, roomType, rates, numberOfBed,avaiable);
    }
    public void updateRoom(int roomNumber , String roomType , double rates , int numberOfBed, boolean avaiable, int roomOldID) throws SQLException {
        roomsDao.updateRoom(roomNumber, roomType, rates, numberOfBed,avaiable,roomOldID);
    }
    public Room getRoomByRoomNumber(int roomNumber) throws SQLException {
        return roomsDao.getRoomByRoomNumber(roomNumber);
    }
    public void DeleteRoom(int roomNumber) throws SQLException {
        roomsDao.DeleteRoom(roomNumber);
    }
    public void updateRoomById(int id_thanhHung155) throws SQLException{
        roomsDao.updateRoomById(id_thanhHung155);
    }
}
