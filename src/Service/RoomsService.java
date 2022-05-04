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
    /*
        write the logic you want to do with the data returned from the server ^^
    */
}
