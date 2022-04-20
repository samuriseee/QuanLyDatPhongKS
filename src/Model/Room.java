/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MSII
 */
public class Room {
    private int roomNumber , numberOfBed ;
    private String roomType ,rates;

    public Room(int roomNumber , String roomType , String rates , int numberOfBed) {
        this.roomNumber = roomNumber ;
        this.roomType = roomType ;
        this.rates = rates;
        this.numberOfBed = numberOfBed ;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public String getRates() {
        return rates;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }
    
    
}
