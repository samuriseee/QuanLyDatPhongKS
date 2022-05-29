/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;
import Model.Room;
/**
 *
 * @author MSII
 */
public class ListRoom {
    private ArrayList<Room> arrListRoom = new ArrayList<Room>();
    
    public ListRoom(ArrayList<Room> listRoom){
        this.arrListRoom = listRoom;
    }

    public ArrayList<Room> getArrListRoom() {
        return arrListRoom;
    }

    public void setArrListRoom(ArrayList<Room> arrListRoom) {
        this.arrListRoom = arrListRoom;
    }
    
    
}
